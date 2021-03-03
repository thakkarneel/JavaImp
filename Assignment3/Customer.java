/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * Customer program
 * <p>
 * This is a Customer program. This is a class extends Person
 */
public class Customer extends Person {

    private int customerID;
    private String payPreference;

    /**
     * Constructor initilaizes
     *
     * @param firstName
     * @param lastName
     * @param age
     * @param ssn
     * @param address
     * @param customerID
     * @param payPreference
     */
    public Customer(String firstName, String lastName, int age, String ssn, Address address, int customerID, String payPreference) {
        super(firstName, lastName, age, ssn, address);
        this.customerID = customerID;
        this.payPreference = payPreference;
    }

    /**
     * Method gets the customerID
     *
     * @return customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * Method gets the payPreference
     *
     * @return payPreference
     */
    public String getPayPreference() {
        return payPreference;
    }

    public void setPayPreference(String payPreference) {
        this.payPreference = payPreference;
    }

    /**
     * Method return string of all attributes seperated by a space
     *
     * @return StringAttributes
     */
    public String toString() {
        return firstName + " " + lastName + " " + address + " " + age + " " + customerID + " " + payPreference;
    }

    /**
     * Method prints out string of all attributes seperated by a space
     */
    public void introduce() {
        System.out.println(firstName + " " + lastName + " " + address + " " + age + " " + customerID + " " + payPreference);
    }

    /**
     * Method prints out payPreference
     */
    public void makePayement() {
        System.out.println(payPreference);
    }
}
