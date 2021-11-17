package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {
    Manager movies = new Manager();

    private Movie first = new Movie(1, "name 1", "genre", "url 1");
    private Movie second = new Movie(2, "name 2", "genre", "url 2");
    private Movie third = new Movie(3, "name 3", "genre", "url 3");
    private Movie fourth = new Movie(4, "name 4", "genre", "url 4");
    private Movie fifth = new Movie(5, "name 5", "genre", "url 5");
    private Movie sixth = new Movie(6, "name 6", "genre", "url 6");
    private Movie seventh = new Movie(7, "name 7", "genre", "url 7");
    private Movie eighth = new Movie(8, "name 8", "genre", "url 8");
    private Movie ninth = new Movie(9, "name 9", "genre", "url 9");
    private Movie tenth = new Movie(10, "name 10", "genre", "url 10");
    private Movie eleventh = new Movie(11, "name 11", "genre", "url 11");
    private Movie twelfth = new Movie(12, "name 12", "genre", "url 12");

    @BeforeEach
    public void setUp1() {
        movies.save(first);
        movies.save(second);
        movies.save(third);
    }

    @Test

    public void shouldGetMovieDefaultOutAddThird() {
        Movie[] actual = movies.getAll();
        Movie[] expected = new Movie[]{third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldGetMovieDefaultOutAddTwelfth() {

        movies.save(fourth);
        movies.save(fifth);
        movies.save(sixth);
        movies.save(seventh);
        movies.save(eighth);
        movies.save(ninth);
        movies.save(tenth);
        movies.save(eleventh);
        movies.save(twelfth);

        Movie[] actual = movies.getAll();
        Movie[] expected = new Movie[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }

// ------------ тест конструктора на количество выводимых фильмов --------
    @Test

    public void shouldGetSecondMovieAddThirdMovie() {
        Manager movies = new Manager(2);
        movies.save(first);
        movies.save(second);
        movies.save(third);


        Movie[] actual = movies.getAll();
        Movie[] expected = new Movie[]{third, second};
        assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldGetFifthMovieAddThirdMovie() {
        Manager movies = new Manager(5);
        movies.save(first);
        movies.save(second);
        movies.save(third);


        Movie[] actual = movies.getAll();
        Movie[] expected = new Movie[]{third, second, first};
        assertArrayEquals(expected, actual);
    }


}