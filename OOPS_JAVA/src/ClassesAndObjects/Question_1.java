package ClassesAndObjects;

//Create a class Book with properties like title, author, and price. Write methods to set and get these properties.
// Then, create a Library class that holds a list of books and provides methods to add, remove, and display books.

import java.util.ArrayList;
import java.util.List;

public class Question_1 {
    public static void main(String[] args) {
        Book book1 = new Book("Game of thrones", "Geroge RR martin", 10000);
        Book book2 = new Book("Lord of the rings", "Tolkein", 12000);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();

        library.removeBook("lord of the rings");
        library.removeBook("game of thrones");
        library.displayBooks();
    }
}

class Book{
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setTitle(){
        this.title = title;
    }

    public void setAuthor(){
        this.author = author;
    }

    public void setPrice(){
        this.price = price;
    }

    public void displayInformation(){
        System.out.println("Book: "+title +" Author: "+ author+ " Price: $"+ price);
    }
}

class Library{
    List<Book> books;

    Library(){
        books = new ArrayList<>();
    }

    //method to add a book in the library
    public void addBook(Book book){
        books.add(book);
        System.out.println("The book "+ book.getTitle() +" has been added to library");
    }

    //method to remove a book from library
    public void removeBook(String bookName){
        for (Book book: books){
            if (book.getTitle().equalsIgnoreCase(bookName)){
                System.out.println("The book " + book.getTitle() + " has been removed");
                books.remove(book);
                return;
            }
        }

        System.out.println("The book " + bookName + " is not available! ");
    }

    //fetch all the books from the library
    public void displayBooks(){
        System.out.println("Available books: ");
        if (books.isEmpty()){
            System.out.println("The library is empty!");
        }else {
            for (Book book: books){
                book.displayInformation();
            }
        }
    }
}
