package accounting;

public class SalesManager extends Employee{
    private double salesVolume;
    private double percent;

    public SalesManager(int iD, String firstName, String lastName, double hour, double salesVolume, double percent) {
        super(iD, firstName, lastName, hour);
        this.salesVolume = salesVolume;
        this.percent = percent;
    }

    public double getSalesVolume() {
        return salesVolume;
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public double calculateSalary() {
        double salary = salesVolume * percent;
        if (salary < getHour() * StateConstant.MIN_WAGE)
            salary = getHour()*StateConstant.MIN_WAGE;
        return salary;
    }

    @Override
    public String toString() {
        return "SalesManager: "+super.toString()+", (salesVolume = " + salesVolume +
                ", percent = " + percent + ")";
    }

}
