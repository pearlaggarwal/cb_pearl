package lecture12;

public class recursion2 {

    //fibonacci series

    static int fibonaccis(int x){
        if(x==0||x==1)
            return x;
        int fib1=fibonaccis(x-1);
        int fib2=fibonaccis(x-2);
        return (fib1+fib2);
        
        //return n;
    }

    // subsequence

    static void subsequence(String ques,String ans){
        if(ques.length()==0) {
            System.out.println(ans);
            return;
        }
        subsequence(ques.substring(1),ans+ques.charAt(0));
        subsequence(ques.substring(1),ans);
    }

    // coin toss

    static void cointoss(int n,String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        cointoss(n-1, ans+"H");
        cointoss(n-1, ans+"T");    
    }

    // count coin toss

    static int countcointoss(int n){
        if(n==0){
            return 0;
        }        
        if(n==1){
            return 2;
        }
        int l=countcointoss(n-1);
        int r=countcointoss(n-1);
        return l+r;   
    }

    // count subsequence

    static int countsubsequence(String ques,String ans){
        if(ques.length()==0) {
            return 1;
        }
        int l=countsubsequence(ques.substring(1),ans+ques.charAt(0));
        int r=countsubsequence(ques.substring(1),ans);
        return l+r;
    }

    // generate valid parenthesis

    static void generateparenthesis(int n,String ans,int l,int r){
        if (l == n && r == n){
            System.out.println(ans);
            return;
        }
        if (l < n){
            generateparenthesis(n, ans+"{", l+1, r);
        }
        if (r < l) {
            generateparenthesis(n, ans + "}", l, r + 1);
        }        
    }

    // ques 22 LC

    // permuatations

    static void permuatations(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<ques.length();i++){
            permuatations(ques.substring(0, i)+ques.substring(i+1), ans+ques.charAt(i));
        }
    }


    public static void main(String[] args) {

        permuatations("abc","");

        //generateparenthesis(3," ",0,0);

        //System.out.println(countsubsequence("car",""));

        //System.out.println(countcointoss(1));

        //cointoss(1, "");
        //subsequence("CAR", "");
        //System.out.println(fibonaccis(3));
        // int n=10;
        // for(int i=0;i<n;i++){
        //     System.out.print(fibonaccis(i));

        // }
        
    }
    
}
