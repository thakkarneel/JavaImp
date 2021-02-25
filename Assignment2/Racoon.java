/**
 * 
 * @author neelthakkar
 * @version 1.0
 * 
 * Racoon program
 *<p>
 *This is a Racoon program. This is the sub class of Animal with specific methods
 */
public class Racoon extends Animal implements Scratcher {
	public Racoon(String type, String name, String gender, String home, double speed) {
		super(type, name, gender, home, speed);
		// TODO Auto-generated constructor stub
	}
	/**
	 * method prints out Sctratching
	 */
	public void scratch() {
		System.out.println("Scratching");
		
	}
		
}
