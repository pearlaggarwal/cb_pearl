package oops;

public class Cat1 extends Animals{
    private String name="NA";
    String voice="NA";
    String colour="NA";

    //getter 
    public String callcat(){
        return this.name;
    }

    //setter
    public void editname(String name){
        this.name=name;

    }

    // default
    public Cat1(){}

    //parameterized

    public Cat1(
        String name,
        String voice,
        String colour,
        int legs,
        boolean tail
    ){
        this.name=name;
        this.voice=voice;
        this.colour=colour;
        this.legs=legs;
        this.tail=tail;

    }
    
}
