import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] courses;

        System.out.println("Enter student name");
        String name = input.nextLine();

        int id = 0;
        boolean validInput = false;
        do {
            try {
                System.out.println("Enter student id");
                id = input.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input for ID. Please enter a valid integer.");
                input.nextLine();
            }
        } while (!validInput);
        input.nextLine();

        Student student1 = new Student(name, id);

        System.out.println("Enter courses to enroll in (separated by commas)");
        String coursesInput = input.nextLine();
        courses = coursesInput.split(",");
        for (String course : courses) {
            student1.enrollInCourse(course);
        }

        System.out.println("\nCourse Information:");
        System.out.println("Courses ID: 101");
        System.out.println("Course name: Statistika Industri");
        System.out.println("- Student: Harris");
        System.out.println("- Student: Metta");
        System.out.println("Courses ID: 102");
        System.out.println("Course name: Design Jaringan Komputer");
        System.out.println("- Student: Windy");
        System.out.println("- Student: Amilia");

        System.out.println("\nStudent Details:");
        System.out.println(student1.getUserDetails());

        Teacher teacher1 = new Teacher("Pak Yoga Raditya", 12);
        System.out.println("\nTeacher Details:");
        System.out.println(teacher1.getUserDetails());

        Admin admin1 = new Admin("Hudza", 13);
        System.out.println("\nAdmin Details:");
        System.out.println(admin1.getUserDetails());

        // Close the scanner
        input.close();
    }
}
