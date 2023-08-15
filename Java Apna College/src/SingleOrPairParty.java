import java.util.Scanner;

public class SingleOrPairParty {
    public static int callGuest(int n){

        if(n<=1){
            return 1;
        }

        //single
        int sin=callGuest(n-1);

        //pair
        int pair=(n-1)*callGuest(n-2);

        return sin+pair;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Guest g : ");
        int g = sc.nextInt();
        sc.close();
        int result = callGuest(g);
        System.out.println(result);
    }
}
