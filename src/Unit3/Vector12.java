package Unit3;
import java.util.Stack;
import java.util.Vector;

public class Vector12 {
    public static void main(String[] args) {
        Vector<String> vec= new Vector<>(5,5);
        Stack<String> stk= new Stack<>();
        stk.push("First");
        stk.push("Second");
        stk.push("Third");
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.size());
        stk.clear();
        System.out.println(stk.isEmpty());
//        vec.add("First");
//        vec.add("Second");
//        vec.add("Third");
//        vec.add("Four");
//        System.out.println(vec.capacity());
//        System.out.println(vec.size());
    }
}
