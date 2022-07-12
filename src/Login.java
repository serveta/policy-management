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
            email = "servet@example.com";//input.next();
            System.out.print("Password: ");
            password = "123";//input.next();

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
            } else if (menu == 2) {
                addAddress(accoount.getUser());
            } else if (menu == 3) {
                System.out.print(" *Address index: ");
                accoount.getUser().removeAddress(input.nextInt());
            }
        }
    }

    private void addAddress(User user) {
        int addressType;
        String country;
        String city;
        String district;

        while (true) {
            System.out.println(" *Add new Address");
            System.out.println("1- Home Address");
            System.out.println("2- Business Address");
            System.out.print(" *Select: ");
            addressType = input.nextInt();
            input.nextLine();

            if (addressType < 1 || addressType > 2) {
                System.out.println(" *Your selection was out of bounds.");
            } else {
                break;
            }
        }
        System.out.print("Country: ");
        country = input.nextLine();
        System.out.print("City: ");
        city = input.nextLine();
        System.out.print("District: ");
        district = input.nextLine();

        if (addressType == 1) {
            user.addHomeAddress(country, city, district);
        } else {
            user.addBusinessAddress(country, city, district);
        }
    }
}
