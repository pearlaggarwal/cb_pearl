package assignments;

import java.util.Scanner;

public class Abeautifulyear {

    static boolean A_beautiful_year(int num){
        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n+1;
        while(!A_beautiful_year(num)){
            num++;
        }
        System.out.println(num);
        sc.close();
    }
}