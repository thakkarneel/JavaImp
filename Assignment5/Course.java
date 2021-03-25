public class Course {


    private String name;
    private String description;
    private String department;
    private String time;
    private String weekday;

    public Course(String name, String description, String department, String time, String weekday) {
        this.name = name;
        this.description = description;
        this.department = department;
        this.time = time;
        this.weekday = weekday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getWeekday() {
        return weekday;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }
}
