import java.util.Scanner;

public class FibonacciRecursion {
    public static void Fibonacci(int a,int b, int n){

        if(n==0){
            return;
        }

        int c = a+b;

        System.out.print(c+" ");

        Fibonacci(b,c,n-1);
    }
    public static void main(String args[]){
        int a=0,b=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n= ");
        int n=sc.nextInt();
        sc.close();
        System.out.print(a+" ");
        System.out.print(b+" ");
        Fibonacci(a,b,n-2);
    }
}