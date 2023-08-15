import java.util.Scanner;

public class AllSubsequanceOfString {
    public static void SubSequances(String str, int index,String newStr){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        char curChar = str.charAt(index);
        SubSequances(str,index+1,newStr+curChar);

        SubSequances(str,index+1,newStr);
    }
    public static void main(String[] args) {
//        String str="abc";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string in which you want to find subsequence : ");
        String str = sc.nextLine();
        sc.close();
        SubSequances(str,0,"");
    }
}
