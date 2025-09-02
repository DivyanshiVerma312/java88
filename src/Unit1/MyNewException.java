package Unit1;

public class MyNewException {
    public static void main(String[] args) {
        UserDefinedException udf=new UserDefinedException();
        try {
            udf.validate(17);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
