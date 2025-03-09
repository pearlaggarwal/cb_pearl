package assignmentsW4;

import java.util.Scanner;

public class Effectiveapproach {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();        
        int map[]=new int[n+1];
        for(int i=1;i<=n;i++){            
            int x=sc.nextInt();            
            map[x]=i;
        }
        int m=sc.nextInt();
        long sum1=0;
        long sum2=0;

        for(int i=0;i<m;i++){
            int q=sc.nextInt();
            sum1+=map[q];
            sum2+=n-map[q]+1;
        }
        System.out.println(sum1+" "+sum2);  
        sc.close();
    }
    
}
