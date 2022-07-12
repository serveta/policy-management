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

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void showUserInfo() {
        System.out.println(" * USER INFO");
        System.out.println("First name: " + "\t\t" + getUser().getFirstName() + "\n" +
        "Last name: " + "\t\t\t" + getUser().getLastName() + "\n" +
        "Email: " + "\t\t\t\t" + getUser().getEmail() + "\n" +
        "Occupation: " + "\t\t" + getUser().getOccupation() + "\n" +
        "Age: " + "\t\t\t\t" + getUser().getAge() + "\n" +
        "Home Address: " + "\t\t" + getUser().getAddressList().get(0).getAddress() + "\n" +
        "Business Address: " + "\t" + getUser().getAddressList().get(1).getAddress() + "\n" +
        "Insurances: ");
        for (Insurance insurance : getInsurances()) {
            System.out.println(" \t\t*" + insurance.getName());
        }
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
