package ru.netology.afisha.manager;

import ru.netology.afisha.film.AfishaFilm;

public class AfishaManager {
    private AfishaFilm[] films = new AfishaFilm[0];
    private int limit = 5;

    public AfishaManager() {
    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public AfishaFilm[] getFilms() {
        return films;
    }

    public void setFilms(AfishaFilm[] films) {
        this.films = films;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    //adding new film
    public void add(AfishaFilm film) {
        AfishaFilm[] tmp = new AfishaFilm[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    //displaying all films findAll
    public AfishaFilm[] findAll() {
        return films;
    }

    //displaying 5 last films reversed findLast
    public AfishaFilm[] findLast() {
        AfishaFilm[] all = findAll();
        int resultLength;

        if (limit < films.length) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        AfishaFilm[] result = new AfishaFilm[resultLength];
        for (int i = 0; i < resultLength; i++) {
            // заполняем result из массива, что лежит в поле
            result[i] = all[films.length - 1 - i];
        }
        // в обратном порядке
        return result;
    }
}
