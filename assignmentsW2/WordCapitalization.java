package assignmentsW2;

import java.util.Scanner;

public class WordCapitalization {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        
        char[] arr=s.toCharArray();
        int i=0;
       
        if(Character.isLowerCase(arr[i])){
            arr[i]=Character.toUpperCase(arr[i]);
        }
        String s2=new String(arr);
        System.out.println(s2);
    }
    
}
