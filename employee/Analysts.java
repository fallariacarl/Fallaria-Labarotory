package employee;
public class Analysts extends employee {

    public Analysts(String name, double salary, int age){
        super(name, age, salary);
    }
    public double getAnnualBonus() {
        return super.salary * 0.05;
    }
 }


