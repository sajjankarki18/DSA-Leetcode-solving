package Inheritence;

public class Question_8 {
    public static void main(String[] args) {
        System.out.println("hello world");

        Book book = new Book("Game of thrones", "Geroge RR Martin,", "Dark Fantasy", "US");
        book.showLibraryInfo();
    }
}

class Library{
    String libraryName;
    String location;

    public Library(String libraryName, String location){
        this.libraryName = libraryName;
        this.location = location;
    }

    public void showLibraryInfo(){
        System.out.println("Library name: "+ libraryName + " Location: "+ location);
    }
}

class Book extends Library{
    String title;
    String author;

    public Book(String title, String author, String libraryName, String location){
        super(libraryName, location);
        this.author=author;
        this.title=title;
    }

    public void showLibraryInfo(){
        super.showLibraryInfo();
        System.out.println("Title: "+ title + " Author: "+ author);
    }
}

