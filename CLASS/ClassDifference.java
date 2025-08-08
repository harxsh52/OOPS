package CLASS;

//
/**
 * The main class that runs the program.
 * I've renamed it to 'ClassDifference' to follow the standard Java naming convention (PascalCase).
 */
public class ClassDifference {

    /**
     * The main method is the entry point of the application.
     * The Java Virtual Machine (JVM) starts execution here.
     */
    public static void main(String[] args) {
        // Create two instances (objects) of the Student class
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student();
        Student s3=new Student(s1);

        // Print the details of the student objects to the console
        System.out.println("Student 1: Roll No = " + s1.rollno + ", Name = " + s1.name);
        System.out.println("Student 2: Roll No = " + s2.rollno + ", Name = " + s2.name);
        System.out.println("Student 3: Roll No = " + s3.rollno + ", Name = " + s3.name);
    }
}
