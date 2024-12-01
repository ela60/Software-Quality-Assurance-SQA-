public class Teacher implements TeacherAction {
    @Override
    public void performAction() {
        // General action for the teacher
        System.out.println("Teacher is performing some general action.");
    }

    @Override
    public void teach() {
        System.out.println("Teacher is teaching a lesson.");
    }

    @Override
    public void gradeAssignments() {
        System.out.println("Teacher is grading assignments.");
    }
}
