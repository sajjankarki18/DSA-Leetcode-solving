package Inheritence;

public class Question_12 {
    public static void main(String[] args) {
        Bookseries [] bookseries = {
          new Bookseries(12, 12, "One piece", "Echiro Oda"),
          new Bookseries(10, 10, "Naruto", "Manashi Kishimoto")
        };

        displayBookSeries(bookseries);
    }
    public static void displayBookSeries(Bookseries [] bookseries){
        for (Bookseries book: bookseries){
            book.publicationInfo();
        }
    }
}

class Publication{
    String title;
    String publisher;

    public Publication(String title, String publisher){
        this.title = title;
        this.publisher = publisher;
    }

    public void publicationInfo(){
        System.out.println("Title: "+ title);
        System.out.println("Publisher: "+ publisher);
    }
}

class Bookseries extends Publication{
    int volumeNumber;
    int totalVolumes;

    public Bookseries(int volumeNumber, int totalVolumes, String title, String publisher){
        super(title, publisher);
        this.volumeNumber=volumeNumber;
        this.totalVolumes=totalVolumes;
    }

    public void publicationInfo(){
        super.publicationInfo();
        System.out.println("Volume number: "+ volumeNumber);
        System.out.println("Total volumes: "+ totalVolumes);
    }
}
