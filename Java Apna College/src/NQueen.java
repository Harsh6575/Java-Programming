import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueen {

    public boolean isSafe(int row,int col, char[][] board){
        //horizontal line
        for(int j=0; j<board.length; j++) {
            if(board[row][j] == 'Q') {
                return false;
            }
        }

        //vertical line
        for(int i=0; i<board.length; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        //diagonals

        // upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; c--, r--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //upper right
        r = row;
        for(int c=col; c<board.length && r>=0; r--, c++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower left
        r=row;
        for(int c=col; c>=0 && r<board.length; r++, c--) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        //lower right
        r=row;
        for(int c=col; c<board.length && r<board.length; c++, r++) {
            if(board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board,List<List<String>> allBoards){
        String row = "";

        List<String> newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++) {

            row = "";
            for(int j=0; j<board[0].length; j++) {

                if(board[i][j]=='Q'){
                    row+="Q";
                }else {
                    row+=".";
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board,List<List<String>> allBoards, int col){
        if(col==board.length){
            saveBoard(board,allBoards);
            return;
        }

        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                helper(board,allBoards,col+1);
                board[row][col]='.';
            }
        }
    }

    public List<List<String>> solveQueens(int n){
        List<List<String>> allBoards=new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board,allBoards,0);

        for(int i=0;i<allBoards.size();i++){
            System.out.println(allBoards.get(i));
        }
//        System.out.println(allBoards);

        return allBoards;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of board : ");
        int n = sc.nextInt();
        sc.close();

        NQueen nq = new NQueen();
        nq.solveQueens(n);
    }
}