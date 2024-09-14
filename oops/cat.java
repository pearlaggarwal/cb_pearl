package oops;

public class cat {
    String cat_name;
    String cat_colour;
    String cat_breed;

    // default construction
    public cat(){
        this.cat_name="kitty";
        this.cat_colour="brown";
        this.cat_breed="Siamese cat";
    }

    public cat(
        String cat_name,
    String cat_colour,
    String cat_breed
    ){
        this.cat_name=cat_name;
        this.cat_colour=cat_colour;
        this.cat_breed=cat_breed;
    }

    void cat1(){
        System.out.println("meoww ");
    }
}
