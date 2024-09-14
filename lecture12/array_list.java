package lecture12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class array_list {
    
    public static void main(String[] args) {
        //1. SYNTAX
        // ArrayList<Integer> arr= new ArrayList<>();

        //2. ADD
        // arr.add(100);
        // arr.add(20);
        // arr.add(3220);
        // System.out.println(arr);
        // System.out.println(arr.size());

        //3. Get
        //System.out.println(arr.get(0));

        //4. Remove
        // arr.remove(1);
        // System.out.println(arr);
        // System.out.println(arr.size());

        // update
        // arr.set(1,100);
        //System.out.println(arr);

        // Sort

        // Collections.sort(arr);
        // System.out.println(arr);

        // INSERT
        // arr.add(1,50);

        //arr.clear();
        // System.out.println(arr);

        // Create a function to find the max sum of subarray of size k

        ArrayList<Integer> nums= new ArrayList<>();

        int[] arr= {10,20,30,10,20,10,1,40,40};
        // int k=3;
        nums= findsubarray(arr,3);
        System.out.println(nums);




    }

    static ArrayList<Integer> findsubarray(int[] arr,int k){
    int start=0;
    int end=k-1;
    int maxsum=0;
    for(int i=0;i<=end;i++){
        maxsum+=arr[i];
        
    }
    int currsum=maxsum;
    int index=0;
    while(end<arr.length-1){
        currsum-=arr[start];
        start++;
        end++;
        currsum+=arr[end];
        if (maxsum<currsum){
            index=start;
            maxsum=currsum;
        }
    }
    ArrayList<Integer> nums=new ArrayList<>();

    for(int i=index;i<index+k;i++){
        nums.add(arr[i]);
    }
    return nums;


    }

    // static List<Integer> findSubarray(ArrayList<Integer> arr, int k) {

    //     int maxSum = Integer.MIN_VALUE;
    //     int currentSum = 0;
    //     int startIndex = 0;
    //     int endIndex = k - 1;

    //     // Calculate the sum of the first k elements
    //     for (int i = 0; i < k; i++) {
    //         currentSum += arr.get(i);
    //     }

    //     maxSum = currentSum;

    //     // Slide the window and update the sum
    //     for (int i = k; i < arr.size(); i++) {
    //         currentSum += arr.get(i) - arr.get(i - k);
    //         if (currentSum > maxSum) {
    //             maxSum = currentSum;
    //             startIndex = i - k + 1;
    //             endIndex = i;
    //         }
    //     }

    //     // Create a new list containing the maximum sum subarray
    //     List<Integer> maxSumSubarray = new ArrayList<>();
    //     for (int i = startIndex; i <= endIndex; i++) {
    //         maxSumSubarray.add(arr.get(i));
    //     }

    //     return maxSumSubarray;
    

}
