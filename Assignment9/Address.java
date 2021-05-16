/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * FullTimeEmployee program
 * <p>
 * This is a Address program. This is a class
 */
public class Address {
    private int streetNum;
    private String streetName;
    private String city;
    private String zip;
    private String state;

    /**
     * Constructor initializing attributes
     *
     * @param streetNum
     * @param streetName
     * @param city
     * @param zip
     * @param state
     */
    public Address(int streetNum, String streetName, String city, String zip, String state) {

        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.zip = zip;
        this.state = state;


    }

    /**
     * Method gets the street number
     *
     * @return streenum
     */
    public int getStreetNum() {
        return streetNum;
    }

    /**
     * Method gets street Name
     *
     * @return streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Method gets city Name
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * Method gets zip
     *
     * @return zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * Method gets state
     *
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * method sets the state parameter
     *
     * @param state is enetered in and initialized
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Returns String off al attributes
     *
     * @return all attributes seperated by space
     */
    public String toString() {
        return streetNum + " " + streetName + " " + city + " " + zip + " " + state;
    }
}
