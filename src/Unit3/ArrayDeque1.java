package Unit3;
import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque<String> adq= new ArrayDeque<>();
        adq.add("First");
        adq.add("Second");
        adq.add("Third");
        System.out.println(adq);
        System.out.println(adq.offerFirst("-1"));
        System.out.println(adq.offerLast("3"));
        System.out.println(adq);
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());


    }

}