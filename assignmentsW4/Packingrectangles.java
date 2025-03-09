package assignmentsW4;

import java.util.Scanner;

public class Packingrectangles {

    static boolean funct(long w,long h,long n,long m){
        long r=m/h;
        long c=m/w;

        //return r*c>=n;
        return c>0 && r>=(n+(c-1))/c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long w=sc.nextInt();
        long h=sc.nextInt();
        long n=sc.nextInt();

        long s=Math.max(w, h);
        long e=Math.max(w, h)*n;
        long ans=0;
        while(s<=e){
            long m=s+(e-s)/2;

            // can I pack n rectangles of dimensions wxh in a square of dimension wxh ?

            if(funct(w,h,n,m)){
                ans=m;
                e=m-1;
            }
            else{
                s=m+1;
            }

        }

        System.out.println(ans);

        //return 0;
    }
    
}
