import java.util.Scanner;

public class Login {
    private Scanner input = new Scanner(System.in);
    public void login() {
        String email;
        String password;

        System.out.print("Email: ");
        email = input.next();
        System.out.print("Password: ");
        password = input.next();

        AccountManager accountManager = new AccountManager();
        Accoount accoount = accountManager.login(email, password);

        if (accoount != null && accoount.getAuthenticationStatus() == AuthenticationStatus.SUCCESS.status) {
            run(accoount);
        } else {
            System.out.println("The email and password did not match!");
        }
    }

    public void run(Accoount accoount) {
        System.out.println("Welcome, " + accoount.getUser().getFirstName());
        System.out.println("Account Type: " + AccountType.getAccountTypeName(accoount.getAccountType()));
        while (true) {
            System.out.println("0- Exit");
            if (input.nextInt() == 0) {
                break;
            }
        }
    }
}
