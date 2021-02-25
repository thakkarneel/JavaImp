/**
 * 
 * @author neelthakkar
 * @version 1.0
 * 
 * Dog program
 *<p>
 *This is a Dog program. This is the sub class of Animal with specific methods
 */
public class Dog extends Animal implements Domesticated{

	public Dog(String type, String name, String gender, String home, double speed) {
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
		System.out.println("Shakes hand");
	}
	/**
	 * bark method prints out WOOK
	 */
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("WOOF");
	}
	

	
	
}
