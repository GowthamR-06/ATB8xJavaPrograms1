package sept.ex_13092024;

public class Lab_024_CharLiteral {
    public static void main(String[] args) {
        //Char literals
        //single char
        char a='A';
        char b='B';

        //Escape char literal
        char newline ='\n';
        char backslash = '\b';
        char tab='\t';

        System.out.println("first name is gowtham"+newline+"last name is ravi");
        System.out.println("first name is gowtham"+backslash+"last name is ravi");
        System.out.println("first name is gowtham"+tab+"last name is ravi");

        //AACII literal
        char e='E';
        //Unicode literal
        char g='\u0001';
    }
}
