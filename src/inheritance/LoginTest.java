package inheritance;

import java.util.Scanner;

public class LoginTest extends Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login lg = new Login();

        boolean continueOperations = true;

        while (continueOperations) {
            System.out.println("Do you want to register or login or change password? (Type 'exit' to quit)");
            String option = sc.nextLine();

            switch (option) {
                case "register":
                    System.out.println("Enter userid");
                    String useridReg = sc.nextLine();

                    System.out.println("Enter password");
                    String passwordReg = sc.nextLine();

                    System.out.println("Enter email");
                    String emailReg = sc.nextLine();

                    lg.register(useridReg, passwordReg, emailReg);
                    break;

                case "login":
                    System.out.println("Enter userid");
                    String useridLogin = sc.nextLine();

                    System.out.println("Enter password");
                    String passwordLogin = sc.nextLine();

                    lg.login(useridLogin, passwordLogin);
                    break;

                case "change password":
                    System.out.println("Enter userid");
                    String useridChange = sc.nextLine();

                    System.out.println("Enter new password");
                    String newPasswordChange = sc.nextLine();

                    lg.changePassword(useridChange, newPasswordChange);
                    break;

                case "exit":
                    continueOperations = false;
                    break;

                default:
                    System.out.println("Enter the correct option");
            }
        }

        sc.close();
        System.out.println("Exiting program...");
    }
}
