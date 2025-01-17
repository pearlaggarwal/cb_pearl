public class implementqueue {

    public static void main(String[] args) {
        
        queues q=new queues();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        //System.out.println(q.deQueue()+" ");
        while(!q.isEmpty()){
            System.out.print(q.deQueue()+" ");
        }
        
    }
    
}
