package practice;

import java.util.Arrays;
import java.util.Scanner;

import javax.imageio.stream.IIOByteBuffer;
import javax.sound.sampled.SourceDataLine;

public class assign2{

    // QUES 1 Binary search

    // static int binarysearch(int arr[],int m){
    //     int low=0,high=arr.length-1,mid=0;
    //     while(low<=high){
    //         mid=(high+low)/2;
    //         if(arr[mid]==m){
    //             return mid;
    //         }
    //         else if (m>arr[mid]){
    //             low=mid+1;
    //         }
    //         else{
    //             high=mid-1;
    //         }
    //     }
    //     return -1;
    //     }

    

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int[] arr=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int m=sc.nextInt();
    //     System.out.println(binarysearch(arr,m));        
    //     sc.close();        
    // }







    // QUES 2 BUBBLE SORT
//     static void bubblesortt(int[] arr){
//         for(int turn=1;turn<arr.length;turn++){
//             for(int i=0;i<arr.length-turn;i++){
//                 if (arr[i]>arr[i+1]){
//                     int temp=arr[i+1];
//                     arr[i+1]=arr[i];
//                     arr[i]=temp;
//                 }
//             }
//         }
//     }

//     static void display(int[] arr){
//         for (int i:arr){
//             System.out.print(i+" ");
//             //System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
        
//         bubblesortt(arr);
//         display(arr);        
//         sc.close();
// }





// QUES 3 SELECTION SORT
    // static void selectionSort(int[] arr){
    //     for (int i=0;i<arr.length-1;i++){
    //         int idx=minimumValue(arr,i);
    //         int temp=arr[i];
    //         arr[i]=arr[idx];
    //         arr[idx]=temp;
    //     }
    // }
    
    // static int minimumValue(int[] arr,int a){
    //     int mini=a;
    //     for(int i=a+1;i<arr.length;i++)
    //         if(arr[mini]>arr[i])
    //             mini=i;
    //     return mini;
    
    // }
    
    //     static void display(int[] arr){
    //         for(int i:arr){
    //             System.out.print(i+" ");
    //         }
            
    //     }
    
        
    
        // public static void main(String[] args) {
        //     Scanner sc=new Scanner(System.in);
        //     int n=sc.nextInt();
        //     int[] arr=new int[n];
        //     for(int i=0;i<n;i++){
        //         arr[i]=sc.nextInt();
        //     }
        //     selectionSort(arr);
        //     display(arr); 
        // }



    // QUES 4 INSERTION SORT

    // static void insertionSort(int[] arr){
    //     for(int i=1;i<arr.length;i++){
    //         int key=arr[i];
    //         int j=i-1;
    //         while(j>=0 && arr[j]>key){
    //             arr[j+1]=arr[j];
    //             --j;
    //         }
    //         arr[j+1]=key;
    //     }
    // }

    // static void display(int[] arr){
    //     for (int i:arr){
    //         System.out.print(i+" ");
    //     }
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int[] arr=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     insertionSort(arr);
    //     display(arr); 
    // }



    // QUES 5 Subarrays Having Product less than k


    // static int subarray(int[] arr,int k){
    //     int sum=0;
    //     for (int i=0;i<arr.length;i++){
    //         int tempsum=1;
    //         for (int j=i;j<arr.length;j++){
    //             tempsum*=arr[j];
    //             if (tempsum<k){
    //                 sum++;
    //             }
    //         }  
    //     }
    //     return sum;
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int k=sc.nextInt();
    //     int[] arr= new int[n];
    //     for (int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     System.out.println(subarray(arr,k));
    //     sc.close();
    //     }
        



    // QUESTION SUM 

    // static int subarray(int[] arr,int k){
    //     int sum=0;
    //     for (int i=0;i<arr.length;i++){  
    //         int tempsum=0;          
    //         for (int j=i;j<arr.length;j++){
    //             tempsum+=arr[j];
    //             if (tempsum==k){
    //                 sum++;
    //             }
    //     }
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
        
    //     int k=sc.nextInt();
        
    //     int[] arr= new int[n];
    //     for (int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     Arrays.sort(arr);
    //     System.out.println(subarray(arr,k));
    //     sc.close();
    //     }



    // QUES  LONGEST SUBARRAY

    // static int longsubarray(int[] arr){
    //     int maxLength = 0;
    //     int currentOnes = 0;
    //     int previousOnes = 0;
    //     int zeroCount = 0;
    //     for (int num : arr) {
    //         if (num == 1) {
    //             currentOnes++;
    //         } else {
    //             zeroCount++;
    //             previousOnes = currentOnes;
    //             currentOnes = 0;
    //         }
    //         maxLength = Math.max(maxLength, previousOnes + currentOnes);
    //     }
    //     return zeroCount == 0 ? maxLength - 1 : maxLength;
    // }

    // public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] arr= new int[n];
        // for (int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println(longsubarray(arr));
        // sc.close();
        // }


    //QUES MAX LENGTH OF REPEATED SUB ARRAY

    // static int maxLengtharr(int[] arr1,int[] arr2){
    //     int maxLength = 0;
    //     for (int i = 0; i < arr1.length; i++) {
    //         for (int j = 0; j < arr2.length; j++) {
    //             int temp = 0;
    //             int x = i;
    //             int y = j;
    //             while (x < arr1.length && y < arr2.length && arr1[x] == arr2[y]) {
    //                 temp++;
    //                 x++;
    //                 y++;
    //             }
    //             maxLength = Math.max(temp, maxLength);
    //         }
    //     }
    //     return maxLength;
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int[] arr1= new int[n];
    //     for (int j=0;j<n;j++){
    //         arr1[j]=sc.nextInt();
    //     }
    //     int m=sc.nextInt();
    //     int[] arr2= new int[m];
    //     for (int j=0;j<m;j++){
    //         arr2[j]=sc.nextInt();
    //     }
    //     System.out.println(maxLengtharr(arr1,arr2)); 
    //     sc.close();
    //     }





    // QUES INTESECTION OF ARRAY

    static void intersection(int[] arr1,int[] arr2){
        for (int i=0;i<arr2.length;i++){
            for (int j=0;j<arr1.length;j++){
                if (arr1[j]==arr2[i]){
                    System.out.print(arr1[j]+" ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr1= new int[n];
        for (int j=0;j<n;j++){
            arr1[j]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2= new int[m];
        for (int j=0;j<m;j++){
            arr2[j]=sc.nextInt();
        }
        intersection(arr1,arr2); 
        sc.close();
        }

    }





    

