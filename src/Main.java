package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, student!");

        int studentAge = 31;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;

        String studentFirstName = "Med";
        String studentLastName = "Aduh";
        String studentFullName = studentFirstName + " " + studentLastName;
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println("Name: " + studentFullName);
        System.out.println("Initials: " + studentFirstInitial + "." + studentLastInitial + ".");
        System.out.println("Age: " + studentAge);
        System.out.println("GPA: " + studentGPA);
        System.out.println("Attendance: " + hasPerfectAttendance);
    }
}
