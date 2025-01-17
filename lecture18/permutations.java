package lecture18;

public class permutations {
    static String[] key={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    // MERGE SORT

    // static int[] mergesort(int[] arr){
    //     if(arr.length==1){            
    //     }
    // }

    // key pad

    static void keypad(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        String press=key[ch-'0'];
        for(int i=0;i<press.length();i++){
            keypad(ques.substring(1),ans+press.charAt(i));
        }
                
    }
    public static void main(String[] args) {
        // int[] arr={7,6,3,1,2,5,4};
        // mergesort(arr);

        keypad("245","");
    }
    
}
