import java.util.Scanner;
public class BinaryTree {

    public class Node{
        int val;
        Node Left;
        Node right;
    };
    Node root;
    Scanner sc=new Scanner(System.in);
    public BinaryTree(){
        root=createTree();
    }
    public Node createTree(){
        System.out.println("value: ");
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        
        System.out.println("has left ?");
        boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.Left=createTree();
        }
        System.out.println("HAS RIGHT?");
        boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=createTree();
        }
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
    public void Findmax(){
        System.out.println(findmax(root));
    }

    public int findmax(Node root){
        if(root==null) return -1;

        return Math.max(
            root.val,
            Math.max(findmax(root.Left),findmax(root.right))
        );
    }

    public void Finditem(int it){
        System.out.println(finditem(root,it));
    }
    public boolean finditem(Node root,int item){
        if(root==null){
            return false;
        }
        if(root.val==item){
            return true;
        }
        boolean l=finditem(root.Left,item);
        boolean r=finditem(root.right, item);        
        return (l||r);
    }
    public void Findheight(){
        System.out.println(height(root));
    }
    public int height(Node root){
        if(root==null){
            return 0;
        }
        int lefth=height(root.Left);
        int righth=height(root.right);
        return Math.max(lefth,righth);
    }
    public void INFIX(){
        infix(root);
    }
    public void infix(Node root){
        if(root==null) return;

        infix(root.Left);
        System.out.println(root.val+" ");
        infix(root.right);
    }
    public void PREFIX(){
        prefix(root);
    }
    public void prefix(Node root){
        if(root==null) return;
        System.out.println(root.val+" ");
        prefix(root.Left);
        prefix(root.right);
    }
    public void POSTFIX(){
        postfix(root);
    }
    public void postfix(Node root){
        if(root==null) return;
        postfix(root.Left);
        postfix(root.right);
        System.out.println(root.val+" ");
    }
    
}
