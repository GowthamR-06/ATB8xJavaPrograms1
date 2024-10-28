package sept.ex_18092024;


public class Lab050_TypeCasting {
    public static void main(String[] args) {
        //Type casting is conversion of one data type to another data
        /* There are two type
        * Narrowing-->implicit and explicit --> data loss occurs
        * widerening-->implicit and explicit --> data loss doesnt occurs*/

        //Widening
        //Implicit
        byte a =10;
        int b= a;

        //Explcit
        short c=20;
        long d = (long) c;

        //Narrowing
        //Implicit --> JVM doesnt allow implicit narrowing it throws error while compiling
        int a1=10;
       // byte a2=a1; implicit line
        byte a2=(byte)a1; // explicit


    }
}
