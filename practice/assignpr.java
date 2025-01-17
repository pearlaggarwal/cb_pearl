package practice;

import java.util.Scanner;

public class assignpr {
    // static int display(char[][] arr,int n,int m,int k,int s){
    //     for (int i = 0; i < n; i++) {
    //         if(s>k){
    //             for (int j = 0; j < m; j++) {

    //                 // if (s < 1) {
    //                 //     return false;
    //                 // }    
    //                 //System.out.print(arr[i][j] + " ");
    //                 if (arr[i][j]=='.'){
    //                     s-=2;
    //                     if(j<arr.length-1){
    //                         s-=1;
    //                     }
    //                 }
    //                 else if(arr[i][j]=='*'){
    //                     s+=5;
    //                     if(j<arr.length-1){
    //                         s-=1;
    //                     }
    //                 }
    //                 else if(arr[i][j]=='#'){
    //                     break;
    //                 }
    //             }

    //         }            //return true;
    //         //System.out.println();
            
    //     }
    //     return s;
    // }

    

    // public static void main(String[] args) {
        
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int m=sc.nextInt();
    //     int k=sc.nextInt();
    //     int s=sc.nextInt();
    //     char[][] arr=new char[n][m];
    //     for(int i=0;i<n;i++){
    //         //String row=sc.nextLine();
    //         for (int j=0;j<m;j++){
    //             arr[i][j]=sc.next().charAt(0);
    //         }
    //         sc.nextLine();
    //     }
    //     sc.close();
        
    //     int d=(display(arr,n,m,k,s));

    //     if(d>k){
    //         System.out.println("yes");
    //         System.out.println("d");
    //     }
    //     else{
    //         System.out.println("no");
    //     }



    // }

    
    public static void main(String[] args) {
		Scanner h = new Scanner(System.in);
        int n=h.nextInt();
        int m=h.nextInt();
        int k=h.nextInt();
        int s=h.nextInt();
        char [][]a= new char[n][m];
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                a[i][j]=h.next().charAt(0);
            }
        }
        int temp=0;
        for (int i=0;i<n;i++)
        { if(s<k)
                {
                     temp=1;
                     break;
                }
            
            for(int j=0;j<m;j++)
            {                
                if(a[i][j]=='.')
                {   if(j!=m-1)
                    {
                       s=s-3;
                    }
                       else
                       {
                       s=s-2;
                       }                      
                }
                else if(a[i][j]=='*')
                  {     if(j!=m-1)
                       s=s+4;
                       else
                       s=s+5;
                  }
                  else{
                     //j=m+1;;
                      break;
                      }
                       if(k>s)
                       { temp=1;
                           break;
                       }
              }              
        }
             if(temp==1)
              {
                  System.out.println("No");
              }
              else 
              {
                   System.out.println("Yes");
             System.out.println(s);
              }               
    }
}
    

