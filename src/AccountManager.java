import java.util.ArrayList;
import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Accoount> accounts;

    private void prepareAccounts() {
        HomeAdress homeAdress1 = new HomeAdress("Türkiye", "İstanbul", "Beşiktaş");
        BusinessAdress businessAdress1 = new BusinessAdress("Türkiye", "İstanbul", "Maslak");
        User user1 = new User("Servet", "Arslan", "servet@example.com", "123", "developer", 22, homeAdress1, businessAdress1);
        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(new HealthInsurance("Health Insurance"));
        insurances.add(new ResidenceInsurance("Residence Insurance"));

        accounts = new TreeSet<>();
        accounts.add(new Individual(user1, insurances));
    }

    public Accoount login(String email, String password) throws InvalidAuthenticationException {
        prepareAccounts();
        for (Accoount accoount : accounts) {
            if (accoount.getUser().getEmail().equals(email) && accoount.getUser().getPassword().equals(password)) {
                accoount.setAuthenticationStatus(1);
                return accoount;
            }
        }
        throw new InvalidAuthenticationException("Invalid Authentication Exception!");
    }
}