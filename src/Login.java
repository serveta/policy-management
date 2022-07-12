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

        if (accoount != null) {
            run(accoount);
        }
    }

    public void run(Accoount accoount) {
        System.out.println("Welcome, " + accoount.getUser().getFirstName());
        System.out.println("Account Type: " + AccountType.getAccountTypeName(accoount.getAccountType()));
        System.out.println("Last login: " + accoount.getUser().getLastLoginDate());

        while (true) {
            System.out.println("1- User Info");
            System.out.println("2- Add new address");
            System.out.println("3- Remove an address");
            System.out.println("4- Add new insurance");
            System.out.println("5- Remove an insurance");
            System.out.println("0- Exit");
            System.out.print(" *Select: ");
            int menu = input.nextInt();

            if (menu == 0) {
                break;
            } else if (menu == 1) {
                accoount.showUserInfo();
            }
        }
    }
}
