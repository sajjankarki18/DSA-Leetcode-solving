package ClassesAndObjects;

//1. Movie and Cinema
//Create a Movie class with properties like title, genre, rating, and duration. Write methods to set and get these properties.
//Create a Cinema class that can store a list of movies and has methods to:
//Add a movie to the cinema's collection.
//Remove a movie by title.
//List all movies in a specific genre.
//Display the highest-rated movie in the collection.

import java.util.ArrayList;
import java.util.List;

public class Questions_4 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Lord of the rings", "dark-fatasy", 9.8, 2.5);
        Movie movie2 = new Movie("Star wars", "sci-fi", 9.9, 2);

        Cinema cinema = new Cinema();
        cinema.addMovie(movie1);
        cinema.addMovie(movie2);

        cinema.removeMovie("dasasd");
        cinema.displayMovies();

        cinema.displayHighestRatedMovies();
    }
}


class Movie{
    private String title;
    private String genre;
    private double rating;
    private double duration;

    public Movie(String title, String genre, double rating, double duration){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
    }

    //getter and setter methods
    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public double getRating(){
        return rating;
    }

    public double getDuration(){
        return duration;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public void setDuration(double duration){
        this.duration = duration;
    }

    public void displayInformation(){
        System.out.println("Title: "+ title + " Genre: "+ genre + " Ratings: "+ rating + " Duration: "+ duration+ "hrs");
    }
}

//cinema class

class Cinema{
    List<Movie> movies;

    public Cinema(){
        movies = new ArrayList<>();
    }

    //add movies to cinema;
    public void addMovie(Movie movie){
        System.out.println("Movie: "+ movie.getTitle() + " has been added...");
        movies.add(movie);
    }

    //remove a movie from cinema
    public void removeMovie(String movieName){
        for (Movie movie: movies){
            if (movie.getTitle().equalsIgnoreCase(movieName)){
                movies.remove(movie);
                return;
            }
        }

        System.out.println("Movie"+ movieName + " not found!");
    }

    public void displayHighestRatedMovies(){
        for (Movie movie: movies){
            if (movie.getRating() >= 9.9){
                System.out.println("Movie: " + movie.getTitle() + " Duration: " + movie.getDuration());
            }
        }
    }

    public void displayMovies(){
        if (movies.isEmpty()){
            System.out.println("No movies currently!");
        }else {
            for (Movie movie: movies){
                movie.displayInformation();
            }
        }
    }
}