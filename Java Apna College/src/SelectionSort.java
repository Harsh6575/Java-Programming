public class SelectionSort {

    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String argss[]){
        int arr[]={1,9,8,7,3,2};

        System.out.println("Selection sort");

        System.out.println("Before Sorting");

        PrintArr(arr);

        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
        }

        System.out.println("After Sorting");

        PrintArr(arr);
    }
}
