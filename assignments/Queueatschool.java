package assignments;

import java.util.Scanner;

public class Queueatschool {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();        
        String s = sc.next();
        char[] arr = s.toCharArray();
        
        for (int j = 0; j < t; j++) {
            for(int i=0;i<arr.length-1;i++){
                if (arr[i]=='B' && arr[i+1]=='G'){
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    i++;
                }
            }
        }
        System.out.println(new String(arr));        
    }
    
}
