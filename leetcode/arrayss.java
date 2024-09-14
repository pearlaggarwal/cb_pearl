package leetcode;

public class arrayss {

    static int removelement(int[] nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                System.out.print(nums[i]);
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println();
        return k;
    }

    static int removeduplicate(int[] nums){
        int k=0;
        
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i-1]) {
                nums[k] = nums[i];                
                k++;
            }
        }

        System.out.println();
        return k;
        

    }

    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int val=2;
        System.out.println(removeduplicate(nums));
        //System.out.println(removelement(nums,val));

    }
    
}
