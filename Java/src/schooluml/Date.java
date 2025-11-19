package schooluml;

/**
 * Class representing a Date
 */
public class Date {
    // Atributs
    private int id;
    private int numberDay;
    private String month;
    private int year;

    private static int countId = 0;

    // Constructeurs
    public Date(int id, int numberDay, String month, int year){
        /**
         * @param id
         * @param numberDay
         * @param month
         * @param year
         */
        setId();
        setNumberDay(numberDay);
        setMonth(month);
        setYear(year);
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
        this.id = getCountId();
    }

    public int getNumberDay() {
        /**
         * @return numberDay
         */
        return this.numberDay;
    }

    public void setNumberDay(int numberDay) {
        /**
         * @param numberDay
         */
        this.numberDay = numberDay;
    }

    public String getMonth() {
        /**
         * @return month
         */
        return this.month;
    }

    public void setMonth(String month) {
        /**
         * @param month
         */
        this.month = month;
    }

    public int getYear() {
        /**
         * @return year
         */
        return this.year;
    }

    public void setYear(int year) {
        /**
         * @param year
         */
        this.year = year;
    }
}