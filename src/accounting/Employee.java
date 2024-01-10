package accounting;

public abstract class Employee implements Comparable<Employee> {
    private int iD;
    private String firstName;
    private String lastName;
    private double hour;

    public Employee (int iD, String firstName, String lastName, double hour){
        this.iD = iD;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hour = hour;

    }

    public int getiD() {
        return iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHour() {
        return hour;
    }
    public abstract double calculateSalary();

    public int compareTo (Employee e){
        return getLastName().compareTo(e.getLastName());
    }

    @Override
    public String toString() {
        return  "ID " + iD +
                ", Name: " + firstName + " " + lastName +
                ", work hours: " + hour;
    }
}
