import java.util.Scanner;

public class Login {
    private Scanner input = new Scanner(System.in);
    public void login() {
        String email;
        String password;
        AccountManager accountManager = new AccountManager();
        Accoount accoount = null;
        boolean isAuthenticated = false;

        while (!isAuthenticated) {
            System.out.print("Email: ");
            email = input.next();
            System.out.print("Password: ");
            password = input.next();

            try {
                accoount = accountManager.login(email, password);
                isAuthenticated = true;
            } catch (Exception e) {
                System.out.println(e.getMessage().toString());
                System.out.println("The email and password did not match!");
            }
        }

        if (accoount != null) { //&& accoount.getAuthenticationStatus() == AuthenticationStatus.SUCCESS.status) {
            run(accoount);
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
