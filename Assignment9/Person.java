abstract class Person {
    String firstName;
    String lastName;
    int age;
    String ssn;
    Address address;

    public Person(String firstName, String lastName, int age, String ssn, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String toString() {
        return firstName + " " + lastName + " " + address + " " + age + " " + ssn;
    }
}
