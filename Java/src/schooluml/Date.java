package schooluml;

/**
 * Class representing a Date
 */
public class Date {
    // Atributs
    private int id;
    private int numberDay;
    private int month;
    private int year;

    private static int countId = 0;

    // Constructeurs
    /**
     * @param id
     * @param numberDay
     * @param month
     * @param year
     */
    public Date(int numberDay, int month, int year){
        setId();
        setNumberDay(numberDay);
        setMonth(month);
        setYear(year);
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
     * @return numberDay
     */
    public int getNumberDay() {return this.numberDay;}

    /**
     * @param numberDay
     */
    public void setNumberDay(int numberDay) {this.numberDay = numberDay;}

    /**
     * @return month
     */
    public int getMonth() {return this.month;}

    /**
     * @param month
     */
    public void setMonth(int month) {this.month = month;}

    /**
     * @return year
     */
    public int getYear() {return this.year;}

    /**
     * @param year
     */
    public void setYear(int year) {this.year = year;}
}