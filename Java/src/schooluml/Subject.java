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
    public Subject(int id, String name, Date startDate, Date endDate){
        /**
         * @param id
         * @param name
         * @param startDate
         * @param endDate
         */
        setId();
        setName(name);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    // Accesseurs
    public int getCountId() {
        /**
         * @return id
         */
        return countId;
    }

    public void setCountId(int ) {
        /**
         * @param id
         */
        countId = getCountId() + 1;
    }

    public int getId() {
        /**
         * @return id
         */
        return this.id;
    }

    public void setId() {
        /**
         * @param id
         */
        setCountId();
        this.id = getCountId();
    }

    public String getName() {
        /**
         * @return name
         */
        return this.name;
    }

    public void setName(String name) {
        /**
         * @param name
         */
        this.name = name;
    }

    public Date getStartDate() {
        /**
         * @return startDate
         */
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        /**
         * @param startDate
         */
        this.startDate = startDate;
    }

    public Date getEndDate() {
        /**
         * @return endDate
         */
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        /**
         * @param endDate
         */
        this.endDate = endDate;
    }
}