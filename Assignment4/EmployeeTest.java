/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * EmployeeTest program
 * <p>
 * This is a EmployeeTest program. This program is a main method
 */
public class EmployeeTest {
    
    public static void main(String[] args) throws Employee.TooManyHoursWorkedException {
        // Employee with the following information: John Smith, id = 101, hourly pay = $35/hr.

        Employee e1 = new Employee("John", "Smith", 101, 35);
        System.out.println(e1.computePay(40));
        System.out.println(e1.computePay(23));
        System.out.println(e1.computePay(1));
        System.out.println(e1.computePay(0));
        System.out.println(e1.computePay(-5));
        System.out.println(e1.computePay(45));


    }
}
