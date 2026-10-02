public class week3.5 {
    // M5. Instance vs Static: Splitting a Class Correctly
// Concepts: Instance vs static members, why static methods cannot touch instance fields, accessing static members via class

class Student {
    // Instance fields (unique for each student)
    String name;
    int attendance;

    // Static fields (shared by all student objects)
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    // Constructor increments studentCount every time a new student is created
    public Student(String name, int attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    // Static method: can only access static fields, cannot reference instance fields directly
    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class M5_StudentStaticDemo {

    public static void main(String[] args) {
        // Create two Student objects
        Student s1 = new Student("Ravi", 85);
        Student s2 = new Student("Anitha", 92);

        // Call static method through the Class name (not an instance)
        Student.printCollegeInfo();
    }
}

}
