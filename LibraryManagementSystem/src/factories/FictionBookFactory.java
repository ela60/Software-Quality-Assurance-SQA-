package factories;

import models.Book;
import models.FictionBook;

public class FictionBookFactory implements BookFactory {
    @Override
    public Book createBook(String title, String author, double price) {
        return new FictionBook(title, author, price);
    }
}
