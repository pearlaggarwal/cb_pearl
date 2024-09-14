package dsa;

import java.util.Scanner;

public class binarysearch {

    // binary search and printing the index
    // static int binarysearch(int arr[],int num){
    //     int low=0,high=arr.length-1;
    //     int mid=0;
    //     while(low<=high){
    //         mid=(low+high)/2;
    //         if(arr[mid]==num)
    //             return mid;
    //         else if(arr[mid]<num){
    //             low=mid+1;
    //         }
    //         else
    //             high=mid-1;
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int num=9;
    //     int[] arr={1,2,3,4,5,6,7,8,9};
    //     System.out.println(binarysearch(arr,num));
    // }

    // lower bound

    // static int lowerbound(int[]arr , int num){
    //     int fo=-1;  // fo=firstoccurance
    //     int low=0,high=arr.length-1,mid=0;
    //     while(low<=high){
    //         mid=(low+high)/2; // finding mid 
    //         if(arr[mid]==num){  // if mid value = sarch value
    //             fo=mid-1;
    //             high=mid-1;
    //         }
    //         else if(arr[mid]>num){ // if mid value > search value
    //             high=mid-1;
    //         }else                  // if mid value<search value
    //             low=mid+1;
    //     }
    //     return fo;

    // }

    // public static void main(String[] args) {
    //         int num=3;
    //         int[] arr={1,2,2,3,3,3,7,8,9};
    //         System.out.println(lowerbound(arr,num));
    //     }

    // upper bound

    // static int upperbound(int[] arr,int num){
    //     int ans=-1;
    //     int low=0,high=arr.length-1,mid=0;
    //     while(low<=high){
    //         mid=(low+high)/2;
    //         if(arr[mid]==num){
    //             ans=mid+1;
    //             low=mid+1;

    //         }
    //         else if(arr[mid]>num){
    //             high=mid-1;
    //         }
    //         else
    //             low=mid+1;
    //     }
    //     return ans;
    // }
    
    // public static void main(String[] args) {
    //             int num=3;
    //             int[] arr={1,2,2,3,3,3,7,8,9};
    //             System.out.println(upperbound(arr,num));
    //         }

    // count occurance

    // static int lowerbound(int[]arr,int num){
    //     int fo=-1;
    //     int low=0,high=arr.length-1,mid=0;
    //     while(low<=high){
    //         mid=(low+high)/2;
    //         if(arr[mid]==num){
    //             fo=mid-1;
    //             high=mid-1;
    //         }
    //         else if(arr[mid]>num){
    //             high=mid-1;

    //         }
    //         else
    //             low=mid+1;
    //     }
    //     return fo;
    // }

    // static int upperbound(int[] arr,int num){
    //     int ans=-1;
    //     int low=0,high=arr.length-1,mid=0;
    //     while(low<=high){
    //         mid=(low+high)/2;
    //         if(arr[mid]==num){
    //             ans=mid+1;       
    //             low=mid+1;

    //         }
    //         else if(arr[mid]>num){
    //             high=mid-1;
    //         }
    //         else
    //             low=mid+1;
    //     }
    //     return ans-1;
    // }

    // static int countocc(int[] arr,int num){
    //     int lb=lowerbound(arr, num);
    //     if(lb==-1) return 0;
    //     int ub=upperbound(arr, num);
    //     return ub-lb;
    // }


    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int num=sc.nextInt();
    //     int[] arr={1,2,3,4,5,5,6,6,6,6,6,7,8,9,9,9,9};
    //     System.out.println(countocc(arr,num));
    // }

    // Extra 
//     // static int count(int[]arr,int num){
//     //     int co= countocc(arr,num);
//     //     int coun=0;
//     //     while(arr[co]==num){
//     //         coun++;
//     //         co++;
//     //     }
//     //     return coun;
//     // }


}

    

