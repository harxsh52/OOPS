package CLASS;

/**
 * Represents a Student with a roll number and a name.
 * This class is in its own file, which is the standard convention in Java.
 */
public class Student {
    int rollno;
    String name;

    /**
     * Constructor to create and initialize a new Student object.
     * @param rollno The student's roll number.
     * @param name The student's name.
     */
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    Student(){
        this.rollno = 0;
        this.name = "Unknown";
    }
     Student( Student other){
        this.rollno = other.rollno;
        this.name = other.name;
    }
}