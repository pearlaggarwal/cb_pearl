package assignments;

import java.util.Scanner;

public class codeforce {
    // sereja and dima 

    static void serejadima(int[] arr){
        int s1=0;
        int s2=0;
        int low=0;
        int high=arr.length-1;
        boolean serejaturn=true;
        while(low<=high){
        if(serejaturn){
            if(arr[low]>arr[high]){
                s1+=arr[low];
                low++;
            }
            else{
                s1+=arr[high];
                high--;
            }
            serejaturn=false;
        }
        else{
            if(arr[low]>arr[high]){
                s2+=arr[low];
                low++;
            }
            else{
                s2+=arr[high];
                high--;
            }
            serejaturn=true;
        }
    }
    System.out.println(s1+" "+s2);
                 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //ArrayList<Integer> arr=new ArrayList<>();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        serejadima(arr);
    }
    
}
