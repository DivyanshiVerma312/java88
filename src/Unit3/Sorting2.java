package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(20,"abhi",100));
        al.add(new Student(21,"rahul",101));
        al.add(new Student(22,"ravi",102));
        al.add(new Student(23,"raju",103));
        al.add(new Student(24,"alakh",104));
        al.add(new Student(25,"nikhil",105));
        Collections.sort(al);
        for(Student st:al){
            System.out.println("Name "+st.name+"Age "+st.age+"Roll_no "+st.roll_no);
        }


    }
}
