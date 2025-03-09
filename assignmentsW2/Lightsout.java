package assignmentsW2;

import java.util.Scanner;

public class Lightsout {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] nums={{1,1,1},{1,1,1},{1,1,1}};
        int[][] arr=new int[3][3]; 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<3;i++){
            int count=0;
            for(int j=0;j<3;j++){
                count=arr[i][j];

                if(i-1>=0) count +=arr[i-1][j];
                if(j-1>=0) count+=arr[i][j-1];
                if(i+1<=2) count+=arr[i+1][j];
                if(j+1<=2) count+=arr[i][j+1];
            
                if(count%2==0){
                    nums[i][j]=1;
                }
                else{
                    nums[i][j]=0;
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
    
}
