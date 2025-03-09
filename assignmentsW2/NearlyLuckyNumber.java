package assignmentsW2;

import java.util.Scanner;

public class NearlyLuckyNumber {

    static void lucky_number(String s){
        //String s=String.valueOf(n);
        int count=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == '4' || s.charAt(i) == '7') { 
                count++;
            }
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //long n=sc.nextInt();
        String s=sc.next();
        lucky_number(s);      

    }
    
}
