package employee;
public class employee {
    private String name;
    private int Age;
    protected double salary;

    public employee(String name, int age, double salary) {
        this.name = name;
        this.Age = age;
        this.salary = salary;
    }
        
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.Age;
    }
    public double getSalary(){
        return this.salary;
    }
    public void raiseSalary(){
        this.salary = this.salary * 1.2;
    }
    public static void main(String[] args) {
       employee emp = new employee("John Doe", 30, 50000);
       System.out.println("Name: " + emp.getName());
       System.out.println("Age: " + emp.getAge());
       System.out.println("salary: " + emp.getSalary());

         emp.raiseSalary();
        
         System.out.println("New salary: " + emp.getSalary());
    }

        
}


