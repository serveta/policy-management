public class BusinessAdress implements Adress {
    private String country;
    private String city;
    private String district;

    public BusinessAdress(String country, String city, String district) {
        this.country = country;
        this.city = city;
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String getAdress() {
        return null;
    }

    @Override
    public void setAdress() {

    }
}
