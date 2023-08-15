import java.util.Scanner;

public class moveAllX {
    public static void MoveAllCharToLast(String str, int index, int count, String newStr,char ch) {
        if(index==str.length()){
            for (int i=0;i<count;i++){
                newStr+=ch;
            }
            System.out.println(newStr);
            return;
        }
        char currchar = str.charAt(index);
        if(currchar == ch){
            count++;
            MoveAllCharToLast(str,index+1,count,newStr,ch);
        }else {
            newStr+=currchar;
            MoveAllCharToLast(str,index+1,count,newStr,ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();

        System.out.print("Enter charter which you want to move at last : ");
        char ch=sc.nextLine().charAt(0);
        sc.close();
        MoveAllCharToLast(str,0,0,"",ch);
    }
}
