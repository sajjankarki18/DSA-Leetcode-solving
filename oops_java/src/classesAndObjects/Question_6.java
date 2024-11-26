package classesAndObjects;

//1. Movie and Cinema
//Create a Movie class with properties like title, genre, rating, and duration. Write methods to set and get these properties.
//Create a Cinema class that can store a list of movies and has methods to:
//Add a movie to the cinema's collection.
//Remove a movie by title.
//List all movies in a specific genre.
//Display the highest-rated movie in the collection.

import java.util.ArrayList;
import java.util.List;

public class Question_6 {
    public static void main(String[] args) {
        Movie movie = new Movie("forrest gump", "adventure", 9.9, 3);

        Cinema cinema = new Cinema();
        cinema.addMovie(movie);

        cinema.listAllMovies();
    }
}

class Movie {
    String title;
    String genre;
    double ratings;
    double duration;

    public Movie(String title, String genre, double ratings, double duration){
        this.title = title;
        this.genre = genre;
        this.ratings = ratings;
        this.duration = duration;
    }

    //getter and setter methods
    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setRatings(double ratings){
        this.ratings = ratings;
    }

    public void setDuration(double duration){
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public double getRatings(){
        return ratings;
    }

    public double getDuration(){
        return duration;
    }

    public void displayMovies(){
        System.out.println("Title: "+ title);
        System.out.println("Genre: "+ genre);
        System.out.println("Ratings: "+ ratings);
        System.out.println("Durations: "+ duration + " hrs");
    }
}

class Cinema{
    List<Movie> movies;

    public Cinema(){
        movies = new ArrayList<>();
    }

    //add a movie to cinema
    public void addMovie(Movie movie){
        movies.add(movie);
        System.out.println("Movie "+ movie.getTitle() + " has been added to cinema");
    }

    //remove a movie by title
    public void removeMovie(String movieName){
        for (Movie movie: movies){
            if (movie.getTitle().equalsIgnoreCase(movieName)){
                movies.remove(movie);
                return;
            }
        }
        System.out.println("Movie "+ movieName + " not found");
    }

    //list all the movies
    public void listAllMovies(){
        if (movies.isEmpty()){
            System.out.println("There are not movies in cinema currently...!");
        }else {
            for (Movie movie: movies){
                movie.displayMovies();
            }
        }
    }
}

