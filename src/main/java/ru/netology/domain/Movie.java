package ru.netology.domain;

public class Movie {
    private int id;
    private String name;
    private String genre;
    private String image;

    public Movie() {

    }

    public Movie(int id, String name, String genre, String image) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.image = image;
    }


}
