import java.util.Scanner;
import java.util.regex.Pattern;

public class Email {

    public static void emailCheck() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you E-mail: ");
        String mail = scan.nextLine();
        System.out.println(mail);
        String exp = "^[a-zA-Z0-9]+([.+_-]{0,1}+[a-zA-Z0-9])*+[@]+[a-zA-Z]+[.]+[a-zA-Z]{2,4}+([.]{1}+[a-zA-Z]{0,2})*";
        if(Pattern.matches(exp, mail))
            System.out.println("Email Valid");
        else
            System.out.println("Email Invalid");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Email Validation program");
        emailCheck();
    }
}
