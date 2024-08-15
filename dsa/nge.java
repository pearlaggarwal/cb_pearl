package dsa;

public class nge {

    // to the right 

    // static int[] nger(int[] arr){
    //     int maxelement=0;
    //     int[] nger=new int[arr.length];
    //     for(int i=arr.length-1;i>=0;i--){
    //         nger[i]=maxelement;
    //         maxelement=Math.max(arr[i],maxelement);       

    //     }
    //     return nger;
    // }
    // public static void main(String[] args) {
    //     int[] arr={7,1,5,3,6,4};
    //     int[] num=nger(arr);
    //     for(int i:num){
    //         System.out.println(i+" ");

    //     }
    // }


    // to the left

    static int[] ngel(int[] arr){
        int maxelement=0;
        int[] ngel=new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            ngel[i]=maxelement;
            maxelement=Math.max(arr[i],maxelement);      
        }
        return ngel;
    }

    public static void main(String[] args) {
        int[] arr={3,7,2,5,8,4,9,1,6};
        int[] num=ngel(arr);
        for(int i:num){
            System.out.print(i+" ");
        }
    }
}


