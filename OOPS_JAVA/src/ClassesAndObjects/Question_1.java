package ClassesAndObjects;


//Create a class Book with properties like title, author, and price. Write methods to set and get these properties.
// Then, create a Library class that holds a list of books and provides methods to add, remove, and display books.


import java.util.ArrayList;
import java.util.List;

public class Question_1 {
    public static void main(String[] args) {
        Book book1 = new Book("Game of thrones", "George RR martin", 15000);
        Book book2 = new Book("Star wars", "Geroge lucas", 20000);
        Book book3 = new Book("Lord of the Rings", "Tokein", 12000);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.removeBook("star wars");
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

    //getter and setter methods
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(){
        this.price = price;
    }

    public void displayInfromation(){
        System.out.println("Title: "+ title + " Author: "+ author + " Price: $"+ price);
    }
}

//library class that holds the list of books

class Library{
    List<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    //method to add a book to library
    public void addBook(Book book){
        System.out.println("Book "+ book.getTitle() + " has been added to library");
        books.add(book);
    }

    //method to remove a book from library
    public void removeBook(String bookName){
        for (Book book: books){
            if (book.getTitle().equalsIgnoreCase(bookName)){
                books.remove(book);
                return;
            }
        }

        System.out.println("Book "+ bookName + " has not been found");
    }

    //display the books from library
    public void displayBooks(){
        if (books.isEmpty()){
            System.out.println("NO books available");
        }else {
            for (Book book: books){
                book.displayInfromation();
            }
        }
    }
}

//In the above code what are these getter and setter methods?
//The getter and setter methods are used to access the properties of the classes which are private(access modifiers)


