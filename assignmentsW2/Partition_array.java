package assignmentsW2;

import java.util.Scanner;

public class Partition_array {

    static void partitionarray(int[] nums){
        int[] right=new int[arr.length];
        int n=arr.length;
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.min(arr[i],arr[i+2]);
        }
        int leftmax= 0;
        for(int i=0;i<n-1;i++){
            leftmax=Math.max(leftmax,arr[i]);
            if(leftmax<=right[i]){
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        partitionarray(arr);
    }
    
    
}
