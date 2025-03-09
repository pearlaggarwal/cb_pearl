package practice;
import java.util.Scanner;
public class pr2DArrays{

    static void setZeroes(int[][] matrix){
        int[][] matrix2=new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix2[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<matrix[0].length;k++){
                        matrix2[i][k]=0;
                    }
                    for(int l=0;l<matrix.length;l++){
                        matrix2[l][j]=0;
                    }
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix2[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        //int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        int[][] matrix=new int[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        setZeroes(matrix);
    }
    
}
