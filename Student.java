public class Student extends Person {
    String gradeLevel;

    Student(String name, int id, String gradeLevel) {
        super(name, id); // Call the constructor of the superclass (Person)
        this.gradeLevel = gradeLevel;
    }
    public void displayInfo() {
        super.displayinfo(); // Call the displayInfo method of the superclass (Person)
        System.out.println("Grade Level: " + gradeLevel);
    }
   
    
}
