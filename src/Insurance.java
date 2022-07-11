import java.util.Date;

public abstract class Insurance {
    String name;
    int price;
    Date startingDate;
    Date expirationDate;

    public Insurance(String name) {
        this.name = name;
    }

    public abstract void calculate();
}
