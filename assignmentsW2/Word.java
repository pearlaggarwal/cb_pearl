package assignmentsW2;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int lo=0;
        int up=0;
        char[] arr=s.toCharArray();
        //StringBuilder ans =new StringBuilder();
        for(char i : arr){
            if(Character.isLowerCase(i)){
                lo++;
            }
            if(Character.isUpperCase(i)){
                up++;
            }
        }
        if(lo>up || lo==up){
            System.out.println(s.toLowerCase());
        }
        if(lo<up){
            System.out.println(s.toUpperCase());
        }
    }
    
}
