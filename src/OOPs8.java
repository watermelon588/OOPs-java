interface Department {
    String depName = "";
    String depHead = "";

    void getDeptData(String name, String head);
    void printDeptData();
}
class Hostel {
    String hostelName;
    String hostelLocation;
    int noOfRooms;

    void getHostelData(String name, String location, int rooms) {
        hostelName = name;
        hostelLocation = location;
        noOfRooms = rooms;
    }

    void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + noOfRooms);
    }
}
class Student extends Hostel implements Department {
    String studentName;
    int regNo;
    String electiveSubject;
    float avgMarks;

    String depName;
    String depHead;

    // Student data
    void getStudentData(String name, int reg, String subject, float marks) {
        studentName = name;
        regNo = reg;
        electiveSubject = subject;
        avgMarks = marks;
    }

    void printStudentData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Reg No: " + regNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
    }

    // Implement Department methods
    public void getDeptData(String name, String head) {
        depName = name;
        depHead = head;
    }

    public void printDeptData() {
        System.out.println("Department Name: " + depName);
        System.out.println("Department Head: " + depHead);
    }
}
public class OOPs8 {
    public static void main(String[] args) {
        Student s = new Student();

        s.getStudentData("Rohit", 101, "AI", 89.5f);
        s.getHostelData("A Block", "Kolkata", 120);
        s.getDeptData("CSE", "Dr. Sharma");

        System.out.println("\n--- Student Details ---");
        s.printStudentData();
        s.printHostelData();
        s.printDeptData();
    }
}