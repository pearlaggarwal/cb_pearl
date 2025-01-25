package assignments;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findtriplets {

    // find triplets
    static List<List<Integer>> threeSum(int[] arr, int target) {
    //static void findsum(int[] arr,int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            if(i>0&&arr[i]==arr[i-1]){
                continue;
            }
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    //System.out.println(arr[i]+","+arr[left]+"and"+arr[right]);
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while(left<right&&arr[left]==arr[left+1]){
                        left++;
                    }
                    while(left<right && arr[right]==arr[right-1]){
                        right--;
                    }
                    // if(arr[i]==arr[i+1]){
                    //     i++;
                    //     left++;
                    // }
                    // else{
                        left++;
                        right--;
                    //}
                    
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
            
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();  
        //Solution solution = new Solution();      
        //findsum(arr,target);
        List<List<Integer>> result=threeSum(arr,target);

        System.out.println(result);
        sc.close();
    }
    

    
}
