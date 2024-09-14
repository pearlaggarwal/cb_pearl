package dsa;

public class leetcodepr {

    // static int sum(int[] arr,int a,int b){
    //     int sum=0;
    //     for( int i=a;i<=b;i++){
    //         sum+=arr[i];
    //     }
    //     return sum;
    // }

    // static int ans(int[] arr){
    //     int summax=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         int tempsum=0;
    //         for(int j=i;j<arr.length;j++){
    //             tempsum+=arr[j];
    //             summax=Math.max(summax,tempsum);
    //         }
    //     }
    //     return summax;
    // }

    // public static void main(String[] args) {
    //     int[] arr={1,2,3,4,5};
    //     System.out.print(ans(arr));
    // }

    static void buy(int[]nums){
        int mprofit=0;
        int currentprofit=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i;j<nums.length;j++){
                mprofit=nums[j]-nums[i];
                mprofit=Math.max(mprofit,currentprofit);





            }
            }
    }
    
    public static void main(String[] args) {
        int [] nums={7,1,5,3,6,4};
        buy(nums);
    }
}
