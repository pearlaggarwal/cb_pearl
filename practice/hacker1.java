import java.util.Scanner;

public class hacker1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        //Square Pattern
        /* 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(Math.max(i, j) + " ");
            }
            System.out.println();
        }
        sc.close();
        */


        /*/
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
        */


        //PATTERN TRIANGLE
        /*
        for(int i=1;i<=n;i++){
            for (int j = i; j < n; j++) {
                System.out.print("  "); 
            }
            for (int j = i; j < 2 * i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        */

        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print("0"+" ");
                }                
            }
            System.out.println();
        }
        sc.close();
        */


        /*
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }            
            int spaces = (n - i) * 2; 
            for (int s = 1; s < spaces; s++) {
                System.out.print(" "+" ");
            }  
             
            if(i<n){
                for(int j=i;j>=1;j--){
                    System.out.print(j+" ");
                }
            }
            else{
                for(int j=i-1;j>=1;j--){
                    System.out.print(j+" ");
                }
            }
            
            System.out.println();
            
            
        }
        */


        // PATTERN NUMBER LADDER
        /*
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
        */

        /*
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        */

        //Pattern Numbers & Stars - 2
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
        for(int i=1;i<=n;i++){
            if(i%2!=0||i==2){
                for (int j = 0; j < i; j++) {
                    System.out.print("1");
                }
            }
            else{
                System.out.print("1");
                for(int j=0;j<i-2;j++){
                    System.out.print("0");
                }
                System.out.print("1");
            }
            System.out.println();
            }       
        */

        //Fibonacci Pattern (Pattern 4)

        int n1=0;
        int n2=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(n1+" ");
                int sum=n1+n2;
                n1=n2;
                n2=sum;
            }
            System.out.println();
        }
        sc.close();
    }
}
