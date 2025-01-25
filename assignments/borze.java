package assignments;

import java.util.Scanner;

public class borze {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        //char[] arr=s.toCharArray();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                ans.append("0");
            }
            else if(s.charAt(i)=='-' && s.charAt(i+1)=='.'&& i+1<s.length()){
                ans.append("1");
                i++;
            }
            else if(s.charAt(i)=='-' && s.charAt(i+1)=='-' && i+1<s.length()){
                ans.append("2");
                i++;
            }
        }
        System.out.println(ans.toString());
        sc.close();
    }
    
}
