/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * FullTimeEmployee program
 * <p>
 * This is a FullTimeEmployee program. This is an abstract class extending Employee
 */
abstract class FullTimeEmployee extends Employee {
    double basePay;

    /**
     * Constructor to initialize attributes
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     * @param id
     * @param educationLevel
     * @param directDeposit
     */
    public FullTimeEmployee(String firstName, String lastName, int age, String ssn, Address address,
                            int id, String educationLevel, boolean directDeposit) {
        super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
        this.basePay = basePay;
    }

    /**
     * method to get basePay
     *
     * @return basePay
     */
    public double getBasePay() {
        return basePay;
    }

    /**
     * method to set basepay.
     *
     * @param basePay double is entered and initialized
     */
    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    /**
     * Method to return all attributes
     *
     * @return String of all attributes
     */
    public String toString() {
        return (firstName + " " + lastName + " " + age + " " + ssn + " " + address + " " + educationLevel + " " + directDeposit
                + " " + basePay);
    }

}
