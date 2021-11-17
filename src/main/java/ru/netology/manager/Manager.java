package ru.netology.manager;

import ru.netology.domain.Movie;

public class Manager {
    private int numberMovie = 10;
    private Movie[] movies = new Movie[0];

    public Manager() {

    }

    public Manager(int numberMovie) {
        this.numberMovie = numberMovie;

    }

    public void save(Movie movie) {
        int lenght = movies.length + 1;
        Movie[] temp = new Movie[lenght];
        System.arraycopy(movies, 0, temp, 0, movies.length);
        int lastIndex = temp.length - 1;
        temp[lastIndex] = movie;
        movies = temp;
    }

    public Movie[] getAll() {
        int resultLength;
        if (numberMovie >= movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = numberMovie;
        }

        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {

            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }


}
