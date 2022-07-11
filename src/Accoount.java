import java.util.ArrayList;

public abstract class Accoount implements Comparable<Accoount> {
    private User user;
    private ArrayList<Insurance> insurances;
    private int authenticationStatus;
    private int accountType;

    public Accoount(User user, ArrayList<Insurance> insurances, int authenticationStatus, int accountType) {
        this.user = user;
        this.insurances = insurances;
        this.authenticationStatus = authenticationStatus;
        this.accountType = accountType;
    }

    public User getUser() {
        return user;
    }

    public int getAuthenticationStatus() {
        return authenticationStatus;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAuthenticationStatus(int authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public void showUserInfo() {
        System.out.println(" * USER INFO");
        System.out.println("First name: " + getUser().getFirstName());
        System.out.println("Last name: " + getUser().getLastName());
        System.out.println("Email: " + getUser().getEmail());
        System.out.println("Occupation: " + getUser().getOccupation());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
