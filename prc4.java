import java.util.ArrayList;
import java.util.List;

class Employee {
    int id ;
    String name ; 
    double salary;
    public Employee(int id , String name , double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId(){
        return id ;
    }
    public String getName(){
        return name ; 
    }
    public double getSalary(){
        return salary;
    }
}
class Manager extends Employee{
    String department;
    public Manager( int id , String name , double salary , String department ){
        super(id , name , salary);
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment ( String D ){
        department = D;
    }
}
class Engineer extends Employee {
    List<String> skills ;
    public Engineer(int id , String name , double salary ){
    super(id , name , salary); 
    this.skills = new ArrayList();   
    }
    public List<String> getSkills(){
        return skills ;
    }
    public void addskills(String S){
        skills.add(S);
    }
}
class Department{
    String name ;
    String location;
    public Department(String name , String location ){
        this.name = name;
        this.location = location;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public void setlocation(String L){
        this.location = L;
    }
}