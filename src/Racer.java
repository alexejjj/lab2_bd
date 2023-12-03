import java.io.Serializable;

public class Racer implements Serializable{
    private String name;
    private int place;
    private double maxSpeed;
    private String dateOfBirth;

    /**
     * Constructor method to create new racer instance
     *
     * @param name
     *   name of the racer
     * @param dateOfBirth
     *   the date the racer birth began in YYYY-MM-DD format
     * @param position
     *   the position of racer
     * @param maxSpeed
     *   the max speed of racer in km/h
     */
    public Racer(String name, String dateOfBirth, int position, double maxSpeed) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.place = position;
        this.maxSpeed = maxSpeed;
    }

    /**
     * Accessor method for the name of the racer
     *
     * @return
     *   returns the name of the racer
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor method for the total position of racer
     *
     * @return
     *   returns the total position of racer
     */
    public int getPosition() {
        return place;
    }

    /**
     * Accessor method for the maxspeed of the racer
     *
     * @return
     *   returns the maxspeed of the racer
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Accessor method for the date of the race
     *
     * @return
     *   returns the date the race began
     */
    public String getDate() {
        return dateOfBirth;
    }

    /**
     * Mutator method to change the name of the racer
     *
     * @param name
     *   the new name of the racer
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mutator method to change the position of the racer
     *
     * @param position
     *   the newtotal position of the racer
     */
    public void setPosition(int position) {
        this.place = position;
    }

    /**
     * Mutator method to change the speed of the racer
     *
     * @param maxSpeed
     *   the new maxspeed during the race of the racer
     */
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Mutator method to change the date of the race
     *
     * @param date
     *   the new date of the race
     */
    public void setDate(String date) {
        this.dateOfBirth = date;
    }

    /**
     * Represents the racer as a String
     *
     * @return
     *   returns the String representation of a racer
     */
    public String toString() {
        return "Racer " + getName()
                + ": Date of birth " + getDate()
                + ", " + getMaxSpeed() + " km/h "
                + getPosition() + " position";
    }

    /**
     * Prints the race for a table format
     */
    public void print() {
        System.out.printf("%S%20f%15d%15s\n", name, maxSpeed, place, dateOfBirth);
    }


}
