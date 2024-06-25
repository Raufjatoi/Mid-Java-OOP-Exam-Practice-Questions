import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private String instructor;
    private int credits;
    private List<Student> students;

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

    // Methods to add and remove students
    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
}

class Student {
    private String name;
    private String ID;
    private List<Course> courses;

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

    // Method to add a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
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

class CourseManagement {

    // Method to enroll a student in a course
    public void enrollStudentInCourse(Student student, Course course) {
        student.enrollInCourse(course);
    }

    // Method to generate report
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

public class q5 {
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("opp", "sir. owais", 4);
        Course course2 = new Course("la", "Prof. ajeeb", 4);

        // Create students
        Student student1 = new Student("Rauf", "bsai32");
        Student student2 = new Student("Ahsan", "bsai45");

        // Create course management instance
        CourseManagement cm = new CourseManagement();

        // Enroll students in courses
        cm.enrollStudentInCourse(student1, course1);
        cm.enrollStudentInCourse(student1, course2);
        cm.enrollStudentInCourse(student2, course1);

        // Generate reports
        cm.generateReport(student1);
        cm.generateReport(student2);
    }
}
