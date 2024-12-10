package models;

public class Student implements User {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Student";
    }
}
