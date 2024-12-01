public class Main {
    public static void main(String[] args) {
        // Creating a student and teacher objects
        Student student = new Student();
        Teacher teacher = new Teacher();

        // Using the methods from student
        student.performAction();
        student.study();
        student.attendClass();

        // Using the methods from teacher
        teacher.performAction();
        teacher.teach();
        teacher.gradeAssignments();
    }
}
