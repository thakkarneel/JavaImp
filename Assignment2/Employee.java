/**
 * 
 * @author neelthakkar
 * @version 1.0
 * 
 * Employee program
 *<p>
 *This is a Employee program. This program extends Person
 */
public class Employee extends Person  {
	
	/**
	 * private int attributes
	 */
	private int employeeID;
	/**
	 * private String attributes
	 */
	private String employStatus;
	/**
	 * private int attributes
	 */
	private int payAmount;
	
	/**
	 * Constructor to initialize these fields
	 * @param name
	 * @param age
	 * @param ssn
	 * @param gender
	 * @param address
	 * @param weight
	 * @param employeeID
	 * @param employStatus
	 * @param payAmount
	 */
	public Employee(String name, int age, String ssn,String gender, String address,  Double weight, int employeeID, String employStatus, int payAmount ) {
		super(name,age, ssn, address, gender , weight);
		this.employeeID=employeeID;
		this.employStatus = employStatus;
		this.payAmount = payAmount;
	}

	/*
	 * This method sets input to ids
	 * @param parameter of type int for setEmployeeID method
	 */
	public void setEmployeeID(int ids) {
		employeeID = ids;
	}
	
	/**
	 * method returns employeeID
	 * @return employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}
	
	/*
	 * This method sets input to status
	 * @param parameter of type String for setEmployeeStatus method
	 */
	public void setEmployeeStatus(String status) {
		employStatus  = status;
	}
	
	/**
	 * method returns employStatus
	 * @return employStatus
	 */
	public String getEmployeeStatus() {
		return employStatus;
	}
	
	/*
	 * This method sets input to amounts
	 * @param parameter of type int for setPayAmounts method
	 */
	public void setPayAmounts(int amounts) {
		payAmount  = amounts;
	}
	
	/**
	 * method returns payAmount
	 * @return payAmount
	 */
	public int getPayamount() {
		return payAmount;
	}
	/**
	 * method prints out all attributes
	 */
	public void introduce() {
		System.out.println(getName() + " " + getAge() + " " + getSsn() + " " + getAddress() + " " + getGender() + " " + getWeight() +
				" " + employeeID + " " +employStatus + " " + payAmount );
	}
	/**
	 * 
	 * @param unitsWorked length of time to multpiply with
	 * @return returns total pay depending on if worker is part time or full time
	 */
	public double calculatePay(int unitsWorked){
		
		if (employStatus.toLowerCase().equals("part time") || employStatus.toLowerCase().equals("contractor")) {
			return unitsWorked*payAmount;
		}
		
		return payAmount * 1/52 * unitsWorked;
		
	}
	
	
	
}
