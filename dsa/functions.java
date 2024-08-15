package dsa;
import java.util.Scanner;
class Day1{

    // Hello world progam
    // static void sayhi(){
    //     System.out.println("Hello World");
    // }
    // public static void main(String[] Args){
    //     sayhi();

    // swap numbers
    // static void swap(int a,int b){
    //     int temp=a;
    //     a=b;
    //     b=temp;
    //     System.out.println(a+" "+b);
    // }

    // public static void main(String[] args) {
    //     int a=10;
    //     int b=15;
    //     swap(a,b);
    // }

    // print first n natural nos
    
    // static void natural(int n){
    //     for(int i=1;i<=n;i++){
    //         System.out.println(i);
    //     }
    // }

    // public static void main(String[] args) {
    //     int n=15;
    //     natural(n);
    // }

    //create a function to check if a number is prime or not 

    // static boolean checkprime(int n){
    //     for (int i=2;i<n;i++)
    //         if (n%i==0) return false;
    //         return true; 
            
        
    // }
    // public static void main(String[] args) {
    //     int n;
    //     Scanner sc=new Scanner(System.in);
    //     n=sc.nextInt();
    //     System.out.println(checkprime(n));
    // }

    // Reverse a number 

    // static int reversenum(int n){
    //     int temp=0;
    //     while(n!=0){
    //         temp=temp*10+n%10;
    //         n/=10;
    //     }
    //     return temp;
    // }
    // public static void main(String[] args) {
    //     int a=1802;
    //     Scanner sc=new Scanner(System.in);
    //     a=sc.nextInt();
    //     System.out.println(reversenum(a));
    
    // sc.close();
    // }


    // count number of digits in a number

    // static int count(int n){
    //     int count=0;
    //     while(n!=0){
    //         n/=10;
    //         count++;
    //     }
    //     return count;
    // }

    // public static void main(String[] Args) {
    //     int a;
    //     Scanner sc=new Scanner(System.in);
    //     a=sc.nextInt();
    //     System.out.println("Number of digits are:"+count(a));
    // }

    // check a number is amstrong or not

    // static int countd(int n){
    //     int count=0;
    //     while(n!=0){
    //         n/=10;
    //         count++;

    //     }
    //     return count;
    // }

    // static boolean checkarm(int n){
    //     int d=countd(n);
    //     int sum=0;
    //     int temp=n;
    //     while(n!=0){
    //         sum+=Math.pow((n%10),d);
    //         n/=10;
    //     }
    //     return(sum==temp);

    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     System.out.print(checkarm(n));
    //     System.out.println();
    // sc.close();
    // }

    // Create a function to print a whole array
    // static void printArr(int[] arr){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     System.out.println();
    //     }
        
    // }

    // print array type 1 

    // public static void main(String[] args) {
    //     int arr[]=new int[10];
    //       //int[] nums= {1,2,3,4,5,6};
    //       //arr[0]=1;
    //       //arr[1]=2;
        
    //     for(int i=0;i<arr.length;i++)
    //         arr[i]=i+1;
    //     printArr(arr);
    //     System.out.println();
        
    // }

    // print array type 2 

    // static void printArr(int[] arr){
    //     for (int i:arr)
    //         System.out.print(i+" ");
        
    // }

    // public static void main(String[] args) {
    //     int[] arr={1,2,3,4,5};
    //     printArr(arr);
    // }

    //return the sum of array

    // static int sumArr(int[] arr){
    //     int sum=0;
    //     for(int num:arr){
    //         sum+=num;
    //     }
    //     return sum;
    // }
    

    // public static void main(String[] args) {
    //     int[] arr={1,2,3,4,5};
    //     System.out.println(sumArr(arr));
    
    //     }

    // reverse the numbers of array

    // static void reverseArr(int[] arr){
    //     int start=0;
    //     int end=arr.length-1;
    //     while(start<end){
    //         int temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;
    //         start++;
    //         end--;
    //     }

    // }
    // static void printArr(int[] arr){
    //     for(int n:arr){
    //         System.out.print(n);
    //     }
    // }

    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5};
    //     reverseArr(arr);
    //     printArr(arr);
        
    // }

    // swap 2 values inside an araay

    // 
    
        
    
    //static void reverseswap(int[] arr){
    //     for (int a=0,b<arr.length-1;a<b;b--,a++)
    //         swapArr(arr,a,b);
    //         printArr(arr);
    // }

    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5,6};
    //     int a=1;
    //     int b=4;
    //     swapArr(arr,a,b);
    //     printArr(arr);
        
    // }

    // reverse array from given index 

    // static void reverseindexArr(int[] arr){
    //         int start=0;
    //         int end=arr.length-1;
    //         while(start<end){
    //             int temp=arr[start];
    //             arr[start]=arr[end];
    //             arr[end]=temp;
    //             start++;
    //             end--;
    //         }
    //     }

}



    



    

