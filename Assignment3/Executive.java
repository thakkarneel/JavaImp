/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * Executive program
 * <p>
 * This is a Executive program. This is a class extends Employee
 */
public class Executive extends Employee {
    private double yearlyBonus;
    private double yearlyCompensation;

    /**
     * Contructor inititalizes attributes
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     * @param id
     * @param educationLevel
     * @param directDeposit
     * @param yearlyBonus
     * @param yearlyCompensation
     */
    public Executive(String firstName, String lastName, int age, String ssn, Address address,
                     int id, String educationLevel, boolean directDeposit, double yearlyBonus, double yearlyCompensation) {
        super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);

        this.yearlyBonus = yearlyBonus;
        this.yearlyCompensation = yearlyCompensation;
    }

    /**
     * Method gets the yearlyBonus
     *
     * @return yearlyBonus
     */
    public double getYearlyBonus() {
        return yearlyBonus;
    }

    /**
     * Method gets the yearlyBonus
     *
     * @return yearlyCompensation
     */
    public double getYearlyCompensation() {
        return yearlyBonus;
    }

    /**
     * Method sets the yearlyBonus
     *
     * @param yearlyBonus
     */
    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    /**
     * Method sets the yearlyCompensation
     *
     * @param yearlyCompensation
     */
    public void setYearlyCompensation(double yearlyCompensation) {
        this.yearlyCompensation = yearlyCompensation;
    }

    /**
     * Method return string of all attributes seperated by a space
     *
     * @return StringAttributes
     */
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + ssn + " " + address.toString() + " " + id + " " + educationLevel + " " + directDeposit
                + " " + yearlyBonus + " " + yearlyCompensation;
    }

    /**
     * takes yearly compensation and adds bonus
     *
     * @return yearlyCompensation + yearlyBonus
     */
    public double computePay() {
        return yearlyCompensation + yearlyBonus;
    }

    /**
     * Method prints out string of all attributes seperated by a space
     */
    public void introduce(boolean disPlaySSN) {
        if (disPlaySSN) {
            System.out.println(toString());
        } else {
            System.out.println(firstName + " " + lastName + " " + age + " " + address.toString() + " " + id + " " + educationLevel + " " + directDeposit
                    + " " + yearlyBonus + " " + yearlyCompensation);
        }

    }
}
