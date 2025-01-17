package lecture18;

public class Nqueens {
    static int[][] board;

    static void display(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }

    //recusive function
    static boolean nQueens(int[][] board,int i,int n){
        if(i==n){
            //display
            display(board);
            //return true;
            return false;
        }
        for(int j=0;j<n;j++){
            if(check(board, i, j, n)){
                board[i][j]=1;
                if(nQueens(board, i+1,n)){
                    return true;
                }
                //back track
                board[i][j]=0;
            }
        }
        return false;
    }

    // check safe
    static boolean check(int[][] board,int i,int j,int n){
        //col
        for(int k=0;k<i;k++)
            if(board[k][j]==1)
                return false;
        //left diagonal
        int x=i-1, y=j-1;
        while(x>=0 && y>=0){
            if(board[x--][y--]==1)
                return false;
        }
        x=i-1; y=j+1;
        while(x>=0 && y<n){
            if(board[x--][y++]==1)
                return false;
        }
        return true;       

    }

    // main function

    public static void main(String[] args) {
        int n=4;
        board =new int[n][n];
        nQueens(board,0,n);
    }
    
}
