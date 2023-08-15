import java.util.Scanner;

public class ReverseStringRecursion {

    public static void RevString(String str, int index){
        if(index==0){
             System.out.print(str.charAt(index));
             return;
        }
         System.out.print(str.charAt(index));
         RevString(str,index-1);
    }

    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A string: ");
        String str = sc.nextLine();
        sc.close();

        RevString(str,str.length()-1);
    }
}
