/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * FullTimeHourly program
 * <p>
 * This is a FullTimeHourly program. This is a class extends FullTimeEmployee
 */
public class FullTimeHourly extends FullTimeEmployee {
    private double overtimePay;

    /**
     * Constructor initilaizes attributes
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     * @param id
     * @param educationLevel
     * @param directDeposit
     * @param overtimePay
     */
    public FullTimeHourly(String firstName, String lastName, int age, String ssn, Address address, int id, String educationLevel, boolean directDeposit, double overtimePay) {
        super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
        this.overtimePay = overtimePay;
    }

    /**
     * Method gets the overtimePay
     *
     * @return overtimePay
     */
    public double getOvertimePay() {
        return overtimePay;
    }

    /**
     * Method sents the overtimePay to initilaize
     *
     * @param overtimePay sets overtime pay
     */
    public void setOvertimePay(double overtimePay) {
        this.overtimePay = overtimePay;
    }

    /**
     * Method return string of all attributes seperated by a space
     *
     * @return StringAttributes
     */
    public String toString() {
        return (firstName + " " + lastName + " " + age + " " + ssn + " " + address + " " + educationLevel + " " + directDeposit
                + " " + overtimePay);
    }

    /**
     * Method prints string of all attributes seperated by a space
     */
    public void introduce(boolean disPlaySSN) {
        if (disPlaySSN) {
            System.out.println(firstName + " " + lastName + " " + age + " " + ssn + " " + address + " " + educationLevel + " " + directDeposit
                    + " " + overtimePay);
        } else {
            System.out.println(firstName + " " + lastName + " " + age + " " + address + " " + educationLevel + " " + directDeposit
                    + " " + overtimePay);
        }
    }

    /**
     * @param numHrs takes in number of hours
     * @returns hours times overtime pay
     */
    public double computePay(int numHrs) {

        return numHrs * overtimePay;

    }
}
