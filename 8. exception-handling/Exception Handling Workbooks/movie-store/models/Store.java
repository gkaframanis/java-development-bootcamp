package models;
import java.util.ArrayList;

public class Store {
    ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public Movie getMovie(String name) {
        for (int i = 0; i < this.movies.size(); i++) {
            if(this.movies.get(i).getName().equals(name)){
                return new Movie(this.movies.get(i));
            }
        }
        return null;
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public void action (String name, String action) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be null/blank");
        }
        if (!(action.equalsIgnoreCase("sell") || action.equalsIgnoreCase("rent") || action.equalsIgnoreCase("return"))) {
            throw new IllegalArgumentException("You can rent, sell, or return a movie.");
        }
        if (action.equalsIgnoreCase("sell") || action.equalsIgnoreCase("rent")) {
            if (movies.isEmpty()) {
                throw new IllegalStateException("There are no movies to sell or rent.");
            }
        }
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getName().equals(name)) {
                switch(action) {
                    case "sell":
                        if(!(movies.get(i).isAvailable())){
                            throw new IllegalStateException("Cannot sell a movie that is rented out.");
                        }
                        this.movies.remove(i); break;
                    case "rent":
                        if(!(movies.get(i).isAvailable())){
                            throw new IllegalStateException("Cannot rent a movie that is already rented out.");
                        }
                        this.movies.get(i).setIsAvailable(false); break;
                    case "return": this.movies.get(i).setIsAvailable(true); break;
                }
            }
        }
    }

        public String toString() {
            String temp = "";
            for (int i = 0; i < this.movies.size(); i++) {
                temp += this.movies.get(i).toString();
                temp += "\n\n";
            }
            return temp;
        }
    
}
