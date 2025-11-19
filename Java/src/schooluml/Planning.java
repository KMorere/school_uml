package schooluml;

/**
 * Class representing a Planning
 */
public class Planning {
    // Atributs
    private int id;
    private TreeMap<Date, Subject> planning;

    private static int countId = 0;

    // Constructeurs
    public Planning(int id, Date date, Subject subject) {
        /**
         * @param id
         * @param date
         * @param subject
         */
        setId(id);
        setPlanning(date, subject);
    }

    // Accesseurs
    public int getCountId() {
        /**
         * @return countId
         */
        return countId;
    }

    public void setCountId() {
        /**
         * @param countId
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
        this.id = setCountId();
    }

    public TreeMap<Date, Subject> getPlanning() {
        /**
         * @return planning
         */
        return this.planning;
    }

    public void setPlanning(Date date, Subject subject) {
        /**
         * @param date
         * @param subject
         */
        this.planning = new TreeMap<>();
        this.planning.put(date, subject)
    }
}