import java.util.ArrayList;
import java.util.Scanner;

public class SubsetOfN {

    //this problem is printing all subset of a set of first n natural number

    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubset(int n,ArrayList<Integer> subset){

        if(n==0){
            printSubset(subset);
            return;
        }

        //add
        subset.add(n);
        findSubset(n-1,subset);

        //don't add
        subset.remove(subset.size()-1);
        findSubset(n-1,subset);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n=sc.nextInt();
        sc.close();

        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n,subset);
    }
}
