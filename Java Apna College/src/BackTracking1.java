import java.util.Scanner;

public class BackTracking1 {

    public static void printPermutaion(String str, String per, int index){
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutaion(newStr,per+curChar,index+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : " );
        String s = sc.nextLine();
        sc.close();
        printPermutaion(s,"",0);
    }
}