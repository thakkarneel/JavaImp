abstract class Employee extends Person {
    int id;
    String educationLevel;
    boolean directDeposit;

    public Employee(String firstName, String lastName, int age, String ssn, Address address,
                    int id, String educationLevel, boolean directDeposit) {
        super(firstName, lastName, age, ssn, address);

        this.id = id;
        this.educationLevel = educationLevel;
        this.directDeposit = directDeposit;
    }

    public int getId() {
        return id;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public boolean getDirectDeposit() {
        return directDeposit;
    }

    public void setDirectDeposit(boolean directDeposit) {
        this.directDeposit = directDeposit;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return firstName + " " + lastName + " " + age + " " + ssn + " " + address + " " + educationLevel + " " + directDeposit;
    }
    
}
