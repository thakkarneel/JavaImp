/**
 * 
 * @author neelthakkar
 * @version 1.0
 * 
 * Cat program
 *<p>
 *This is a Cat program. This is the sub class of Animal with specific methods
 */
public class Cat extends Animal implements Domesticated,Scratcher{

	public Cat(String type, String name, String gender, String home, double speed) {
		super(type, name, gender, home, speed);
		// TODO Auto-generated constructor stub
	}

	/**
	 * walk method prints out walking
	 */
	public void walk() {
		System.out.println("Walking");
		
	}
	/**
	 * greetHuman method prints out Shakes Hand
	 */
	public void greetHuman() {
		// TODO Auto-generated method stub
		System.out.println("Shakes paw");
	}


	/**
	 * scratch method prints out Scratching
	 */
	public void scratch() {
		System.out.println("Scratching");
		
	}


	
}