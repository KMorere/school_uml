package schooluml;

/**
 * Class representing a Subject
 * Note: C'est la matière du cours
 */
public class Subject {
    // Atributs
    private int id;
    private String name;
    private Date startDate;
    private Date endDate;

    private static int countId = 0;

    // Constructeurs
    /**
     * @param id
     * @param name
     * @param startDate
     * @param endDate
     */
    public Subject(int id, String name, Date startDate, Date endDate){
        setId();
        setName(name);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    // Accesseurs
    /**
     * @return countId
     */
    public int getCountId() {return countId;}

    /**
     * @param countId
     */
    public void setCountId() {countId = getCountId() + 1;}

    /**
     * @return id
     */
    public int getId() {return this.id;}

    /**
     * @param id
     */
    public void setId() {setCountId(); this.id = getCountId();}

    /**
     * @return name
     */
    public String getName() {return this.name;}

    /**
     * @param name
     */
    public void setName(String name) {this.name = name;}

    /**
     * @return startDate
     */
    public Date getStartDate() {return this.startDate;}

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {this.startDate = startDate;}

    /**
     * @return endDate
     */
    public Date getEndDate() {return this.endDate;}

    /**
     * @param endDate
     */
    public void setEndDate(Date endDate) {this.endDate = endDate;}
}