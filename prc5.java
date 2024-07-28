import java.util.ArrayList;
import java.util.Date;
import java.util.List;
abstract class Person {
    String name;
    int age;
    String address;
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public abstract void displayDetails();
}
class Patient extends Person {
    int patientId;
    List<String> medicalHistory;
    public Patient(String name, int age, String address, int patientId) {
        super(name, age, address);
        this.patientId = patientId;
        this.medicalHistory = new ArrayList<>();
    }
    public int getPatientId() {
        return patientId;
    }
    public List<String> getMedicalHistory() {
        return medicalHistory;
    }
    public void addMedicalRecord(String record) {
        medicalHistory.add(record);
    }
    @Override
    public void displayDetails() {
        System.out.println("patient name: " + getName());
        System.out.println("patient i: " + getPatientId());
        System.out.println("mmedical history: " + medicalHistory);
    }
}
abstract class Staff extends Person {
    int staffId; 
    String role;
    public Staff(String name, int age, String address, int staffId, String role) {
        super(name, age, address);
        this.staffId = staffId;
        this.role = role;
    }
    public int getStaffId() {
        return staffId;
    }
    public String getRole() {
        return role;
    }
    public abstract void performDuty();
    @Override
    public void displayDetails() {
        System.out.println("staff mame: " + getName());
        System.out.println("staff id: " + getStaffId());
        System.out.println("role: " + getRole());
    }
}
class Doctor extends Staff {
    String specialty;
    public Doctor(String name, int age, String address, int staffId, String specialty) {
        super(name, age, address, staffId, "Doctor");
        this.specialty = specialty;
    }
    public String getSpecialty() {
        return specialty;
    }
    @Override
    public void performDuty() {
        System.out.println("performin duty");
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("speciaty: " + getSpecialty());
    }
}
class Nurse extends Staff {
    String shift;
    public Nurse(String name, int age, String address, int staffId, String shift) {
        super(name, age, address, staffId, "Nurse");
        this.shift = shift;
    }
    public String getShift() {
        return shift;
    }
    @Override
    public void performDuty() {
        System.out.println("performin duty ");
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Shift: " + getShift());
    }
}
class MedicalRecord {
    private int recordId;
    private Date date;
    private String details;
    public MedicalRecord(int recordId, Date date, String details) {
        this.recordId = recordId;
        this.date = date;
        this.details = details;
    }
    public int getRecordId() {
        return recordId;
    }
    public Date getDate() {
        return date;
    }
    public String getDetails() {
        return details;
    }
}
public class prc5 {
    public static void main(String[] args) {
        Patient patient = new Patient("p1", 30, "earth", 0);
        Doctor doctor = new Doctor("d1", 45, "also eath", 2, "neeurology");
        Nurse nurse = new Nurse("n1", 29, "guse it ", 1000, "night");
        patient.addMedicalRecord("checked today");
        patient.addMedicalRecord("maybe die maybe not");
        patient.displayDetails();
        doctor.displayDetails();
        nurse.displayDetails();
        doctor.performDuty();
        nurse.performDuty();
    }
}
