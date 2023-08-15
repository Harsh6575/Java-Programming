import java.util.Scanner;

public class KeypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void PrintCombination(String str, int index, String combination){

        if(index==str.length()){
            System.out.println(combination);
            return;
        }

        char curChar=str.charAt(index);
        String mapping = keypad[curChar-'0']; // Adjust the mapping index since keypad starts from 2 (e.g., '2' maps to "abc", '3' maps to "def", and so on)

        for (int i=0;i<mapping.length();i++){
            PrintCombination(str, index + 1, combination + mapping.charAt(i)); // Increment the index in the recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        String str = sc.nextLine();
        sc.close();
//        String str = "23";
        PrintCombination(str,0,"");
    }
}
