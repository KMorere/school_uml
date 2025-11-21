package schooluml;

/**
 * La classe Address représente une adresse composée d'une ville (City), d'une rue, d'un numéro de rue et d'informations supplémentaire optionnelles.
 */
public class Address {    
	
	// Attribut représentant la ville liée à cette adresse.
    private City city;
    
    // Attribut représentant le nom de la rue.
    private String street;
    
    // Attribut représentant le numéro de la rue.
    private String streetNumber;
    
    // Informations supplémentaires sur l'adresse (ex: bâtiment, étage, etc.)
    private String additionalInfo;

    /**
     * Constructeur par défaut.
     * Initialise un objet Address sans définir les attributs.
     */
    public Address() {}
    
    /**
     * Constructeur complet.
     * @param city La ville associée
     * @param street Le nom de la rue
     * @param streetNumber le numéro de la rue
     * @param additionalInfo Informations complémentaire (peut être null)
     */
    public Address(City city, String street, String streetNumber, String additionalInfo) {        
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.additionalInfo = additionalInfo;
    }
    
    /**
     * Constructeur sans addtionalInfo.
     * Permet de créer une adresse basique.
     */
    public Address(City city, String street, String streetNumber, String additionalInfo) {
    	 this.city = city;
         this.street = street;
         this.streetNumber = streetNumber;
    }

    // Getters et Setters
    public City getCity() { return city; }
    public void setCity(City city) { this.city = city; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getStreetNumber() { return streetNumber; }
    public void setStreetNumber(String streetNumber) { this.streetNumber = streetNumber; }

    public String getAdditionalInfo() { return additionalInfo; }
    public void setAdditionalInfo(String additionalInfo) { this.additionalInfo = additionalInfo; }
    
    // Représentation textuelle de l'adresse.
    @Override
    public String toString() {
        return "Address{street='" + street + "', streetNumber='" + streetNumber +
               "', additionalInfo='" + additionalInfo + "', city=" + city + "}";
    }
}