package dsa;

public class stringpractice {

    
        
        // QUES 1: Function to reverse a string  Ex: potato -> otatop

        // String s1="potato";
        // String s2="";
        //  for(int i=0;i<s1.length();i++){
        //     s2=s1.charAt(i)+s2;
            
        // }
        // System.out.println(s2);


        // QUES 2: CHECK if palindrome or nor EX: detartrated -> TRUE

    // static boolean palindrome(String s1){
    // int i=0;int j=s1.length()-1;
    // while(i<=j){
    //     if (s1.charAt(i)!=s1.charAt(j))
    //         return false;
    //     i++;j--;

    // }
    // return true;
    // }


    // QUES 3 MAX OCCURANCE IN SORTED STRING

    // static char maxocc(String s1){
    //     int countmax=0;
    //     int countcurr=0;
    //     char maxele='*';
    //     char currentele='*';
    //     for (int i=0;i<s1.length();i++){
    //         if (s1.charAt(i)!=currentele){
    //             if(countcurr>countmax){
    //                 countmax=countcurr;
    //                 maxele=currentele;
    //             }
    //             currentele=s1.charAt(i);
    //             countcurr=1;
    //         }
    //         else{
    //             countcurr++;
    //         }

    //     }
    //     if(countcurr>countmax){
    //         countmax=countcurr;
    //         maxele=currentele;
    //     }
    //     return maxele;

    // }


    // Q4 MAX OCCURING ELEMENT IN A STRING

    // static char maxocc2(String s){
    //     int[] arr= new int[26];
    //     for(int i=0;i<s.length();i++){
    //         arr[s.charAt(i)-'a']++;
            
    //     }
    //     int index=0;
        
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[index]<arr[i]){
    //             index=i;
    //         }
    //     }
    //     return (char)('a'+index);

    // }


    // QUES 5 FUNCTION TO REVERSE THE WORDS OF STRING 
    // EX= the bird is flying -> flying is bird the

    static void revword(String s5){
        String[] arr=s5.split("\\s");
        String temp="";
        for (int i=arr.length-1;i>=0;i--){
            //System.out.print(arr[i]+" ");
            temp+=arr[i]+" ";
        }
        temp=temp.trim();
        System.out.println(temp);
    }


    // QUES LEETCODE 424

    public static void main(String[] args) {

        //String s1="detartrated";
        //String s1="aaabbbbcc";
        //String s="abbcccbbbaacccc";
        String s5="the bird is flying";

        //System.out.println(palindrome(s1));
        //System.out.println(maxocc(s1));
        //System.out.println(maxocc2(s));
        revword(s5);


           
    }

}
        
    

