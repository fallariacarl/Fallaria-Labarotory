package Act3;
public class Staff extends Person {
    String department;

    // Call the constructor of the superclass (Person)
    Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
 // Call the displayInfo method of the superclass (Person)
    public void displayInfo() {
        super.displayinfo(); 
        System.out.println("Department: " + department);
    }
    
}
