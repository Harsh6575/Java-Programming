public class PermutationOfString {
    public static void printPer(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i=0;i<str.length();i++){
            char curChar = str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPer(newStr,permutation+curChar);
        }
    }

    public static void main(String[] args) {
        String s="har";
        printPer(s,"");
    }
}
