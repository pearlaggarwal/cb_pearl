package dsa;

public class kadanesalg {

    static int subarray(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        System.out.println(maxsum);
        int currentsum=0;
        for(int i=0;i<arr.length;i++){
            
            currentsum+=arr[i];
            maxsum=Math.max(maxsum,currentsum);
            if(currentsum<0){
                currentsum=0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subarray(arr));
    }
    
    // static void rotate(int[] arr){
    //     int temp=arr[arr.length-1];
    //     for (int i=arr.length-1;i>=1;i--){
            
    //         arr[i]=arr[i-1];
    //         arr[0]=temp;
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] arr={1,2,3,4,5,6,7};
    //     int k=3;
    //     for (int i=0;i<k;i++){
    //         rotate(arr);
    //     }
    //     // int[] arr={1,2,3,4,5,6,7};
    //     // System.out.println(rotate(arr));
    // }

    // int n=new int[nums.length];
    //     k%=n;
    //     for(int i=0;i<(n-k);i++)
    //         temp[i+k]=nums[i];
    //     for(int j=0;j<k;j++)
    //         temp[j]=nums[n-k+j];
    //     // deep copy
    //     for (int i=0;i<n;i++)
    //         nums[i]=temp[i];
    // }

//     static void reverse(int[] nums,int i,int j){
//         while(i<j){
//             int temp=nums[i];
//             nums[i]=nums[j];
//             nums[j]=temp;
//             i++;j--;
//         }
//     }

//     static void rotate(int[] nums,int k){
//         k%=nums.length;
//         reverse(nums,0,nums.length-1);
//         reverse(nums,0,k-1);
//         reverse(nums,k,nums.length-1);
//     }

//     public static void main(String[] args) {
//         int[] nums={1,2,3,4,5,6,7};
//         int k=3;
//         rotate(nums,k);
// }

// static void buy(int[]nums){
//     for(int i=0;i<nums.length-1;i++){
        

//     }

// }

// public static void main(String[] args) {
//     int [] nums={7,1,5,3,6,4};
//     buy(nums);
// }
}
