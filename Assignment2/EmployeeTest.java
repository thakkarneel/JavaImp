/**
 * 
 * @author neelthakkar
 * @version 1.0
 * 
 * Employee Test program
 *<p>
 *This is a Employee test program that calls the constructor of the Employee class
 */
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee j  = new Employee("Jose Smith", 20, "1234412311", "Male", "245 Jacky Rd", 97.90, 959437, "Contractor", 60);
		j.introduce();
	
		System.out.println(j.calculatePay(30));
		System.out.println();
		
		Employee l  = new Employee("Lisa Gray", 30, "1430311", "Female", "213 Sidd Rd", 161.90, 952337, "Full Time", 110000);
		l.introduce();
		System.out.println(l.calculatePay(2));
		System.out.println();
		
		Employee t  = new Employee("Timothy Briggs", 19, "1434111", "Male", "342 Ayton Rd", 222.98, 912337, "Full Time", 80000);
		t.introduce();
		System.out.println(t.calculatePay(4));
		System.out.println();
		
		Employee g  = new Employee("George Wallace", 45, "1034311", "Male", "244 Ray Rd", 112.08, 912337, "Part Time", 20);
		g.introduce();
		System.out.println(g.calculatePay(25));
		System.out.println();
		
		Employee a  = new Employee("Amy Student", 39, "1334311", "Female", "812 Clay Rd", 111.98, 912337, "Part Time", 45);
		a.introduce();
		System.out.println(a.calculatePay(45));
		System.out.println();

	}

}
