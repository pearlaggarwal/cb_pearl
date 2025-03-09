package assignmentsW4;

import java.util.Scanner;

public class Petrandbook {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[7];
        int sum=n;
        int total=0;
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
            total+=arr[i];
        }
        int count=0;
        sum%=total;
        if(sum==0){
           System.out.println(1);
           return;
        }
        while(sum>0){
            sum-=arr[count];
            count++;
            count%=7;
        }
        if(count==0){
            System.out.println(7);
        }
        else{
            System.out.println(count);
        }
    }    
}

