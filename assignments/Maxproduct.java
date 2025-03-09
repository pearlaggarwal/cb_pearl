package assignments;

import java.util.Scanner;

public class Maxproduct {

    static int maxProduct(int[] nums) {
        int maxpro=Integer.MIN_VALUE;
        int currpro=1;
        int j=0;
        // if(nums[j]<0){
            for(int i=nums.length-1;i>=0;i--){
                currpro*=nums[i];
                maxpro=Math.max(maxpro,currpro);
                if(currpro==0){
                    currpro=1;
                }
            }
            currpro=1;
        // }
        // else{
            for(int i=0;i<nums.length;i++){
                currpro*=nums[i];
                maxpro=Math.max(currpro,maxpro);
                if (currpro==0){
                    currpro=1;
                }
            }
            return maxpro;
        // }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProduct(arr));
    }
    
}
