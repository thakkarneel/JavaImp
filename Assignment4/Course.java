/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * Course program
 * <p>
 * This is a Course program. This program implements CLoneable
 */
public class Course implements Cloneable {
    private String courseName;
    private String courseDescription;
    private String department;
    private String courseStartTime;
    private String weekday;

    /**
     * Constructor to initialize attributes
     *
     * @param courseName
     * @param courseDescription
     * @param department
     * @param courseStartTime
     * @param weekday
     */
    public Course(String courseName, String courseDescription, String department,
                  String courseStartTime, String weekday) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.department = department;
        this.courseStartTime = courseStartTime;
        this.weekday = weekday;
    }

    /**
     * Method to get courseDescription
     *
     * @return courseDescription
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * Method to get courseName
     *
     * @return courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Method to get courseStartTime
     *
     * @return courseStartTime
     */
    public String getCourseStartTime() {
        return courseStartTime;
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
     * Method to get weekday
     *
     * @return weekday
     */
    public String getWeekday() {
        return weekday;
    }

    /**
     * method to set courseDescription.
     *
     * @param courseDescription double is entered and initialized
     */
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    /**
     * method to set courseName.
     *
     * @param courseName double is entered and initialized
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     * method to set courseStartTime.
     *
     * @param courseStartTime double is entered and initialized
     */
    public void setCourseStartTime(String courseStartTime) {
        this.courseStartTime = courseStartTime;
    }

    /**
     * method to set department.
     *
     * @param department double is entered and initialized
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * method to set weekday.
     *
     * @param weekday double is entered and initialized
     */
    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    /**
     * @return super.clone
     * @throws CloneNotSupportedException
     */
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

