package dsa;
import java.util.Arrays;
public class sorting{
    // static void selectionSort(int[] arr){
    //     for (int i=0;i<arr.length-1;i++){
    //         int idx=minimumValue(arr,i);
    //         int temp=arr[i];
    //         arr[i]=arr[idx];
    //         arr[idx]=temp;
    //     }
    // }
    
    // static int minimumValue(int[] arr,int a){
    //     int mini=a;
    //     for(int i=a+1;i<arr.length;i++)
    //         if(arr[mini]>arr[i])
    //             mini=i;
    //     return mini;
    
    // }
    
        // static void display(int[] arr){
        //     for(int i:arr){
        //         System.out.print(i+" ");
        //     }
            
        // }
    
        
    
        // public static void main(String[] args) {
        //     int[] arr={9,8,1,2,3,6,5,4,7};
        //     selectionSort(arr);
        //     display(arr);
        // }
    
        // insertion sort
    
        static void display(int[] arr){
            for(int i:arr){
                System.out.print(i+" ");
            }
            
        }
    
        static void insertionSort(int arr[]){
            //int n=arr.length;
            for(int i=1;i<arr.length;i++){
                int key=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    --j;
                }
                arr[j+1]=key;
            }
        }
    
        public static void main(String[] args) {
            int[] arr={1,6,9,8,7,2,3,5};
            Arrays.sort(arr);
            System.out.println(Arrays.binarySearch(arr,3));  
            //insertionSort(arr);
            //display(arr);
        }
    }
    


    
        

    

    
        
