public class solution {
    class Student1{
        int rollno;
        String name;

        /**
         * Constructor to create and initialize a new Student object.
         * @param rollno The student's roll number.
         * @param name The student's name.
         */
        public Student1(int rollno, String name) {
            this.rollno = rollno;
            this.name = name;
        }}
        public static void main(String[] args) {
            // Create a new Student object

            Student1 student = new Student1(131, "John Doe");
            
            // Print the student's details
            System.out.println("Roll No: " + student.rollno);
            System.out.println("Name: " + student.name);

    }
}
