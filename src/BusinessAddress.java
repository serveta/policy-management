public class BusinessAddress implements Address {
    private String country;
    private String city;
    private String district;

    public BusinessAddress(String country, String city, String district) {
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
    public String getAddress() {
        return getCountry() + "-" + getCity() + "-" + getDistrict();
    }

    @Override
    public void setAddress() {

    }
}
