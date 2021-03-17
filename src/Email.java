import java.util.Scanner;
import java.util.regex.Pattern;


public class Email {

    public static void main(String[] args) {
        System.out.println("Welcome to Email Validation program");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter you E-mail: ");
        String mail = scan.nextLine();
        System.out.println(mail);
        String exp = "^[a-zA-Z0-9]*";
        if(Pattern.matches(exp, mail))
            System.out.println("Email Valid");
        else
            System.out.println("Email Invalid");
    }
}
