
public class Address {
    private int id;
    private City city;
    private String street;
    private String streetNumber;
    private String additionalInfo;

    // Constructeurs
    public Address() {}

    public Address(int id, City city, String street, String streetNumber, String additionalInfo) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.additionalInfo = additionalInfo;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public City getCity() { return city; }
    public void setCity(City city) { this.city = city; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getStreetNumber() { return streetNumber; }
    public void setStreetNumber(String streetNumber) { this.streetNumber = streetNumber; }

    public String getAdditionalInfo() { return additionalInfo; }
    public void setAdditionalInfo(String additionalInfo) { this.additionalInfo = additionalInfo; }

    @Override
    public String toString() {
        return "Address{id=" + id + ", street='" + street + "', streetNumber='" + streetNumber +
               "', additionalInfo='" + additionalInfo + "', city=" + city + "}";
    }
}