/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * PartTimeHourly program
 * <p>
 * This is a PartTimeHourly program. This is a class extends Employee
 */
public class PartTimeHourly extends Employee {
    private double baseHourlyPay;

    /**
     * Constructor attributes initializes
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     * @param id
     * @param educationLevel
     * @param directDeposit
     * @param baseHourlyPay
     */
    public PartTimeHourly(String firstName, String lastName, int age, String ssn, Address address,
                          int id, String educationLevel, boolean directDeposit, double baseHourlyPay) {
        super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
        this.baseHourlyPay = baseHourlyPay;

    }

    /**
     * Method gets the baseHourlyPay
     *
     * @return baseHourlyPay
     */
    public double getBaseHourlyPay() {
        return baseHourlyPay;
    }

    /**
     * Sets basehourlyPay  for initilaization
     *
     * @param baseHourlyPay
     */
    public void setBaseHourlyPay(double baseHourlyPay) {
        this.baseHourlyPay = baseHourlyPay;
    }

    /**
     * Method return string of all attributes seperated by a space
     *
     * @return StringAttributes
     */
    public String toString() {
        return (firstName + " " + lastName + " " + age + " " + ssn + " " + address + " " + educationLevel + " " + directDeposit
                + " " + baseHourlyPay);
    }

    /**
     * Method prints string of all attributes seperated by a space
     */
    public void introduce(boolean disPlaySSN) {
        if (disPlaySSN) {
            System.out.println(firstName + " " + lastName + " " + age + " " + ssn + " " + address + " " + educationLevel + " " + directDeposit
                    + " " + baseHourlyPay);
        } else {
            System.out.println(firstName + " " + lastName + " " + age + " " + address + " " + educationLevel + " " + directDeposit
                    + " " + baseHourlyPay);
        }
    }

    /**
     * computes pay. if hours about 40 return -1 . Else calculate.
     *
     * @param numHrs
     * @return
     */
    public double computePay(int numHrs) {
        if (numHrs > 40) {
            return -1;
        }
        return numHrs * baseHourlyPay;
    }


}
