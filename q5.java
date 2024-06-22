//5. University Course Management:

//o Create a class named Student with attributes for name, ID, and an array of
//enrolled courses (represented by Course objects).
class Course {
    String subject;

    public Course (String subject){
        this.subject = subject;
    } 
    // Enroll a student in a course (check for prerequisites if applicable).
    public static void enroll (String subject , Student ID){
        if (subject == "english" || subject ==  "math" || subject == "ps" || subject ==  "programming"  && ID[0][1][2][3] == "BSAI"){
            

        }

    }
}
//o Design a class named Course with information like course name, instructor,
//credits, and a list of enrolled students (using Student objects).
class Student {
    String name , ID ;
    Course [] subjects ;

    //construct 
    public Student (String name , String ID , Course [] subjects){
        this.name = name;
        this.ID = ID;
        this.subjects = subjects;


        
    }
}
//o Implement functionalities in separate classes or methods to:

// Calculate the total credits a student is enrolled in.
// Generate a report displaying student names, enrolled courses, and their 




public class q5 {
    
}
