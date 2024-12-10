package factories;

import models.Book;
import models.ScienceBook;

public class ScienceBookFactory implements BookFactory {
    @Override
    public Book createBook(String title, String author, double price) {
        return new ScienceBook(title, author, price);
    }
}
