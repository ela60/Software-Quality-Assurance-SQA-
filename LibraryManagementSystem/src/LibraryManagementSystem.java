import models.*;
import factories.*;
import strategies.*;
import services.*;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        UserFactory studentFactory = new StudentFactory();
        UserFactory professorFactory = new ProfessorFactory();

        BookFactory fictionBookFactory = new FictionBookFactory();
        BookFactory scienceBookFactory = new ScienceBookFactory();

        User student = studentFactory.createUser("Alice");
        User professor = professorFactory.createUser("Dr. Smith");

        Book fictionBook = fictionBookFactory.createBook("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        Book scienceBook = scienceBookFactory.createBook("A Brief History of Time", "Stephen Hawking", 20.99);

        Loan studentLoan = new Loan(student, fictionBook, 5, new StudentFineStrategy());
        Loan professorLoan = new Loan(professor, scienceBook, 3, new ProfessorFineStrategy());

        studentLoan.displayLoanDetails();
        System.out.println();
        professorLoan.displayLoanDetails();
    }
}
