package lecture10;

import java.util.Arrays;

import dsa.stringpractice;

public class array2D {

    static void populate(int[][] nums){
        int n=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=n;
                n++;
            }
        }

    }

    // Display
    static void display(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }        

    }

    // SUM
    static int populate1(int[][] nums){
        int n=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=n;
                n++;
            }
        }
        return n;

    }
    static int sum(int[][] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                count+=nums[i][j];
            }
        }  
        return count;    
    }

    // linear search

    static int[] search(int[][] nums,int n){
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if (n==nums[i][j]){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }                
            }
        }
        return ans;
    }

    // transpose 

    static void transpose(int[][] nums){
        //int[][] arr=
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
    }

    // Sorting
    //By rows
    static void sortbyrows(int[][] nums1){
        for(int i=0;i<nums1.length;i++){
            Arrays.sort(nums1[i]);
        }
    }

    //By coloumns
    static void sortbycol(int[][] nums1){
        Arrays.sort(nums1,(a,b)->Integer.compare(a[0],b[0]));

    }

    //whole 2d array
    static void sortcomplete(int[][] nums){
        int[] arr=flaten(nums);
        Arrays.sort(arr);
        fillarray(nums,arr);
    }

    static void fillarray(int[][] nums,int[] arr){
        int rows=nums.length;
        int cols=nums[0].length;
        //int[] arr=new int[nums.length*nums[0].length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=arr[cols*i+j];
            }
        }

    }

    static int[] flaten(int[][] nums){
        int rows=nums.length;
        int cols=nums[0].length;
        int[] arr=new int[nums.length*nums[0].length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                arr[cols*i+j]=nums[i][j];
            }
        }
        return arr;
    }

    // reverse the matrix

    static void reversematrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            int j=0;
            int k=matrix[0].length-1;
            while(j<k){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;k--;
            }

        }
    }

    // ques 74 and 240


    public static void main(String[] args) {
        // initialize 2D Array

        //int[][] nums=new int[4][4];
        
        //populate1(nums); 

        int[][] nums={{1,4,3},{8,6,7},{2,5,9}};
        //sortbyrows(nums);
        // sortbycol(nums);
        // display(nums);
        sortcomplete(nums);
        display(nums);
               
        // transpose(nums);
        // display(nums);

        reversematrix(nums);
        display(nums);
        
        // int[] ind=search(nums,4);
        // System.out.println("i:"+ind[0]+" j:"+ind[1]);
        

        //System.out.println(sum(nums));

        //display(nums);        

        //int[] nums={1,2,3};
        // int[][] nums1={
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12}};
        // System.out.println(nums1[1][1]);

    }

    // QUES 74

    // static boolean searchmatrix(int[][] matrix,int target){
    //     int ans=0;
    //     int low=0,high=matrix.length-1;
    //     while(low<high){
    //         int mid=low+(high-low)/2;
    //         if(matrix[mid][0]==target){
    //             return true;
    //         }else if(matrix[mid][0]<target){
    //             ans=mid;
    //             low=mid+1;
    //         }else{
    //             high=mid-1;
    //         }
    //     }

    //     low=0;high=matrix[0].length-1;
    //     while(low<=high){
    //         int mid=low+(high-low)/2;


    //     }

    // }
}
