public class SimpleAddress {
    String country;
    String city;

    @Override
    public String toString() {
        return country + ", " + city;
    }
}
