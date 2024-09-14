package lecture12;

public class recursion {

    static int multipy(int a,int b){
        if(a==1)
            return b;
        int x=b+multipy(a-1, b);
        return x;
    }

    static int fact(int n){
        if(n==0||n==1)
            return 1;
        int x=n*fact(n-1);
        return x;
    }

    static int tailfact(int n,int x){
        if(n==0||n==1)
            return x;
        return (tailfact(n-1, x*n));

    }

    static int power(int a,int b){
        if (b==0)
            return 1;
        int x=power(a, b-1)*a;
        return x;
    }

    static int tailpower(int a,int b,int x){
        if(b==0)
            return x;
        return tailpower(a, b-1, a*x);
    }


    public static void main(String[] args) {
        int n=3;
        int m=4;
        int x=1;
        //System.out.println(multipy(n,m));
        //System.out.println(fact(n));
        //System.out.println(power(n, m));
        //System.out.println(tailfact(m,x));
        //System.out.println(tailpower(n,m, x));

    }
    
}
