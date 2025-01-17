package lecture20;

public class Linked_list {
    class Node{
        int data;
        Node next;
    }
    Node head;
    private Node tail;
    private int size;
    // TC=O(1)

    public void addfirst(int item){
        Node nn=new Node();
        nn.data=item;
        if(size==0){
            head=nn;
            tail=nn;
            //size++;
        }
        else{
            nn.next=head;
            head=nn;
            //size++;
        }
        size++;
    }

    public void addlast(int item){
        if (size==0){
            addfirst(item);
        }
        else{
            Node nn=new Node();
            nn.data=item;
            tail.next=nn;
            tail=nn;
            size++;
        }
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data);
            temp=temp.next;
        }
        System.out.println("NULL");

    }
    public Node getnode(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public void addatindex(int item,int index){
        if(index==0) addfirst(item);
        else if(index== size) addlast(item);
        else{
            Node nn=new Node();
            nn.data=item;

            Node k_1th = getnode(index-1);
            nn.next=k_1th.next;
            k_1th.next=nn;

            size++;
        }
    }

    public int getfirst(){
        return head.data;
    }

    public int getlast(){
        return tail.data;
    }

    public int getindex(int k){
        if(k<0||k>=size){
            return -1;
        }
        else if(k==0){
            return getfirst();

        }
        else if(k==size-1){
            return getlast();
        }
        else{
            return getnode(k).data;
        }

    }

    public int removefirst(){
        int rv=head.data;
        if(size==1){
            head=null;
            tail=null;
            
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;
        return rv;
    }
    public int removelast(){
        if(size==1){
            return removefirst();
        }
        else{
            int rv=tail.data;
            Node s1=getnode(size-2);
            s1.next=null;
            tail=s1;
            size--;
            return rv;
        }
    }
    public int removeindex(int k){
        if(k==0){
            return removefirst();
        }
        else if(k==size-1){
            return removelast();
        }
        else{
            Node k_1th=getnode(k-1);
            Node k_th=k_1th.next;
            k_1th.next=k_th.next;
            k_th.next=null;
            size--;
            return k_th.data;
        }

    }
    public int size(){

        return size;
    }


    
}
