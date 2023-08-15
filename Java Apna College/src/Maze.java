import java.util.Scanner;

public class Maze {

    public static int countPaths(int i, int j, int n, int m){

        if(i==n || j==m){
            return 0;
        }

        if(i==n-1 && j==m-1){
            return 1;
        }

        //Downwords
        int downPaths= countPaths(i+1,j,n,m);

        //Right
        int rightPaths=countPaths(i,j+1,n,m);

        return downPaths+rightPaths;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N : ");
        int n=sc.nextInt();

        System.out.print("Enter value of M : ");
        int m =sc.nextInt();
        sc.close();

        int count = countPaths(0,0,n,m);
        System.out.print(count);
    }
}
