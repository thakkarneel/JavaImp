/**
 * @author neelthakkar
 * @version 1.0
 * <p>
 * BusinessTest program
 * <p>
 * This is a BusinessTest program. This is a Main Class
 */
public class BusinessTest {

    public static void main(String[] args) {
        Address a1 = new Address(12, "Powell", "Gilroy", "93465", "California");
        Executive e1 = new Executive("Jack", "Ryan", 23, "123654", a1, 25, "Masters", true, 10000, 87000);
        e1.introduce(false);
        System.out.println(e1.computePay());

        Address a2 = new Address(22, "Carey", "Reno", "93225", "Nevada");
        Executive e2 = new Executive("Rob", "Espinoza", 65, "123212", a2, 35, "PHD", false, 4000, 67000);
        e2.introduce(true);
        System.out.println(e2.computePay());

        System.out.println();//------------------------------------------------------------------------------

        Address a3 = new Address(12232, "Dragic", "Salt Lake", "91225", "Utah");
        FullTimeSalaried e3 = new FullTimeSalaried("Claire", "Obry", 19, "444333",
                a3, 42, "HS Diploma", true, 67700);
        e3.introduce(true);
        System.out.println(e3.computePay(5));

        Address a4 = new Address(42232, "Don", "Chico", "91125", "California");
        FullTimeSalaried e4 = new FullTimeSalaried("Ryan", "Toe", 23, "422333",
                a4, 12, "HS Diploma", true, 47700);
        e4.introduce(false);
        System.out.println(e4.computePay(8));

        System.out.println();//---------------------------------------------------------------------------------


        Address a5 = new Address(41132, "Lilly", "Miami", "91129", "Florida");
        FullTimeHourly e5 = new FullTimeHourly("Trae", "Yound", 23, "123492", a5, 49, "Bachelors", true, 50);
        e5.introduce(true);
        System.out.println(e5.computePay(40));

        Address a6 = new Address(41132, "Sandra", "Tampa Bay", "91109", "Florida");
        FullTimeHourly e6 = new FullTimeHourly("Clay", "Ryan", 53, "113492", a6, 29, "Masters", true, 90);
        e6.introduce(false);
        System.out.println(e6.computePay(30));


        System.out.println();//---------------------------------------------------------------------------------

        Address a7 = new Address(46132, "Louis", "Portland", "91209", "Oregon");
        PartTimeHourly e7 = new PartTimeHourly("Coly", "Blur", 18, "231544", a7, 70, "NONE", true, 14);
        e7.introduce(true);
        System.out.println(e7.computePay(35));

        Address a8 = new Address(46132, "Jack", "Tempe", "31209", "Arizona");
        PartTimeHourly e8 = new PartTimeHourly("Shai", "Gily", 38, "291544", a8, 66, "Masters", true, 34);
        e8.introduce(false);
        System.out.println(e8.computePay(55));

        System.out.println();//---------------------------------------------------------------------------------

        Address a9 = new Address(46332, "Kyle", "Chicago", "39209", "Illinois");
        Contractor e9 = new Contractor("Shiv", "Jelly", 28, "191544", a9, 43, "Bachelors", true, 110);
        e9.introduce(true);
        System.out.println(e9.computePay(43));

        Address a10 = new Address(46312, "Peyton", "San Antonio", "39909", "Texas");
        Contractor e10 = new Contractor("Joe", "Burrow", 18, "201540", a10, 41, "NONE", true, 19);
        e10.introduce(false);
        System.out.println(e10.computePay(33));

        System.out.println();//---------------------------------------------------------------------------------

        Address a11 = new Address(40002, "Tom", "Tampa Bay", "30009", "Florida");
        Customer e11 = new Customer("Wad", "Lad", 38, "201990", a11, 53, "Credit Card");
        e11.introduce();
        e11.makePayement();

        Address a12 = new Address(90002, "Clay", "Seattle", "90209", "Washington");
        Customer e12 = new Customer("Younger", "Skarew", 80, "201310", a12, 12, "Debit Card");
        e12.introduce();
        e12.makePayement();


    }
}
