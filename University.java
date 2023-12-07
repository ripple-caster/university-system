// University.java
import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Course> courses;
    private List<Student> students;

    public University() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayCourses() {
        System.out.println("All Courses:");
        for (Course course : courses) {
            course.displayInfo();
            System.out.println("------------------------");
        }
    }

    public void displayStudents() {
        System.out.println("All Students:");
        for (Student student : students) {
            student.displayInfo();
            System.out.println("------------------------");
        }
    }
}
