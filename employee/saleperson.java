package employee;
public class saleperson extends employee  {

    private double commissionPercentage;

    public saleperson(String name, double salary, int age, double commissionPercentage) {
        // super means calling the constructor of the parent class (employee)
        super(name, age, salary);
        this.commissionPercentage = commissionPercentage;

    }
    public double getCommissionPercentage() {
        return commissionPercentage;
    }
    public void raiseCommission() {
        if (this.commissionPercentage  > .30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
    }
    
}
}
