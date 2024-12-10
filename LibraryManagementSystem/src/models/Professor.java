package models;

public class Professor implements User {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRole() {
        return "Professor";
    }
}
