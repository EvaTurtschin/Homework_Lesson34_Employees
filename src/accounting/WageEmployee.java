package accounting;

public class WageEmployee extends Employee{

    private double wage;

    public WageEmployee(int iD, String firstName, String lastName, double hour, double wage){
        super(iD, firstName, lastName, hour);
        this.wage = wage;
    }

    @Override
    public double calculateSalary() {
        double salary = getHour()*wage;
        if (salary <= getHour()*StateConstant.MIN_WAGE)
            salary = getHour()*StateConstant.MIN_WAGE;
        return salary;
    }

    @Override
    public String toString() {
        return "WageEmployee : "+super.toString()+", (wage = " + wage +
                ")";
    }
}
