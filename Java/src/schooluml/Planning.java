package schooluml;

import java.util.TreeMap;

/**
 * Class representing a Planning
 */
public class Planning {
    // Atributs
    private int id;
    private TreeMap<Date, Subject> planning;

    private static int countId = 0;
    
    public Planning() {
    	
    }
    // Constructeurs
    public Planning(Date date, Subject subject) {
        /**
         * @param date
         * @param subject
         */
        this.setId();
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
        this.planning.put(date, subject);
    }
}