public class BubbleSort {

    public static void Print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,9,8,7,2};
        System.out.println("\nBubble Sort");
        System.out.println("Elements in array:= ");

        // Printing array
        Print(arr);

        //Sorting array
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting");
        //Printing Array
        Print(arr);
    }
}
