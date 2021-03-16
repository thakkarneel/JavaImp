/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * Employee program
 * <p>
 * This is a Employee program.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private int employeeID;
    private double hourlyPay;

    /**
     * Initialize attributes
     *
     * @param firstName
     * @param lastName
     * @param employeeID
     * @param hourlyPay
     */
    public Employee(String firstName, String lastName, int employeeID, double hourlyPay) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyPay = hourlyPay;

    }

    /**
     * Create own custom TooManyHoursWorkedException Exception
     */
    class TooManyHoursWorkedException extends Exception {
        public TooManyHoursWorkedException(String message) {
            super(message);
        }
    }

    /**
     * Method to get lastName
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method to get firstName
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method to get employeeID
     *
     * @return employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * Method to get hourlyPay
     *
     * @return hourlyPay
     */
    public double getHourlyPay() {
        return hourlyPay;
    }

    /**
     * method to set firstName.
     *
     * @param firstName double is entered and initialized
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * method to set employeeID.
     *
     * @param employeeID double is entered and initialized
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * method to set lastName.
     *
     * @param lastName double is entered and initialized
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * method to set hourlyPay.
     *
     * @param hourlyPay double is entered and initialized
     */
    public void setHourlyPay(int hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    /**
     * Calulates pay amount. Check to make sure hour is within contraints
     *
     * @param hoursWorked
     * @return hoursWorked * hourlyPay
     * @throws TooManyHoursWorkedException
     */
    public double computePay(int hoursWorked) throws TooManyHoursWorkedException {
        if (hoursWorked < 0) {
            throw new NumberFormatException("Please Enter hours 0 and greater");
        } else if (hoursWorked > 40) {
            throw new TooManyHoursWorkedException("Please Enter hours less then or equal to 40");
        }
        return hoursWorked * hourlyPay;

    }


}
