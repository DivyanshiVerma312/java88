package Unit3;
import java.util.ArrayList;


import java.util.*;
import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> products=new ArrayList<>();
        System.out.println("Enter the number of Products");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            products.add(sc.next());
        }
        Collections.sort(products);
        Iterator it=products.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println(" ");
        products.add(1,"Apple");
        products.addLast("Banana");
        products.addFirst("Orange");
        System.out.println(products.get(1));
        Iterator ib=products.iterator();

        while(ib.hasNext()){
            System.out.print(ib.next()+" ");
        }
        System.out.println(" ");

    }
}
