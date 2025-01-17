package lecture20;

//import dsa.leetcodepr;

public class LL_util {
    public static void main(String[] args) {
        Linked_list ll=new Linked_list();
        ll.addfirst(40);
        ll.addfirst(30);
        ll.addfirst(20);
        ll.addfirst(10);
        //System.out.println(ll);
        ll.display();
        ll.addlast(100);
        ll.display();
        ll.addatindex(4, 90);
        ll.display();
    }
    
}
