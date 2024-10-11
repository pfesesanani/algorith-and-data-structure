import java.util.Scanner;

public class sorting {

    //This method is for the selection sort
    public static void selection(int arr[]){

        //These lines of code display the elements that will be sorted and the sorting steps
        System.out.println("Elements to be sorted:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        System.out.println("Sorting steps:");

        //This is the sorting algorithm
        for (int i = 0; i <= arr.length - 1; i++) {
            int minIndex = i;

            for(int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            //This line shows the transformation of the array after each step
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + ", ");
            }

            System.out.println();

        }

        //These lines show the final sorted array
        System.out.println("The final sorted elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
        System.out.println();

    }

    //This method is for the insertion sort
    public static void insertion(int arr[]) {

        //These lines of code display the elements that will be sorted and the sorting steps
        System.out.println("Elements to be sorted:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        System.out.println("Sorting steps:");

        //This is the sorting algorithm
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = temp;

            //This line shows the transformation of the array after each step
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + ", ");
            }

            System.out.println();

        }

        //These lines show the final sorted array
        System.out.println("The final sorted elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
        System.out.println();
        
    }

    //This method is for the bubble sort
    public static void bubble(int arr[]) {

        //These lines of code display the elements that will be sorted and the sorting steps
        System.out.println("Elements to be sorted:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        System.out.println("Sorting steps:");

        //This is the sorting algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            //This line shows the transformation of the array after each step
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + ", ");
            }

            System.out.println();

        }

        //These lines show the final sorted array
        System.out.println("The final sorted elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();
        System.out.println();
        
    }

    //This method is for the quick sort
    public static void quick(int arr[], int low, int high) {

        //This calls the partition method
        if (low < high) {
            int pi = partition(arr, low, high);

            quick(arr, low, pi - 1);

            quick(arr, pi + 1, high);
        }
        
    }

    private static int partition(int arr[], int low, int high){

        //These lines of code display the elements that will be sorted and the sorting steps

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        int pivot = arr[high];
        int i = low - 1;

        //This is the sorting algorithm
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i = i + 1;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }

        }

        //This swaps the elements
        int temp = arr[high];
        arr[high] = arr[i + 1];
        arr[i + 1] = temp;

        return i + 1;

    }

    //This method is for the merge sort
    public static void merge_sort(int arr[]) {

        if (arr.length <= 1) {
            return;
        }

        //These lines of code display the elements that will be sorted and the sorting steps

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        //These lines divide the array into two smaller arrays
        int mid = arr.length / 2;

        int left[] = new int[mid];
        int right[] = new int[arr.length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        merge_sort(left);
        merge_sort(right);

        //This line combines the arrays into 1 final array
        merge(arr, left, right);

        

    }

    private static void merge(int arr[], int left[], int right[]){
        int i = 0, j = 0, k = 0;

        //These 3 loops sort the smaller arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) {
            arr[k++] = left[i++];
        }

        while (j < right.length) {
            arr[k++] = right[j++];
        }

    }

    //This is the main method
    public static void main(String[] args) {
        //This is a scanner object to take user inputs
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 elements");

        int n = 10;

        int arr[] = new int[n];

        //This line takes user input and stores it in an array
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            
        }

            

        //These lines show instuctions to the user
            System.out.println("Which sorting method would you like to use?");
            System.out.println();
            System.out.println("Press the number that corresponds to your selection");
            
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Selection Sort");
            System.out.println("4. Quick Sort");
            System.out.println("5. Merge Sort");

            int choice = input.nextInt();

            //These lines call the different sorting algorithms
            switch (choice) {
                case 1:
                bubble(arr);
                    break;
                
                case 2:
                insertion(arr);
                    break;
            
                 case 3:
                 selection(arr);
                    break;

                case 4:
                
                //These lines of code display the elements that will be sorted and the sorting steps
                System.out.println("Elements to be sorted:");

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + ", ");
                }

                System.out.println();

                System.out.println("Sorting steps:");
                
                int low = 0;
                int high = arr.length - 1;
                quick(arr, low, high);
                
                //These lines show the final sorted array
                System.out.println("The final sorted elements:");

                for (int k = 0; k < arr.length; k++) {
                    System.out.print(arr[k] + ", ");
                }

                System.out.println();
                System.out.println();
                
                   break;

                case 5:
                
                //These lines of code display the elements that will be sorted and the sorting steps
                System.out.println("Elements to be sorted:");

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + ", ");
                }

                System.out.println();

                System.out.println("Sorting steps:");
                
                merge_sort(arr);
                
                //These lines show the final sorted array
                System.out.println("The final sorted elements:");

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + ", ");
                }

                System.out.println();
                System.out.println();
                
                    break;

                default:
                System.out.println("Invalid choice");
                    break;
            }

    }
}