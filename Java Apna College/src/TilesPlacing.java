import java.util.Scanner;

public class TilesPlacing {

    public static int placeTiles(int n,int m){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertical
        int verPlace=placeTiles(n-m,m);

        //horizontal
        int horPlace=placeTiles(n-1,m);

        return verPlace+horPlace;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N : ");
        int n = sc.nextInt();

        System.out.print("Enter value of M : ");
        int m =sc.nextInt();
        sc.close();

        int res=placeTiles(n,m);
        System.out.println(res);
    }
}
