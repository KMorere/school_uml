
public class City {
    private int id;
    private String name;
    private String country;
    private String postalCode;

    // Constructeurs
    public City() {}

    public City(int id, String name, String country, String postalCode) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.postalCode = postalCode;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    @Override
    public String toString() {
        return "City{id=" + id + ", name='" + name + "', country='" + country + "', postalCode='" + postalCode + "'}";
    }
}