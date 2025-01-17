//package lecture35;

public class DP1{
    static int fibonaccis(int n){
        if(n==0||n==1){
            return n;
        }
        int fib1=fibonaccis(n-1);
        int fib2=fibonaccis(n-2);
        return (fib1+fib2);
    }
    static int fibo_dp(int n,int[] dp){
        if(n==0||n==1){
            return n;
        }
        if (dp[n]!=0){
            return dp[n];
        }
        int fib1=fibo_dp(n-1,dp);
        int fib2=fibo_dp(n-2,dp);
        return dp[n]=(fib1+fib2);
        
    }
    static int fibo_BU(int n){
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {        
        //System.out.println(fibonaccis(6));
        //System.out.println(fibo_dp(6,new int[100]));
        System.out.println(fibo_BU(6));
    }
}