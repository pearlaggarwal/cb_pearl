package lecture26;

import java.util.Scanner;

public class BST {
    public class Node{
        int val;
        Node Left;
        Node right;
    };
    private Node root;
    public BST(int[] arr){
        root=CreateBST(arr,0,arr.length-1);
    }
    private Node CreateBST(int[] arr,int low,int high){
        if(low>high) return null;
        int mid=(low+high)/2;
        Node nn=new Node();
        nn.val=arr[mid];
        nn.Left=CreateBST(arr, low, mid-1);
        nn.right=CreateBST(arr,mid+1, high);
        return nn;
    }
    public void Display(){
        display(root);
    }

    public void display(Node nn){
        if(nn==null) return;
        String output="";
        output="<--"+nn.val+"-->";
        if(nn.Left==null){
            output="Null"+output;
        }
        else{
            output=nn.Left.val+output;
        }

        if(nn.right==null){
            output+="null";
        }
        else{
            output+=nn.right.val;
        }
        System.out.println(output);
        display(nn.Left);
        display(nn.right);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        BST bst=new BST(arr);
        bst.display(bst.root);
    }
}
