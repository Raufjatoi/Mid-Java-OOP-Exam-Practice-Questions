// importin libs 
import java.util.ArrayList;
import java.util.List;
// course class 
class Course {
    // attributes 
    String name;
    String instructor;
    int credits;
    List<Student> students;

    // Constructor
    public Course(String name, String instructor, int credits) {
        this.name = name;
        this.instructor = instructor;
        this.credits = credits;
        this.students = new ArrayList<>();
    }
    // Getters
    public String getName() {
        return name;
    }
    public String getInstructor() {
        return instructor;
    }

    public int getCredits() {
        return credits;
    }
    public List<Student> getStudents() {
        return students;
    }

    // methods to add and remove students
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
}
// another class for student 
class Student {
    // properties 
    String name;
    String ID;
    List<Course> courses;

    // Constructor
    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.courses = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getID() {
        return ID;
    }
    public List<Course> getCourses() {
        return courses;
    }
    // method to add 
    public void addCourse(Course course) {
        courses.add(course);
    }
    // Method to calculate total credits
    public int calculateTotalCredits() {
        int totalCredits = 0;
        for (Course course : courses) {
            totalCredits += course.getCredits();
        }
        return totalCredits;
    }
}

// 3rd class for managment 
class CourseManagement {

    // method to enroll a student in a course
    public void enrollStudentInCourse(Student student, Course course) {
        student.addCourse(course);
    }

    // method to generate report
    public void generateReport(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getID());
        System.out.println("Enrolled Courses:");
        for (Course course : student.getCourses()) {
            System.out.println("  - " + course.getName() + " (Instructor: " + course.getInstructor() + ", Credits: " + course.getCredits() + ")");
        }
        System.out.println("Total Credits: " + student.calculateTotalCredits());
    }
}
// main class 
public class q5 {
    // main func 
    public static void main(String[] args) {
        // creatin courses
        Course course1 = new Course("opp", "sir. owais", 4);
        Course course2 = new Course("la", "Prof. ajeeb", 4);
        // creatin students
        Student student1 = new Student("Rauf", "bsai32");
        Student student2 = new Student("Ahsan", "bsai45");
        // creatin course management instance
        CourseManagement cm = new CourseManagement();
        // enroll students in courses
        cm.enrollStudentInCourse(student1, course1);
        cm.enrollStudentInCourse(student1, course2);
        cm.enrollStudentInCourse(student2, course1);
        // generatin reports
        cm.generateReport(student1);
        cm.generateReport(student2);
    }
}
