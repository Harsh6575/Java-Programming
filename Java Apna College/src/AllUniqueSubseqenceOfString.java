import java.util.HashSet;
import java.util.Scanner;

public class AllUniqueSubseqenceOfString {
    public static void UniqueSubSequences(String str, int index,String newStr, HashSet<String> set){
        if(index==str.length()){
            if (set.contains(newStr)){
                return;
            }
            else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char curChar = str.charAt(index);
        UniqueSubSequences(str,index+1,newStr+curChar,set);

        UniqueSubSequences(str,index+1,newStr,set);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string in which you want to find subsequence : ");
        String str = sc.nextLine();
        sc.close();
        HashSet<String> set = new HashSet<>();

        UniqueSubSequences(str,0,"",set);
    }
}
