package lecture21;
import java.util.Stack;
public class stk {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        System.out.println(stk.empty());
        stk.push(1);
        System.out.println(stk.peek());
        System.out.println(stk.search(1));
    }
    
}
