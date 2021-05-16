import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) {
        Method[] methods = Person.class.getDeclaredMethods();
        int nMethod = 1;
        System.out.println("1. List of all methods of Person class");
        for (Method method : methods) {
            System.out.printf("%d. %s", ++nMethod, method);
            System.out.println();
        }
        System.out.printf("%d. End - all  methods of Person class", ++nMethod);
        // System.out.println();
        System.out.println();
        System.out.println();

        Method[] methods1 = Address.class.getDeclaredMethods();
        int nMethod1 = 1;
        System.out.println("1. List of all methods of Address class");
        for (Method method : methods1) {
            System.out.printf("%d. %s", ++nMethod1, method);
            System.out.println();
        }
        System.out.printf("%d. End - all  methods of Address class", ++nMethod1);
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("Field Names:");
        Field[] addressField = Address.class.getDeclaredFields();
        for (Field field : addressField) {
            System.out.println(field.getName());
        }

        System.out.println("Field Names and Types:");

        for (Field field : addressField) {
            System.out.println(field.toString());
        }
        System.out.println();


        System.out.println("Field Names:");
        Field[] personField = Person.class.getDeclaredFields();
        for (Field field : personField) {
            System.out.println(field.getName());
        }

        System.out.println("Field Names and Types:");

        for (Field field : personField) {
            System.out.println(field.toString());
        }

    }
}
