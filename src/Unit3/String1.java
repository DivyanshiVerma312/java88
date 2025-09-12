package Unit3;
import java.util.Scanner;

public class String1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        String st1=sc.next();
        System.out.println(st.substring(0,4));
        System.out.println(st.length());
        System.out.println(st.toUpperCase());

        if(st.compareTo(st1)>0){
            System.out.println(st.compareTo(st1)+" if");
        }
        else{
            System.out.println(st.compareTo(st1)+" else");
        }
    }
}
