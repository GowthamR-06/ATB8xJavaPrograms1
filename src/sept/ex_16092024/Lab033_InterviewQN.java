package sept.ex_16092024;

public class Lab033_InterviewQN {
    public static void main(String[] args) {

        String firstname = "gowtham";
        String lastname = "Ravi";
        int a =10;
        int b=12;
//+ concatination operator
        System.out.println(firstname + lastname);//concats two string
        System.out.println(a+firstname + lastname+b);//concats two string
        System.out.println(firstname + lastname+a+b);//if first two value string is concats all operants
        System.out.println(a+b+firstname + lastname);//if first two integer add the integer and concats string value
        System.out.println(firstname + lastname+(a+b));//if use brackets it executes brackets first and concats the string




    }
}
