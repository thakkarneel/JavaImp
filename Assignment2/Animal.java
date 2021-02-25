/**
 * 
 * @author neelthakkar
 * @version 1.0
 * 
 * Animal program
 *<p>
 *This is a Animal program. This is the super class which will oversee all subclasses.
 */
public class Animal {
	/**
	 * private String attributes
	 */
	private String type;
	private String name;
	private String gender;
	private String home;
	/**
	 * private double attribute
	 */
	private double speed;
	/**
	 * Constructor to initialize these fields
	 * @param type
	 * @param name
	 * @param gender
	 * @param home
	 * @param speed
	 */
	public Animal(String type, String name, String gender, String home, double speed) {
		this.type = type;
		this.name = name;
		this.gender = gender ; 
		this.home = home;
		this.speed = speed;
	}
	/*
	 * This method sets input to type
	 * @param parameter of type String for setType method
	 */
	public void setType(String types) {
		type = types;
	}
	/**
	 * method returns type
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/*
	 * This method sets input to name
	 * @param parameter of type String for setName method
	 */
	public void setName(String names) {
		name = names;
	}
	/**
	 * method returns name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/*
	 * This method sets input to gender
	 * @param parameter of type String for setGender method
	 */
	public void setGender(String genders) {
		gender = genders;
	}
	/**
	 * method returns gender
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}
	
	/*
	 * This method sets input to home
	 * @param parameter of type String for setHome method
	 */
	public void setHome(String homes) {
		home = homes;
	}
	/**
	 * method returns home
	 * @return home
	 */
	public String getHome() {
		return home;
	}
	/*
	 * This method sets input to speed
	 * @param parameter of type String for setSpeed method
	 */
	public void setSpeed(double speeds) {
		speed = speeds;
	}
	/**
	 * method returns speed
	 * @return speed
	 */
	public double getSpeed() {
		return speed;
	}
	
	//This method prints out move
	public void move() {
		System.out.println("move");
	}
	//This method prints out sound
	public void sound() {
		System.out.println("sound");
	}
	//This method prints out eats
	public void eat() {
		System.out.println("eats");
	}
	//This method prints out sleeps
	public void sleep() {
		System.out.println("sleeps");
	}

	/**
	 * method returns a String of all attributes
	 * @return String of all attributes 
	 */
    public String toString() {
        return type + " " + name + " " + gender + " " + home+ " " + speed;
    }
	
    
    
}
