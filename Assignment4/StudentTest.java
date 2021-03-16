/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * StudentTest program
 * <p>
 * This is a StudentTest program. This program is a main method
 */
public class StudentTest {
    public static void main(String[] args) {


        Course c = new Course("CS151", "Object Oriented Design and Programming", "Computer Science", "6:00pm", "Tuesday");
        Student s1 = new Student("John", "Smith", 20, 3.6, "Computer Science", "School of Computer Science", c);

        Student s2 = null;


        try {
            s2 = (Student) s1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        s1.printInfo();
        s2 = new Student("Kyle", "Anderson", 21, 3.9, "Engineering", "School of Engineering", c);
        s2.printInfo();


    }


}
