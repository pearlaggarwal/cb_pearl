package dsa;

import java.util.Arrays;

public class array {

    // sum of digits of array with given start and end

    // static int sumArray(int[] arr,int a,int b){
    //     int sum=0;
    //     for(int i=a;i<=b;i++){
    //         sum+=arr[i];
    //     }
    //     return sum;

    // }
    // public static void main(String[] args) {
    //     int[] arr={1,2,3,4,5};
    //     int a=1;
    //     int b=3;
    //     System.out.println(sumArray(arr,a,b));
    // }


    // reverse the array
    static void reverse(int[] arr){
        int[] temp= new int[arr.length];
        for(int i=0;i<arr.length;i++)
            temp[i]=arr[arr.length-1 - i];
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }

    static void printArr(int[] arr){
            for(int i:arr)
                System.out.print(i+" ");
            System.out.println();
        }

    
    public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6};
            reverse(arr);
            printArr(arr);
    }

    // create a function to search for an element

    // static boolean linearsearch(int[] arr,int n){
    //     for (int i=0;i<arr.length;i++)
    //         if(i==n) return true;
            
    //     return false;
    // }

//     static boolean binarysearch(int[] arr,int n,int a,int b){
//         int i=0, j=arr.length-1; // searching in whole array
//         //int i=a, j=b; // searching in given index
//         while(i<=j){
//             int mid=(i+j)/2;   // finding middle element
//             if(arr[mid]==n) return true;
//             else if(arr[mid]<n) i=mid+1;  // if middle element is smaller
//             else j=mid-1;
//         }
//         return false;

//     }

//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5,6};
//         //Arrays.sort(arr);
//         //printArr(arr;)
//         System.out.print(binarysearch(arr,6,1,4));
//         System.out.println();
//     }
}
