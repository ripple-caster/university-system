// Main.java
public class Main {
    public static void main(String[] args) {
        // Create courses
        Course javaCourse = new Course("CS101", "Introduction to Java Programming");
        Course algorithmsCourse = new Course("CS202", "Algorithms and Data Structures");

        // Create students
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        // Create a university
        University university = new University();

        // Add courses to the university
        university.addCourse(javaCourse);
        university.addCourse(algorithmsCourse);

        // Add students to the university
        university.addStudent(student1);
        university.addStudent(student2);

        // Enroll students in courses
        javaCourse.enrollStudent(student1);
        algorithmsCourse.enrollStudent(student2);

        // Display university information
        university.displayCourses();
        university.displayStudents();
    }
}
