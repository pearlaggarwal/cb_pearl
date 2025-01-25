package assignments;
import java.util.*;
public class Three_sumclosest {

    static int threesum_closest(int[] nums,int target ){
        Arrays.sort(nums);
        int closum=Integer.MAX_VALUE;
        int mindifferene=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;           

            while(left<right){
                int currsum=nums[i]+nums[left]+nums[right];
                int difference=Math.abs(target-currsum);

                if(difference<mindifferene){
                    closum=currsum;
                    mindifferene=difference;
                }

                if(currsum<target){
                    left++;
                }
                else if(currsum>target){
                    right--;
                }
                else{
                    return currsum;
                }
            }
        }
        return closum;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int result=threesum_closest(arr,target);
        System.out.println(result);
        sc.close();
    }
    
}
