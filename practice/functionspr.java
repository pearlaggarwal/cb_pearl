package practice;

import java.util.Scanner;

public class functionspr {

    //count the number of digits

    // static int countd(int num){
    //     int count=0;
    //     while(num>0){
    //         count++;
    //         num/=10;
    //     }
    //     return count;
    // }

    // public static void main(String[] args) {
    //     int num=123489;
    //     System.out.println(countd(num));

    // }
    
    // count the number of repeated digits

    // static int countrep(int a,int b){
    //     int count=0;
    //     while(a>0){
    //         if (a%10==b){
    //             count++;
    //         }
    //         a/=10;
    //     }
    //     return count;
    // }

    // public static void main(String[] args) {
    //     int n=67888965;
    //     int num=6;
    //     System.out.println(countrep(n,num));
    // }

    // sum of all the digits

    // static int sumdig(int num){
    //     int temp=0;
    //     while(num>0){
    //         int b=num%10;
    //         temp+=b;
    //         num/=10;

    //     }
    //     return temp;
    // }

    // public static void main(String[] args) {
    //     int num=768432;
    //     System.out.println(sumdig(num));
    // }

    
    // static int gcd(int n1,int n2){
    //     int temp=0;
    //     while(n2!=0){
    //         temp=n2;
    //         n2=n1%n2;
    //         n1=temp;

    //     }
    //     return temp;
    // }
    // public static void main(String args[]) {
    //     Scanner sc=new Scanner(System.in);
    //     int n1=sc.nextInt();
    //     int n2=sc.nextInt();
    //     System.out.print(gcd(n1,n2));

    // }

    
        // public static void primeFactors(int n) {
        //     for (int i = 2; i <= n; i++) {
        //         while (n % i == 0) {
        //             System.out.print(i + " ");
        //             n = n / i;
        //         }
        //     }
        // }
    
        // public static void main(String[] args) {
        //     int number = 84;
        //     System.out.print("Prime factors of " + number + ": ");
        //     primeFactors(number);
        // }

        // static int inverse(int num) {
        //     int result = 0;
        //     int position = 1;
            
        //     while (num > 0) {
        //         int digit = num % 10;
        //         result += position * Math.pow(10, digit - 1);
        //         num /= 10;
        //         position++;
        //     }
            
        //     return result;
        // }
        
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int num = sc.nextInt();
        //     System.out.println(inverse(num));
        //     sc.close();
        // }

        
        
        //     public static void main(String[] args) {
        //         Scanner scanner = new Scanner(System.in);
        //         int sum = 0;
        
        //         while (true) {
        //             int number = scanner.nextInt();
                    
        //             if (sum + number < 0) {
        //                 break;
        //             }
                    
        //             sum += number;
        //             System.out.println(number);
        //         }
        
        //         scanner.close();
        //     }
        // }
        
    
}