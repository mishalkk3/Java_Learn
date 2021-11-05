package LibraryApp;

import java.util.ArrayList;

public class LibApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        System.out.printf("Searching for books with ISBN %s\n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null){
            System.out.printf("I found:\n\tTitle: %s\n\tGenre: %s\n\tAuthor:%s",book.getTitle(),book.getGenre(),book.getAuthor());
        }
        else {
            System.out.println("0 books found");
        }
        System.out.println("\n");
    }

    public void searchByTitle(String keyword) {
        System.out.printf("Searching for books with \'%s\' in the title...\n",keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%d books found%s\n", books.size(),books.size()>0 ? ":" : ".");
        for (Book book : books) {
            System.out.printf("\tTitle: %s\n\tGenre: %s\n\tAuthor:%s\n\t---\n",book.getTitle(),book.getGenre(),book.getAuthor());
        }
        System.out.println();
    }

    public void checkOutBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            if (book.checkOut()) {
                System.out.println("Book checked out successfully.");
                System.out.printf("\tISBN: %s\n\tTitle: %s\n\tAuthor:%s\n", book.getIsbn(), book.getTitle(), book.getAuthor());
            }
            else {
                System.out.println("Failed to check out book.");
                System.out.println("More books checked out than quantity.");
            }
        }
        else {
            System.out.println("Failed to check out book");
            System.out.println("Book with id "+isbn+" is not on record.");
        }
        System.out.println();
    }

    public void checkInBook(String isbn) {
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            book.checkIn();
            System.out.println("Book checked in successfully.");
            System.out.printf("\tISBN: %s\n\tTitle: %s\n\tAuthor:%s\n",book.getIsbn(),book.getTitle(),book.getAuthor());
        }
        else {
            System.out.println("Failed to check in book");
            System.out.println("Book with id "+isbn+" is not on record.");
        }
        System.out.println();
    }
}
