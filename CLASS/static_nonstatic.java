package CLASS;

public class static_nonstatic {
    int rollno;
    public void Student2(){
        rollno++;
        System.out.println("Roll number: " + rollno);
    }
    public static void main(String[] args) {
        static_nonstatic student = new static_nonstatic();
        // Call the non-static method to increment and print roll number
        student.Student2();
        
        // Create another instance to show that rollno is not shared
        static_nonstatic anotherStudent = new static_nonstatic();
        anotherStudent.Student2();
        
        // Print the roll number of the first instance again
        student.Student2();
    }
}
