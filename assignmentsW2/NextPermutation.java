package assignmentsW2;

import java.util.List;
import java.util.Scanner;

public class NextPermutation {

    static void Permutation(int[] nums){
        // 1.To find P
        int p=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                p=i;
                break;
            }
            
        }
        if(p==-1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        //2. Find q
        int q=0;
        for(int i=nums.length-1;i>=p;i--){
            if(nums[i]>nums[p]){
                q=i;
                break;
            }            
        }
        //3. Swap p and q 
        int temp=nums[p];
        nums[p]=nums[q];
        nums[q]=temp;
        //4. arrange in ascending order
    }
    static void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Permutation(arr);
    }
    
}
