import java.util.Scanner;

public class Main {

    private static final String EMAIL = "rifus@gmail.com";
    private static final String PASS = "a123456";

    public static void main(String[] args) {
        String writedEmail = writeEmail();
        String writedPass = writePass();
        boolean validateLogin = compareEmailAndPass(writedEmail, writedPass);
        isValidTheLogin(validateLogin);
    }

    private static void isValidTheLogin(boolean validateLogin) {
        System.out.println("Has login the user?: " + validateLogin);
    }

    private static boolean compareEmailAndPass(String writedEmail, String writedPass) {

        return comparingEmailAndPass(writedEmail, writedPass);
    }

    private static boolean comparingEmailAndPass(String writedEmail, String writedPass) {
        if (writedEmail.equals(EMAIL) && writedPass.equals(PASS)) {
            return true;
        }
        return false;
    }

    private static String writePass() {
        System.out.println("Write the password");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static String writeEmail() {
        System.out.println("Write the email");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
