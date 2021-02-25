/**
 * 
 * @author neelthakkar
 * @version 1.0
 * 
 * Animal Test program
 *<p>
 *This is a Animal Test program to test out subclasses
 */
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog("Canidae", "Larry", "Male", "Home", 22.4);
		System.out.println(d.toString()); //Displays attributes
		d.walk();
		d.greetHuman();
		
		
		
		System.out.println();
		
		Whale w = new Whale("Marin Mammal", "Bob", "Male", "Ocean", 18);
		System.out.println(w.toString());//Displays attributes
		w.swim();
		
		
		System.out.println();
		
		Cat c = new Cat("Feline", "Cathy", "Female", "Home", 10);
		System.out.println(c.toString()); //Displays attributes
		c.walk();c.greetHuman();
		c.scratch();		
		
		System.out.println();
		
		Racoon r = new Racoon("Nocturnal Mammal", "Rob", "Male", "Forest", 9.91);
		System.out.println(r.toString());//Displays attributes
		r.scratch();
		
		
		
		System.out.println();
		
	}

}
