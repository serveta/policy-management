import java.util.ArrayList;
import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String occupation;
    private int age;
    private ArrayList<Adress> adressList;
    private Date lastLoginDate;

    public User(String firstName, String lastName, String email, String password, String occupation, int age, HomeAdress homeAdress, BusinessAdress businessAdress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.occupation = occupation;
        this.age = age;
        this.adressList = new ArrayList<>();
        this.adressList.add(homeAdress);
        this.adressList.add(businessAdress);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Adress> getAdressList() {
        return adressList;
    }

    public void setAdressList(ArrayList<Adress> adressList) {
        this.adressList = adressList;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
}
