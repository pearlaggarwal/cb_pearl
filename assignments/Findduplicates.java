package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Findduplicates {

    static List<Integer> find_duplicates(int[] nums){
        if(nums.length==0){
            return new ArrayList<>();
        }
        List<Integer> arr= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if (nums[index]<0){
                arr.add(Math.abs(nums[i]));
            }
            nums[index]=-nums[index];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> result=find_duplicates(arr);
        System.out.println((result));
    }
    
}
