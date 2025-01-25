package assignments;

import java.util.Scanner;

public class beautifulmatrix {

    static void beautiful_matrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    System.out.println(Math.abs(2-i)+Math.abs(2-j)); 
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[5][5]; 
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        beautiful_matrix(arr);
    }
    
}
