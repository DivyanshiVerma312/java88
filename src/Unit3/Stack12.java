package Unit3;
import java.util.Stack;

public class Stack12 {
    public static void main(String[] args) {
        Stack <String> stk=new Stack<>();
        stk.push("first");
        stk.push("second");
        System.out.println(stk.size());
        System.out.println(stk.peek());
        System.out.println(stk.pop());


    }
}
