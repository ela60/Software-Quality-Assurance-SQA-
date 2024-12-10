package services;

import models.Book;
import models.User;
import strategies.FineStrategy;

public class Loan {
    private User user;
    private Book book;
    private int daysOverdue;
    private FineStrategy fineStrategy;

    public Loan(User user, Book book, int daysOverdue, FineStrategy fineStrategy) {
        this.user = user;
        this.book = book;
        this.daysOverdue = daysOverdue;
        this.fineStrategy = fineStrategy;
    }

    public void displayLoanDetails() {
        System.out.println("User: " + user.getName() + " (" + user.getRole() + ")");
        System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
        System.out.println("Days Overdue: " + daysOverdue);
        System.out.println("Fine: $" + fineStrategy.calculateFine(daysOverdue));
    }
}
