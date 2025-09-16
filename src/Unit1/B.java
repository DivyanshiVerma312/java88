package Unit1;

public class B{
    static int bread = 10;
    public static void display(){
        System.out.println("Slice remaining: "+bread);
    }
    public static void eat(){
        bread--;
    }
}