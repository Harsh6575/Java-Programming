import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str,int index,String newStr){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }

        char curChar = str.charAt(index);

        if(map[curChar-'a']){
            removeDuplicate(str,index+1,newStr);
        } else {
            newStr+=curChar;
            map[curChar-'a']=true;
            removeDuplicate(str,index+1,newStr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string in which you want to remove duplicates : ");
        String str = sc.nextLine();
//        String str="abbcccda";
        sc.close();
        removeDuplicate(str,0,"");
    }
}
