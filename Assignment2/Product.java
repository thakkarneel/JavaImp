/**
 * 
 * @author neelthakkar
 * @version 1.0
 * 
 * Employee program
 *<p>
 *This is a Immutable class Product
 */
 
// An immutable class
public final class Product {
	/**
	 * private String attributes
	 */
    private final String pName;
    /**
	 * private String attributes
	 */
    private final String description;
    /**
	 * private double attributes
	 */
    private final double pPrice;
    /**
	 * private int attributes
	 */
    private final int maxCap;

    /**
     * Constructor to initialize these fields
     * @param pName
     * @param description
     * @param pPrice
     * @param maxCap
     */
    public Product(String pName, String description,double pPrice, int maxCap) {
        this.pName = pName;
        this.description = description;
        
        this.pPrice = pPrice;
        this.maxCap = maxCap;
    }
    
    /**
	 * method returns pName
	 * @return pName
	 */
    public String getName() {
    	return pName;
    }
    
    /**
	 * method returns description
	 * @return description
	 */
    public String getDescritpion() {
    	return description;
    }
    
    /**
   	 * method returns pPrice
   	 * @return pPrice
   	 */
    public double getProductPrice() {
    	return pPrice;
    }
    
    /**
   	 * method returns maxCap
   	 * @return maxCap
   	 */
    public int getMaxCap() {
    	return maxCap;
    }
    /**
     * returns String of all attributes
     * @return String
     */
    public String toString() {
        return pName + " " + description + " " + pPrice + " " + maxCap;
    }
    
 
    
}
