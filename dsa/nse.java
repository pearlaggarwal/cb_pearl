package dsa;

public class nse {

    static int[] nser(int[] arr){
            
            int[] nser=new int[arr.length];
            int minelement=Integer.MAX_VALUE;
            for(int i=arr.length-1;i>=0;i--){
                if (minelement==Integer.MAX_VALUE){
                    nser[i]=0;
                }
                else{
                    nser[i]=minelement;
                }
                minelement=Math.min(arr[i],minelement); 
                    
                
    
            }
            return nser;
        }
        public static void main(String[] args) {
            int[] arr={9,6,4,1,7,3,5,2,8};
            int[] num=nser(arr);
            for(int i:num){
                System.out.print(i+" ");
    
            }
        }


        // static int[] nsel(int[] arr){
            
        //     int[] nsel=new int[arr.length];
        //     int minelement=Integer.MAX_VALUE;
        //     for(int i=0;i<=arr.length-1;i++){
        //         if (minelement==Integer.MAX_VALUE){
        //             nsel[i]=0;
        //         }
        //         else{
        //             nsel[i]=minelement;
        //         }
        //         minelement=Math.min(arr[i],minelement); 
                    
                
    
        //     }
        //     return nsel;
        // }
        // public static void main(String[] args) {
        //     int[] arr={9,6,4,1,7,3,5,2,8};
        //     int[] num=nsel(arr);
        //     for(int i:num){
        //         System.out.print(i+" ");
    
        //     }
        // }
    
}
