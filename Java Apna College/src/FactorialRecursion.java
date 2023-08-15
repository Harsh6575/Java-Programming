import java.util.Scanner;

public class FactorialRecursion {
    public static int Factorial(int n){
        if(n==1 || n==0){
            return 1;
        }

        int fact = Factorial(n-1);
        return n * fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for which you want to find factorial n= ");
        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }
}
