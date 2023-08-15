import java.util.Scanner;

public class FirstAndLastOcuuranceInString {
    public static int first=-1;
    public static int last = -1;

    public static void findOccurance(String str, int index,char element){
        if(index==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentChar = str.charAt(index);

        if(currentChar==element){
            if(first==-1){
                first=index;
            }else {
                last=index;
            }
        }

        findOccurance(str, index+1,element);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a element whose first and last index u want to find:  ");
        char element=sc.nextLine().charAt(0);
        sc.close();
        findOccurance(str,0, element);
    }
}
