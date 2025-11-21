package schooluml;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Class representing a Planning
 */
public class Planning {
    // Atributs
    private int id;
    private TreeMap<Date, ArrayList<Subject>> planning = new TreeMap<>();

    private static int countId = 0;

    // Constructeurs
    public Planning() {}

    /**
     * @param date
     * @param subject
     */
    public Planning(Date date, Subject subject) {
        this.setId();
        setPlanning(date, subject);
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
    public void setId() {setCountId();}

    /**
     * @return planning
     */
    public TreeMap<Date, ArrayList<Subject>> getPlanning() {
    	return this.planning;
    }

    /**
     * @param date
     * @param subject
     */
    public void setPlanning(Date date, Subject subject) {
        // Si la date n'est pas encore dans la liste, on l'a créé :
        planning.putIfAbsent(date, new ArrayList<>());

        // Ajout de la date et du subject:
        planning.get(date).add(subject);
    }
}