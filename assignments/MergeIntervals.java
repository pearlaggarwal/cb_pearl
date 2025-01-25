package assignments;

import java.util.Scanner;

public class MergeIntervals {

    static int [] merge_intervals(int[][] intervals){
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<nums[0].length;j++){
                intervals[i][]
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] array=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        merge_intervals(array);
        // System.out.println("The 2D array is:");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         System.out.print(array[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //Scanner.close();

    }
    
}
