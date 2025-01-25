package assignments;

import java.util.Scanner;

public class jumpgame {

    static boolean jump_game(int[] arr){
        int maxreach=0; 

        for(int i=0;i<nums.length;i++){
            if(i>maxreach){
                return false;
            }
            if(i+nums[i]>maxreach){
                maxreach=i+nums[i];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //ArrayList<Integer> arr=new ArrayList<>();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        jump_game(arr);
    }
    
}
