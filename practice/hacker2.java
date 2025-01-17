import java.util.Scanner;

public class hacker2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // Downward pattern

        /* 
        for (int i = rows; i >= 1; i--) {
            for (int space = 0; space < rows - i; space++) {
                System.out.print("p");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            */


        // PATTERN MAGIC 
        /*
        for(int i=1;i<n;i++){
            for(int k=n;k>=i;k--){
                System.out.print("*"+" ");
            }
            for(int k=1;k<i;k++){
                System.out.print(" "+" ");
            }
            for(int k=2;k<i;k++){
                System.out.print(" "+" ");
            }
            if(i==1){
                for(int k=n-1;k>=i;k--){
                    System.out.print("*"+" ");
                }

            }
            else{
                for(int k=n;k>=i;k--){
                    System.out.print("*"+" ");
                }
            }
            
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }            
            int spaces = (n - i) * 2; 
            for (int s = 1; s < spaces; s++) {
                System.out.print(" "+" ");
            }  
             
            if(i<n){
                for(int j=i;j>=1;j--){
                    System.out.print("*"+" ");
                }
            }
            else{
                for(int j=i-1;j>=1;j--){
                    System.out.print("*"+" ");
                }
            }            
            System.out.println();            
        }
        */

        /*

        //Pattern HourGlass
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" "+" ");
            }
            for(int j=n-i;j>=0;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");

            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.print(" "+" ");
            }
            for(int j=i+1;j>=0;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        */

        //Pattern Inverted Hour glass
        /*
        for(int i=0;i<=n;i++){
            for(int j=n;j>=n-i;j--){
                System.out.print(j+" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=n-i;j>1;j--){
                System.out.print(" "+" ");
            }
            if(i==n){
                for(int j=n-(i-1);j<=n;j++){
                    System.out.print(j+" ");
                }
            }
            else{
                for(int j=n-i;j<=n;j++){
                    System.out.print(j+" ");
                }
            }            
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }
        */

        //HOLLOW DIAMOND PATTERN
        /*
        for(int i=0;i<=n/2;i++){
            for(int k=i;k<=n/2;k++){
                System.out.print("*"+"\t");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print(" "+"\t");
            }
            if(i==0){
                for(int k=n/2-1;k>=i;k--){
                    System.out.print("*"+"\t");
                }
            }
            else{
                for(int k=n/2;k>=i;k--){
                    System.out.print("*"+"\t");
                }
            }            
            System.out.println();
        }
        for(int i=n/2-1; i>=0; i--){
            for(int k=i; k<=n/2; k++){
                System.out.print("*" + "\t");
            }
            for(int k=0; k<2*i-1; k++){
                System.out.print(" " + "\t");
            }
            if(i==0){
                for(int k=n/2-1; k>=i; k--){
                    System.out.print("*" + "\t");
                }
            } else {
                for(int k=n/2; k>=i; k--){
                    System.out.print("*" + "\t");
                }
            }            
            System.out.println();
        }
        */

        // for(int i=0; i<=n/2; i++){
        //     for(int k=i; k<=n/2; k++){
        //         System.out.print("p" + " ");
        //     }
        //     for(int k=0; k<2*i-1; k++){
        //         System.out.print("*" + " "); 
        //     }
        //     System.out.println();
        // }

        // for(int i=n/2-1; i>=0; i--){
        //     for(int k=i; k<=n/2; k++){
        //         System.out.print(" " + " "); // Replace * with space
        //     }
        //     for(int k=0; k<2*i-1; k++){
        //         System.out.print("*" + " "); // Replace p with *
        //     }
        //     System.out.println();
        // }

        /*
        for (int i = 0; i <= n / 2; i++) {
            for (int k = n / 2; k > i; k--) {
                System.out.print(" " + " ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        
        for (int i = n / 2 - 1; i >= 0; i--) {
            
            for (int k = n / 2; k > i; k--) {
                System.out.print(" " + " "); 
            }
            
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        */


        //GANESHA PATTERN

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i<n/2){
        //             if(j<n/2){
        //                 if(j==0){
        //                     System.out.print("*"+" ");
        //                 }
        //                 else{
        //                     System.out.print(" "+" ");
        //                 }
        //             }
        //             else if(j==n/2){
        //                 System.out.print("*"+" ");
        //             }
        //             else{
        //                 if(i==0){
        //                     System.out.print("*"+" ");
        //                 }
        //             }
        //         }
        //         else if(i==n/2){
        //             System.out.print("*"+" ");
        //         }
        //         else{
        //             if(j<n/2){
        //                 if(i==n-1){
        //                     System.out.print("*"+" ");
        //                 }
        //                 else{
        //                     System.out.print(" "+" ");
        //                 }
        //             }
        //             else if(j==n/2){
        //                 System.out.print("*"+" ");
        //             }
        //             else{
        //                 if(j==n-1){
        //                     System.out.print("*"+" ");
        //                 }
        //                 else{
        //                     System.out.print(" "+" ");
        //                 }
        //             }
        //         }
        //     }
        //     System.out.println();
        // }

        /*
        for (int i = 0; i <= n / 2; i++) {
            
            for (int k = n / 2; k > i; k--) {
                System.out.print("p" + " ");
            }
            for (int k = i+1; k < 2 * (i+1); k++) {
                System.out.print(k+ " ");
            }
            for(int k=2*(i+1)-2;k>=(i+1);k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }

        
        for (int i = n / 2 - 1; i >= 0; i--) {
            
            for (int k = n / 2; k > i; k--) {
                System.out.print("p" + " "); 
            }
            
            for (int k =i+1; k <2*(i+1); k++) {
                System.out.print(k + " ");
            }
            for (int k = 2 * (i + 1) - 2; k >= (i + 1); k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
            */


        /*
        for (int i = 0; i <= n/2+1; i++) {
            for (int k = n/2; k >=i; k--) { 
                System.out.print(" " + " ");
            }
            for (int k = i + 1; k < 2 * (i + 1); k++) {                    
                System.out.print(k + " ");
            }
            for (int k = 2 * (i + 1) - 2; k >= (i + 1); k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    
            // Lower half
        for (int i = n/2; i >= 0; i--) {
            for (int k = i; k <=n/2; k++) { 
                System.out.print(" " + " ");                
            }
            for (int k = i + 1; k < 2 * (i + 1); k++) {
                System.out.print(k + " ");
            }
                // Print descending numbers                
            for (int k = 2 * (i + 1) - 2; k >= (i + 1); k--) {
                System.out.print(k + " ");
            }
            System.out.println();            
        }
            */

        //hollow rhombus
        /*
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" "+" ");                    
            }
            for(int j=1;j<=n;j++){                
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
        */

        //DOUBLE SIDED ARROW

        for(int i=1;i<=n/2+1;i++){
            int spaces=((n/2+1)-i)*2;
            for(int j=0;j<spaces;j++){
                System.out.print(" "+" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<2*i-2;j++){
                System.out.print(" "+" ");
            }
            if(i!=1){
                for(int j=1;j<i+1;j++){
                    System.out.print(j+" ");
            
                }
            }
            System.out.println();
        }
        for(int i=n/2;i>=1;i--){
            int spaces=((n/2+1)-i)*2;
            for(int j=0;j<spaces;j++){
                System.out.print(" "+" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int j=1; j<2*i-2; j++) {
                System.out.print(" "+" ");
            }
            if(i!=1) {
                for(int j=1; j<i+1; j++) {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
    

}
