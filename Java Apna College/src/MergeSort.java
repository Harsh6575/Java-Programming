public class MergeSort {

    public static void conquer(int[] arr,int si, int mid,int ei){
        int[] merged = new int[ei-si+1];

        int ind1=si;
        int ind2=mid+1;
        int x=0;

        while (ind1<=mid && ind2<=ei){
            if(arr[ind1]<arr[ind2]){
                merged[x++]=arr[ind1++];
            }
            else {
                merged[x++]=arr[ind2++];
            }
        }

        while (ind1<=mid){
            merged[x++]=arr[ind1++];
        }

        while (ind2<=ei){
            merged[x++]=arr[ind2++];
        }

        for (int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    public static void divide(int[] arr,int si, int ei){

        if(si>=ei){
            return;
        }

        int mid=si+ (ei-si)/2;

        divide(arr,si,mid);
        divide(arr,mid+1,ei);

        conquer(arr,si,mid,ei);
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

        divide(arr,0,n-1);

        System.out.println("After Sorting");

        PrintArr(arr);
    }
}
