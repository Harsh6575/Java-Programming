public class QuickSort {

    public static int partition(int arr[],int si, int ei){
        int pivot=arr[ei];
        int i=si-1;
        for (int  j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;

                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[ei]=temp;
        return i;
    }

    public static void quickSort(int arr[],int si, int ei){
        if(si<ei){
            int pid = partition(arr,si,ei);
            quickSort(arr,si,pid-1);
            quickSort(arr,pid+1,ei);
        }
    }
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 7, 3, 2};

        int n = arr.length;

        System.out.println("Merge sort");

        System.out.println("Before Sorting");

        PrintArr(arr);
        quickSort(arr,0,n-1);

        System.out.println("After Sorting");

        PrintArr(arr);
    }
}
