/**
 * 
 * @author neelthakkar
 * @version 1.0
 * 
 * Whale program
 *<p>
 *This is a Whale program. This is the sub class of Animal with specific methods
 */
public class Whale extends Animal implements Swimmer{

	public Whale(String type, String name, String gender, String home, double speed) {
		super(type, name, gender, home, speed);
		// TODO Auto-generated constructor stub
	}

	/**
	 * method prints out swimming
	 */
	public void swim() {
		System.out.println("Swimming");
		
	}


	
	
}