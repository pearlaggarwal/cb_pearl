package assignmentsW2;

import java.util.Scanner;

public class StonesontheTable {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        
        char[] arr=s.toCharArray();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
        }
        System.out.println(count);

    }
    
}
