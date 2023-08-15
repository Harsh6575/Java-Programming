public class InsertionSort {
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String argss[]) {
        int arr[] = {1, 9, 8, 7, 3, 2};

        System.out.println("Insertion sort");

        System.out.println("Before Sorting");

        PrintArr(arr);

        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=current;
        }

        System.out.println("After Sorting");

        PrintArr(arr);
    }
}
