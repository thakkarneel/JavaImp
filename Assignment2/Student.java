/**
 * 
 * @author neelthakkar
 * @version 1.0
 * 
 * Student program
 *<p>
 *This is a Student program.
 */
public class Student {
	/**
	 * private int attributes
	 */
	private int age;
	/**
	 * private double attributes
	 */
	private double gpa;
	/**
	 * private String attributes
	 */
	private String name;
	/**
	 * private String attributes
	 */
	private String major;
	/**
	 * private String attributes
	 */
	private String department;
	
	
	/**
	 * Constructor to initialize these fields
	 * @param name
	 * @param age
	 * @param gpa
	 * @param major
	 * @param department
	 */
	public Student(String name, int age, double gpa, String major, String department) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
	}
	 class Course{
		public void printSchedule() {
			System.out.println("CS151 Tue/Thur 6-7:15" + '\n' + "Eng101 Mon/Wed 10-11:15" + '\n' + "Hist100 Tue/Thur 1:30-2:45");
		}
	 }
	 	//prints out schedule
		void display_Schedule() {
		      Course inner = new Course();
		      inner.printSchedule();
		   }
		
		/*
		 * This method sets input to names
		 * @param parameter of type String for setName method
		 */
		public void setName(String names) {
			name = names;
		}
		
		/**
		 * method returns getName
		 * @return getName
		 */
		public String getName() {
			return name;
		}
		
		/*
		 * This method sets input to age
		 * @param parameter of type int for setAge method
		 */
		public void setAge(int ages) {
			age = ages;
		}
		
		/**
		 * method returns getAge
		 * @return getAge
		 */
		public int getAge() {
			return age;
		}
		
		/*
		 * This method sets input to gpa
		 * @param parameter of type int for setGpa method
		 */
		public void setGpa(int gpas) {
			gpa = gpas;
		}
		
		/**
		 * method returns getGpa
		 * @return getGpa
		 */
		public double getGpa() {
			return gpa;
		}
		
		/*
		 * This method sets input to major
		 * @param parameter of type String for setMajor method
		 */
		public void setMajor(String majors) {
			major = majors;
		}
		
		/**
		 * method returns getMajor
		 * @return getMajor
		 */
		public String getMajor() {
			return major;
		}
		
		/*
		 * This method sets input to department
		 * @param parameter of type String for setDepartment method
		 */
		public void setDepartment(String departments) {
			department = departments;
		}
		
		/**
		 * method returns getDepartment
		 * @return getDepartment
		 */
		public String getDepartment() {
			return department;
		}

		
}

		
		


