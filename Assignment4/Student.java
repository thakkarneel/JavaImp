/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * Student program
 * <p>
 * This is a Student program. This program implements CLoneable
 */
public class Student implements Cloneable {
    private String firstName;
    private String lastName;
    private int age;
    private double GPA;
    private Course course;
    private String major;
    private String department;

    public Student(String firstName, String lastName, int age, double GPA, String major, String department, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.GPA = GPA;
        this.major = major;
        this.department = department;
        this.course = course;

    }

    /**
     * Method to get firstName
     *
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method to get lastName
     *
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method to get age
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Method to get course
     *
     * @return course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Method to get GPA
     *
     * @return GPA
     */
    public double getGPA() {
        return GPA;
    }

    /**
     * Method to get department
     *
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Method to get major
     *
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * method to set lastName.
     *
     * @param lastName double is entered and initialized
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * method to set firstName.
     *
     * @param firstName double is entered and initialized
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * method to set age.
     *
     * @param age double is entered and initialized
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * method to set course.
     *
     * @param course double is entered and initialized
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * method to set GPA.
     *
     * @param GPA double is entered and initialized
     */
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    /**
     * prints out info for all attributes
     */
    public void printInfo() {
        System.out.println(firstName + " " + lastName + " " + age + " " + GPA + " " + course.getCourseName() + " " + course.getCourseDescription()
                + " " + course.getDepartment() + " " + course.getCourseStartTime() + " " + course.getWeekday());
        //String courseName, String courseDescription, String department, String courseStartTime, String weekday
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    protected Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.course = (Course) course.clone();
        return student;
    }


}
