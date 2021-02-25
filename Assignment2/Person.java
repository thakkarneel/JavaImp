/**
 * 
 * @author neelthakkar
 * @version 1.0
 * 
 * Person program
 *<p>
 *This is a Person program with several attributes
 */
public class Person {
	/**
	 * private String attributes
	 */
	private String name;
	
	/**
	 * private int attributes
	 */
	private int age;
	
	/**
	 * private int attributes
	 */
	private String ssn;
	/**
	 * private String attributes
	 */
	private String address;
	/**
	 * private String attributes
	 */
	private String gender;
	/**
	 * private double attributes
	 */
	private double weight;
	
	
	/**
	 * Constructor to initialize these fields
	 * @param name
	 * @param age
	 * @param ssn
	 * @param address
	 * @param gender
	 * @param weight
	 */
	public Person(String name, int age, String ssn, String address, String gender, double weight) {
		this.name = name;
		this.age = age; 
		this.ssn = ssn; 
		this.address = address;
		this.gender = gender;
		this.weight = weight;	
	}
	
	/*
	 * This method sets input to names
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
	 * This method sets input to ages
	 * @param parameter of type int for setAge method
	 */
	public void setAge(int ages) {
		age = ages;
	}
	/**
	 * method returns age
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	
	/*
	 * This method sets input to ssn
	 * @param parameter of type int for setSsn method
	 */
	public void setSsn(String ssns) {
		ssn = ssns;
	}
	/**
	 * method returns ssn
	 * @return ssn
	 */
	public String getSsn() {
		return ssn;
	}
	
	/*
	 * This method sets input to address
	 * @param parameter of type String for setAddress method
	 */
	public void setAddress(String addresses) {
		address = addresses;
	}
	/**
	 * method returns address
	 * @return address
	 */
	public String getAddress() {
		return address;
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
	 * This method sets input to weights
	 * @param parameter of type double for setWeight method
	 */
	public void setWeight(double weights) {
		weight = weights;
	}
	
	/**
	 * method returns weight
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}
	/*
	 * This method prints out all attributes
	 */
	public void introduce() {
		System.out.println(name + " " + age + " " + ssn + " " + address + " " + gender + " " + weight );
	}
}
