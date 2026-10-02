public class week3.3 {
    // M3. Overloaded Constructors for a Course
// Concepts: Constructor overloading, this() chaining, avoiding duplicated initialization logic

class Course {
    String code;
    String title;
    int credits;
    int labCredits;

    // 4-argument constructor: sets all fields directly
    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    // 3-argument constructor for theory-only courses: chains to 4-arg constructor via this(...)
    public Course(String code, String title, int credits) {
        this(code, title, credits, 0); // Sets labCredits to 0
    }

    // Method to calculate total credits
    public int totalCredits() {
        return this.credits + this.labCredits;
    }
}

public class M3_CourseConstructorDemo {

    public static void main(String[] args) {
        // Create theory-only course (uses 3-arg constructor chaining to 4-arg)
        Course theoryCourse = new Course("21CSC201J", "Data Structures", 4);

        // Create course with lab component (uses 4-arg constructor)
        Course labCourse = new Course("21CSC205L", "DSA Lab", 3, 1);

        // Print total credits for both
        System.out.println(theoryCourse.code + " total credits: " + theoryCourse.totalCredits());
        System.out.println(labCourse.code + " total credits: " + labCourse.totalCredits());
    }
}

}
