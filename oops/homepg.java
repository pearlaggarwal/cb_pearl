package oops;

public class homepg {
    public static void main(String[] args) {
        // cat c1=new cat();
        // cat c2=new cat(
        //     "kitty",
        //     "brown",
        //     "Siamese cat"
        // );
        // System.out.println(c2.cat_name+c2.cat_colour+c2.cat_breed);
        // c1.cat1();

        Cat1 cat=new Cat1(
            "billi","meow","black",4,true
        );
        cat.editname("kalu");
        System.out.println(cat.callcat());
        



    }
    
}
