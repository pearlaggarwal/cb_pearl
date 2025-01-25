package assignments;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class twosum {

    static List<Integer> two_sum(int[] arr,int target){
        List<Integer> result = new ArrayList<>();
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                //System.out.println(left+" , "+right);
                result.add(left,right);
                while(left<right && arr[left]==arr[left+1]){
                    left++;
                }
                while(left<right && arr[right]==arr[right-1]){
                    right--;
                }
                left++;
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        List<Integer> result=two_sum(arr,target);
        System.out.println(result);
        
    }
    
}
