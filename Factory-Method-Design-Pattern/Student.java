// Student class implementing the StudentAction interface
public class Student implements StudentAction {
    public void performAction() {
        // General action for the student
        System.out.println("Student is performing some general action.");
    }

    public void study() {
        System.out.println("Student is studying.");
    }

    public void attendClass() {
        System.out.println("Student is attending the class.");
    }
}

// Teacher class implementing the TeacherAction interface
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
