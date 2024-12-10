package factories;

import models.Professor;
import models.User;

public class ProfessorFactory implements UserFactory {
    @Override
    public User createUser(String name) {
        return new Professor(name);
    }
}
