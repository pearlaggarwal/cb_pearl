package oops;

public class batch {
    String batch_name;
    int cost;
    String topic;
    // String s=mew string();
    
    // default contructor

    public batch(){
        this.batch_name="default_batch";
        this.cost=95000;
        this.topic="java";
    }

    public batch(  //Custom Constructor
        String batch_name,
        int cost,
        String topic
    ){
        this.batch_name= batch_name;
        this.cost= cost;
        this.topic= topic;
    }
    
}
