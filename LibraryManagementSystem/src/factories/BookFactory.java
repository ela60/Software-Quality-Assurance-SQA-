package factories;

import models.Book;

public interface BookFactory {
    Book createBook(String title, String author, double price);
}
