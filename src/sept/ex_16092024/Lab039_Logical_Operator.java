package sept.ex_16092024;

public class Lab039_Logical_Operator {

    public static void main(String[] args) {
        //Llogical operator returns boolean result
        // ! && ||
        // ! - if the result is true then  output is false
        // For &&(AND) both the value is true then output is true others are false
        // For ||(OR) if both the values is false then output is false other condition are always true

        boolean a =true;
        boolean b=true;
        boolean d=false;
boolean c = a && b;
boolean e = a && d;
boolean f = a || d;
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);
        System.out.println(!f);



    }
}
