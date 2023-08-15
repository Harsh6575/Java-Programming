import java.util.Scanner;

public class ArrayIsSortedOrNot {
    public static boolean isSorted(int arr[],int index){

        if(index==arr.length-1){
            return true;
        }

        if(arr[index]<arr[index+1]){
            return isSorted(arr,index+1);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = sc.nextInt();

        int arr[]=new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean ans = isSorted(arr,0);
        System.out.println("Array is Sorted : "+ans);

    }
}
