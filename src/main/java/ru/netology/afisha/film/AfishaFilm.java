package ru.netology.afisha.film;

public class AfishaFilm {
    private int id;
    private String title;
    private String genre;
    private String coverImage;

    public AfishaFilm() {
    }

    public AfishaFilm(int id, String title, String genre, String coverImage) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.coverImage = coverImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }
}
