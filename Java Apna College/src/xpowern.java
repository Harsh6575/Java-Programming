import java.util.Scanner;

public class xpowern {
    public static int power(int x, int n){
        if (n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xpow1 = power(x,n-1);
        int xpow=x*xpow1;
        return xpow;
    } // complexity n

    // log n complexity

    public static int lognpower(int x, int n){
        if(n==0){
            return 1;
        }

        if(x==0){
            return 0;
        }

        if(n%2==0){
            return lognpower(x,n/2) * lognpower(x,n/2);
        }
        else {
            return lognpower(x,n/2) * lognpower(x,n/2) * x;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of X:");
        int x = sc.nextInt();
        System.out.print("Enter value of N:");
        int n=sc.nextInt();

        int ans=power(x,n);
        System.out.print(ans);

        int ans2=lognpower(x,n);
        System.out.print("\nWith log n "+ans2);
    }
}