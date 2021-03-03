/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * FullTimeSalaried program
 * <p>
 * This is a FullTimeSalaried program. This is a class extends FullTimeEmployee
 */
public class FullTimeSalaried extends FullTimeEmployee {
    private int yearlyComp;

    /**
     * Constructor initilaizes
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     * @param id
     * @param educationLevel
     * @param directDeposit
     * @param yearlyComp
     */
    public FullTimeSalaried(String firstName, String lastName, int age, String ssn, Address address, int id, String educationLevel, boolean directDeposit, int yearlyComp) {
        super(firstName, lastName, age, ssn, address, id, educationLevel, directDeposit);
        this.yearlyComp = yearlyComp;
    }

    /**
     * Method return string of all attributes seperated by a space
     *
     * @return StringAttributes
     */
    public String toString() {
        return super.toString() + " " + yearlyComp;
    }

    /**
     * Method prints string of all attributes seperated by a space
     */
    public void introduce(boolean disPlaySSN) {
        if (disPlaySSN) {
            System.out.println(firstName + " " + lastName + " " + age + " " + ssn + " " + address + " " + educationLevel + " " + directDeposit + " " + yearlyComp
            );
        } else {
            System.out.println(firstName + " " + lastName + " " + age + " " + address + " " + educationLevel + " " + directDeposit + " " + yearlyComp);
        }
    }

    /**
     * @param numWeeks
     * @return
     */
    public double computePay(int numWeeks) {
        return yearlyComp * 0.01923 * numWeeks;

    }
}
