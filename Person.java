// Base Class
public class Person {
    private String name;
    private int id;
 
    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }
    //Display method
    public void displayinfo() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
    }
    // SchoolTest Main Method
    public static void main (String[] args){
        // Create instances of subclasses
        Student student = new Student("Carl", 20241080, "1st Year");
        Teacher teacher = new Teacher("Medina", 2024108, "Object Oriented Programming");
        Staff staff = new Staff("Fabro", 20245662, "Guidance Office");
   
        // Display information
        System.out.println("Student Information:");
        student.displayinfo();
        System.out.println("\nTeacher Information:");
        teacher.displayinfo();
        System.out.println("\nStaff Information:");
        staff.displayinfo();
    }
}
 