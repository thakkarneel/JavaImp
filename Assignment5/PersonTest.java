import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Joe", "Smith", 40);
        Person p2 = new Person("Amy", "Gold", 32);
        Person p3 = new Person("Tony", "Stork", 21);
        Person p4 = new Person("Sean", "Irish", 24);
        Person p5 = new Person("Tina", "Brock", 28);
        Person p6 = new Person("Lenny", "Hep", 18);

        List<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);

        Comparator<Person> cmp = null;

        cmp = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getAge() - (o2.getAge());
            }
        };
        Collections.sort(people, cmp);
        for (Person c : people) {
            System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAge());
        }
        System.out.println("");
        cmp = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o2.getAge() - (o1.getAge());
            }
        };
        Collections.sort(people, cmp);
        for (Person c : people) {
            System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAge());
        }
        System.out.println("");


        cmp = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        };
        Collections.sort(people, cmp);
        for (Person c : people) {
            System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAge());
        }


        System.out.println("");


        cmp = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o2.getFirstName().compareTo(o1.getFirstName());
            }
        };
        Collections.sort(people, cmp);
        for (Person c : people) {
            System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAge());
        }

        System.out.println("");


        cmp = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o1.getLastName().length() - (o2.getLastName().length());
            }
        };
        Collections.sort(people, cmp);
        for (Person c : people) {
            System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAge());
        }

        System.out.println("");
        
        cmp = new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return o2.getLastName().length() - (o1.getLastName().length());
            }
        };
        Collections.sort(people, cmp);
        for (Person c : people) {
            System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAge());
        }


    }
}
