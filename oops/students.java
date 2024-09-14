package oops;

public class students {
    int roll;
    String name;
    batch enrolled_batch;

    public students(){
        this.roll=0;
        this.name="unknown";
        this.enrolled_batch=new batch();
    }

    public students(
        int roll,
        String name,
        String batch_name,
        int batch_cost,
        String batch_topic
    ){
        this.roll=roll;
        this.name=name;
        enrolled_batch=new batch(
            batch_name,
            batch_cost,
            batch_topic
        );

    }

    void study(){
        System.out.println(this.name+" is Studying");
    }


    
}
