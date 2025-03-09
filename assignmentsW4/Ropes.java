package assignmentsW4;

import java.util.Scanner;

public class Ropes {

    static boolean func(int n,int k,int[] arr,double m){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            cnt+=(int)arr[i]/m;
        }
        return cnt>=k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        double s=0;
        double e=1e7;
        double ans=0;
        int numIterations = 50; // log2(1e7*1e7)
        double moe=1e-7; // margin of error
        for(int i=1;i<=numIterations;i++){
            double m=s+(e-s)/2;

            // can I take out k pieces of length m from n ropes

            if (func(n,k,arr,m)){
                ans=m;
                // move towards right
                s=m+moe;
            }
            else{
                //move towards left 
                e=m-moe;
            }
        }
        System.out.printf("%.7f\n",ans);
        sc.close();
    }
    
}
