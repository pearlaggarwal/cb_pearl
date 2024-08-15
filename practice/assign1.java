package practice;

import java.util.Scanner;

public class assign1{

    // QUES 1 sum of odd and even place digits

    // static void sumoddeven(int i){
    //     int sumeven=0;
    //     int sumodd=0;
    //     boolean numplace=true;
    //     while (i>0){
    //         int num=i%10;
    //         if (numplace){
    //             sumeven+=num;
    //         }
    //         else{
    //             sumodd+=num;
    //         }
    //         i=i/10;
    //         numplace=!numplace;
    //     }
    //     System.out.println("summ of even place:"+sumeven);
    //     System.out.println("summ of odd place:"+sumodd); 
    // }
    // public static void main(String[] args) {
    //     int n;
    //     Scanner sc= new Scanner(System.in);
    //     n=sc.nextInt();
    //     sumoddeven(n);
    //     System.out.println();    
    // }





    // QUES 2 count repeated digits

    // static void countdigit(int a,int b){
    //     int count=0;
    //     while(a>0){
    //         if ( a%10 == b){
    //             count++;
    //         }
    //         a/=10;
    //     }
    //     System.out.println(count);
    // }
    // public static void main(String[] args) {
    //     int n;
    //     int m;
    //     Scanner sc= new Scanner(System.in);
    //     //Scanner scc= new Scanner(System.in);
    //     n=sc.nextInt();
    //     m=sc.nextInt();  
    //     countdigit(n,m);
    //     System.out.println();
    // }
    




    // QUES 3 print reverse
    
    // static int printrev(int a){
    //     int temp=0;
    //     while(a!=0){
    //         temp=temp*10+a%10;
    //         a/=10;
    //     }
    //     return temp;
    // }
    // public static void main(String[] args) {
    //     int n;
    //     Scanner sc=new Scanner(System.in);
    //     n=sc.nextInt();
    //     System.out.println(printrev(n));
    // }





    //QUES 4 check prime

    // static void checkprime(int n){        
    //     for(int i=2;i<n;i++){
    //         if (n%i==0){
    //             System.out.println("Not Prime");
    //         }
    //         else{
    //             System.out.print("Prime");
    //         }
    //     }        
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     checkprime(n);
    // }





    //QUES 5 fahreneit to celcius

    // static void fahtocel(int n,int m,int s){
    //     for(int min=n;min<=m;min+=s){
    //         int i=((min-32)*5)/9;
    //         System.out.println(min+" "+i);
    //     }        
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int m=sc.nextInt();
    //     int s=sc.nextInt();       
    //     fahtocel(n,m,s);
    // sc.close();
    // }





    //QUES 6 binary to decimal

    // static int bintodec(int n){
    //     int count=0;
    //     int k=0;
    //     while(n!=0){
    //         int i=n%10; 
    //         count+=(Math.pow(2,k))*i; 
    //         k++;
    //         n/=10;
    //     }
    //     return count;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     System.out.print(bintodec(n));
    // }





    // QUES 7 replace zero with 5

    // static int replace(int n){
    //     if (n==0){
    //         return 5;
    //     }
        
    //     else{
    //         int fi=0;
    //         int num=1;
    //         while(n!=0){
    //             int i=n%10;
    //             if (i==0){
    //                 i=5;
    //             }
    //             fi+=i*num;
    //             num*=10;
    //             n/=10;
    //         }
    //         return fi;
    //     }

    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     System.out.println(replace(n));
    //     sc.close();
    // }





    // QUES 8 print series

    // static void printseries(int n1,int n2){
    //     int count=0;
    //     int s=1;
    //     while (count < n1) {
    //         int k = (3 * s) + 2;
    //         if (k % n2 != 0) {
    //             System.out.print(k + " ");
    //             count++;
    //         }
    //         s++;
    //     }
    // }
    // public static void main(String[] args) {
    //         Scanner sc=new Scanner(System.in);
    //         int n1=sc.nextInt();
    //         int n2=sc.nextInt();
    //         printseries(n1,n2);
    //     sc.close();
    //     }





    // QUES 9 print all amstrong number

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
    //     while(temp!=0){
    //         sum+=Math.pow((temp%10),d);
    //         n/=10;
    //     }
    //     return (sum==temp);        
    // }
    // static void printarm(int st,int en){
    //     for(int i=st;i<=en;i++){
    //         if (checkarm(i)) {
    //             System.out.print(i);
    //         }   
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int m=sc.nextInt();        
    //     printarm(n,m);        
    //     System.out.println();
    // sc.close();
    // }





    


    // QUES 10 check armstrong numbr between given 2 numbers

//     static int countd(int n) {
//         int count = 0;
//         while (n != 0) {
//             n /= 10;
//             count++;
//         }
//         return count;
//     }
//     static boolean checkarm(int n) {
//         int d = countd(n);
//         int sum = 0;
//         int temp = n;
//         while (temp != 0) {
//             sum += Math.pow((temp % 10), d);
//             temp /= 10;
//         }
//         return (sum == n);
//     }
//     static void printarm(int st, int en) {
//         for (int i = st; i <= en; i++) {
//             if (checkarm(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);        
//         int n = sc.nextInt();        
//         int m = sc.nextInt();
//         printarm(n, m);
//         System.out.println();
//         sc.close();
//     }






// QUES 11 GCD (HCF) and LCM 

// static int gcd(int n1, int n2) {
//     while (n2!= 0) {
//         int temp = n2;
//         n2 = n1 % n2;
//         n1 = temp;
//     }
//     return n1;
// }
// static int lcm(int n1,int n2){
//     return (n1*n2)/gcd(n1, n2);
// }
// public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2=sc.nextInt();
//         System.out.print(lcm(n1,n2));
//         sc.close();
//     }






// QUES 13 odd even 

// static void checkoddeven(int n){  
//     int count=0;
//     int count1=0;
//     while (n>0){
//         int temp=n%10;
//         if (temp%2==0){
//             count+=temp;
//         }
//         else{
//             count1+=temp;
//         }
//         n/=10;
//     }    
//     if (count % 4 == 0 || count1 % 3 == 0)
//         System.out.println("YES");    
//     else
//         System.out.println("NO");
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     for (int i = 0; i <n; i++) {
//         int nm = sc.nextInt(); // Car number
//         checkoddeven(nm);
//     }
//     sc.close();
// }






// QUES 14 FIBONACCI SERIES
    // static int fibonacci(int n){
    //     int count=0;
    //     int fir=0;
    //     int sec=1;
    //     for(int i=0;i<n;i++){
            
    //         count=fir+sec;
    //         fir=sec;
    //         sec=count;
    //     }
    //     return fir;
        
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     System.out.println(fibonacci(n));
    //     sc.close();
    // }






    //QUES 15 SHOPPING GAME
    // static void shop(int m,int n){
    //     int ayush=1;
    //     int harshit=2;
    //     int totalay=0;
    //     int totalhar=0;        
    //     while (true){            
    //         if (totalhar+harshit>n) {
    //             System.out.println("Ayush");
    //             break;
    //         }
    //         totalhar+=harshit;
    //         if(totalay+ayush>m){
    //             System.out.println("Harshit");
    //             break;
    //         }
    //         totalay+=ayush;
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int t=sc.nextInt();
    //     for(int i=0;i<t;i++){
    //         int m=sc.nextInt();
    //         int n=sc.nextInt();
    //         shop(m,n);
    //     }       
    //     sc.close();
    // }






    // QUES 16 Boston number 
    
    // static int primefactor(int n){
    //     int temp=0;
    //     for(int i=2;i<=n;i++){
    //         while (n%i==0){
    //             temp+=sumdigit(i);
    //             n/=i;
    //         }
    //     }   
    //     return temp;     
    // }
    // static int sumdigit(int n){
    //     int count=0;
    //     while(n>0){
    //         count+=n%10;
    //         n/=10;
    //     }
    //     return count;
    // }
    // static void bostonnumber(int n){
        
    //     if (sumdigit(n)==primefactor(n)){
    //         System.out.println("1");
    //     }
    //     else{
    //         System.out.println("0");
    //     }

    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     bostonnumber(n);
    //     sc.close();
    // }






    // QUES 17 CHEWBACCA NUMBER

    // static long chewbacca(long num){
    //     long newn=0;
    //     long temp=1;
    //     long last=0; 
    //     while(num>0){
    //         long dig=num%10;            
    //         last=9-dig;
    //         if (last<dig){
    //             newn+=last*temp;
    //         }       
    //         else if(last==0){
    //             newn+=dig*temp;
    //         }
    //         else{
    //             newn+=dig*temp;
    //         }     
    //         temp*=10;  
    //         num/=10;            
    //     }
    //     return newn;    
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner (System.in);
    //     long num=sc.nextLong();
    //     System.out.println(chewbacca(num));
    //     sc.close();
    // }





    // ques 18 inverse of number 

    // static int inverse(int num){
    //     int k=1;
    //     int n=0;
    //     while(num>0){
    //         int digit=num%10;
    //         n+=k*(Math.pow(10,digit-1));                
    //         num/=10;
    //         k++;                
    //     }           
    //     return n;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int num=sc.nextInt();
    //     System.out.println(inverse(num));
    //     sc.close();
    // }







    // QUES 19 SIMPLE INPUT
    
    // public static void main(String[] args) {
    //     int sum=0;
    //     Scanner sc=new Scanner(System.in);
    //     while(sc.hasNextInt()){
    //         int n=sc.nextInt();
    //         sum+=n;
    //         if(sum>=0)
    //             System.out.println(n);
            
    //         else break;
            
    //     }        
    // }






    // QUES 20 convesion any to any
    // static int decimal(int sb,int sn){
    //     int count=0;
    //     int k=0;
    //     while (sn>0){
    //         int dig=sn%10;
    //         count+=dig*(Math.pow(sb,k));
    //         k++;
    //         sn/=10;
    //     }
    //     return count;
    // }
    // static int convert(int db,int num){
        
    //     int temp=0;
        
    //     int n=1;
    //     while (num>0){
    //         temp+=(num%db)*n;
    //         n*=10;
    //         num/=db;
    //     }
    //     return temp;

    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int sb=sc.nextInt();
    //     int db=sc.nextInt();
    //     int sn=sc.nextInt();
    //     int num=decimal(sb,sn);
    //     System.out.println(convert(db,num));
    //     sc.close();
    // }


}

