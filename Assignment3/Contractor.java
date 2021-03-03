/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * Contractor program
 * <p>
 * This is a Contractor program. This is a class extends Employee
 */
public class Contractor extends Employee {
    private double basePay;

    /**
     * Contructor intitilzes attriutes
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     * @param id
     * @param educationLevel
     * @param directDeposit
     * @param basePay
     */
    public Contractor(String firstName, String lastName, int age, String ssn, Address address,
                      int id, String educationLevel, boolean directDeposit, double basePay) {
        super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
        this.basePay = basePay;
    }

    /**
     * Method gets the basePay
     *
     * @return basePay
     */
    public double getBasePay() {
        return basePay;
    }

    /**
     * sets basepay and initilaizes
     *
     * @param basePay
     */
    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    /**
     * Method return string of all attributes seperated by a space
     *
     * @return StringAttributes
     */
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + ssn + " " + address + " " + educationLevel + " " + directDeposit
                + " " + basePay;
    }

    /**
     * Method printss string of all attributes seperated by a space
     */
    public void introduce(boolean disPlaySSN) {
        if (disPlaySSN) {
            System.out.println(firstName + " " + lastName + " " + age + " " + ssn + " " + address + " " + educationLevel + " " + directDeposit
                    + " " + basePay);
        } else {
            System.out.println(firstName + " " + lastName + " " + age + " " + address + " " + educationLevel + " " + directDeposit
                    + " " + basePay);
        }

    }

    /**
     * Computes pay multiplying hours by base pay
     *
     * @param numHrs
     * @return
     */
    public double computePay(int numHrs) {
        return numHrs * basePay;
    }

}
