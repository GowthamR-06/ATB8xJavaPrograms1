package Task;


public class Task005_TypeCasting {
    public static void main(String[] args) {
        //Typecasting
        //Widerning
        short rollno=1000;
        int number = rollno;//implicit
        int number1 = (int)rollno;//explicit

        //narrowing

        float percentage=87.87f;
        //int roundoff = percentage; implicit
        int roundoff = (int)percentage;//explicit


    }
}
