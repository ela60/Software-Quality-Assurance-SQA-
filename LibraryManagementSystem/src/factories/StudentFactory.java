package factories;

import models.Student;
import models.User;

public class StudentFactory implements UserFactory {
    @Override
    public User createUser(String name) {
        return new Student(name);
    }
}
