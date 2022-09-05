public class factory {
    private String country;
    private String city;

    public String getCity() {
        return city;
    }

    public factory(String country,String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }
    public String getInfo(){
        return " country: " + country +
                "\n city: " + city;
    }
}
