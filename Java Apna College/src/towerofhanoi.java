import java.util.Scanner;

public class towerofhanoi {
    public static void towerOfHanoi(int n , String source, String helper, String destination){

        if(n==1){
            System.out.print("Transferring disk "+ n + " from " + source + " to " + destination + "\n");
            return;
        }

        towerOfHanoi(n-1,source,destination,helper);
        System.out.print("Transferring disk "+ n + " from " + source + " to " + destination + "\n");
        towerOfHanoi(n-1, helper,source,destination);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of tower: ");
        int n = sc.nextInt();

        sc.close();

        towerOfHanoi(n,"s","h","d");
    }
}
