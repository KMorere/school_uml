package schooluml;
// Déclare le package dans lequel se trouve la classe City.

/**
 * Représente une ville avec un nom, un pays et un code postal.
 */
public class City {    
	
	// Attribut représentant le nom de la ville.
    private String name;
    
    // Attribut représentant le pays dans lequel se situe la ville.
    private String country;
    
    // Attribut représentant le code postal de la viile.
    private String postalCode;

    /**
     * Constructeur par défaut.
     * Initialise un objet City sans définir ses attributs.
     */
    public City() {}
    
    /**
     * Constructeur avec paramètres.
     * @param name Le nom de la ville
     * @param country Le pays de la ville
     * @param postalCode Le code postal de la ville
     */
    public City(String name, String country, String postalCode) {        
        this.name = name;
        this.country = country;
        this.postalCode = postalCode;
    }

    /**
     * Retourne le nom de la ville.
     */
    public String getName() { return name; }
    
    /**
     * Modifie le nom de la ville.
     */
    public void setName(String name) { this.name = name; }
    
    /**
     * Retourne le pays de la ville.
     */
    public String getCountry() { return country; }
    
    /**
     * Modifie le pays de la ville.
     */
    public void setCountry(String country) { this.country = country; }
    
    /**
     * Retourne le code postal de la ville.
     */
    public String getPostalCode() { return postalCode; }
    
    /**
     * Modifie le code postal de la ville.
     */
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }
    
    /**
     * Retourne une représentation textuelle de l'objet City.
     */
    @Override
    public String toString() {
        return "\n City : " + name + "\n Country : " + country + "\n Postal code : " + postalCode;
    }
} 

