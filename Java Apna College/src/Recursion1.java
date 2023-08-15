import java.util.Scanner;

public class Recursion1 {

    public static void printNumInc(int k,int n){
        if(k==n+1){
            return;
        }
        System.out.println(k);
        printNumInc(k+1,n);
    }

    public static void printNumDec(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printNumDec(n-1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int k =1;
        printNumInc(k,n);
        System.out.println();
        printNumDec(n);
    }
}
