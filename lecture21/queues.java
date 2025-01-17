public class queues {

    private int[] arr;
    private int front=0;
    private int size=0;

    public queues(){
        arr=new int[5];
    }

    public queues(int n){
        arr=new int[n];
    }
    
    public boolean isEmpty(){
        return (size==0);
    }

    public void enQueue(int item){
        int ptr=front+size;
        arr[ptr]=item;
        size++;
    }
    public int deQueue(){
        int rv=arr[front];
        front++;
        size--;
        return rv;
    }

    public int get(){
        return arr[front];
    }
}
