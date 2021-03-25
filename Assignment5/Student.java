import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double gpa;
    private String major;
    private String department;
    private LinkedList<Course> course;

    public Student(String firstName, String lastName, int age, double gpa, String major, String department, LinkedList<Course> course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
        this.department = department;
        this.course = course;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCourse(LinkedList<Course> course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public LinkedList<Course> getCourse() {
        return course;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void addCourse(Course c) {
        course.add(c);
    }

    public void removeCourse(Course c) {
        course.remove(c);
    }


    public void sortCourses(boolean asceding, String attribute) {
        Comparator<Course> cmp = null;
        if (attribute.equals("name")) {
            cmp = new Comparator<Course>() {
                public int compare(Course o1, Course o2) {
                    if (asceding) {
                        return o1.getName().compareTo(o2.getName());
                    } else {
                        return o2.getName().compareTo(o1.getName());
                    }
                }
            };
        } else if (attribute.equals("description")) {
            cmp = new Comparator<Course>() {
                public int compare(Course o1, Course o2) {
                    if (asceding) {
                        return o1.getDescription().compareTo(o2.getDescription());
                    } else {
                        return o2.getDescription().compareTo(o1.getDescription());
                    }
                }
            };
        } else if (attribute.equals("department")) {
            cmp = new Comparator<Course>() {
                public int compare(Course o1, Course o2) {
                    if (asceding) {
                        return o1.getDepartment().compareTo(o2.getDepartment());
                    } else {
                        return o2.getDepartment().compareTo(o1.getDepartment());
                    }
                }
            };
        } else if (attribute.equals("time")) {
            cmp = new Comparator<Course>() {
                public int compare(Course o1, Course o2) {
                    if (asceding) {
                        return o1.getTime().compareTo(o2.getTime());
                    } else {
                        return o2.getTime().compareTo(o1.getTime());
                    }
                }
            };
        } else if (attribute.equals("weekday")) {
            cmp = new Comparator<Course>() {
                public int compare(Course o1, Course o2) {
                    if (asceding) {
                        return o1.getWeekday().compareTo(o2.getWeekday());
                    } else {
                        return o2.getWeekday().compareTo(o1.getWeekday());
                    }
                }
            };
        }
        Collections.sort(course, cmp);
        for (Course c : course) {
            System.out.println(c.getName() + " " + c.getDescription() + " " + c.getDepartment() + " " + c.getTime() + " " + c.getWeekday());
        }
    }
}







