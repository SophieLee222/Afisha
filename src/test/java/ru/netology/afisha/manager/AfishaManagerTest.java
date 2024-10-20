package ru.netology.afisha.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.afisha.film.AfishaFilm;

public class AfishaManagerTest {

    AfishaManager manager = new AfishaManager();

    AfishaFilm film1 = new AfishaFilm(1, "Bloodshot", "action", "url1");
    AfishaFilm film2 = new AfishaFilm(2, "Onward", "cartoon", "url2");
    AfishaFilm film3 = new AfishaFilm(3, "Hotel Belgrad", "comady", "url3");
    AfishaFilm film4 = new AfishaFilm(4, "Gentlemen", "action", "url4");
    AfishaFilm film5 = new AfishaFilm(5, "The invisible man", "thriller", "url5");
    AfishaFilm film6 = new AfishaFilm(6, "Trolls World Tour", "cartoon", "url6");
    AfishaFilm film7 = new AfishaFilm(7, "Number One", "comady", "url7");

    @Test
    public void shouldAddFilm() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        AfishaFilm[] expected = {film1, film2, film3};
        AfishaFilm[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilms() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);

        manager.findAll();

        AfishaFilm[] expected = {film1, film2, film3, film4, film5};
        AfishaFilm[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithDefaultLimit() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        manager.findLast();

        AfishaFilm[] expected = {film7, film6, film5, film4, film3};
        AfishaFilm[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithSetLimit() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);

        manager.setLimit(3);
        manager.findLast();

        AfishaFilm[] expected = {film7, film6, film5};
        AfishaFilm[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLimitMoreThanArrayLength() {
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);

        manager.setLimit(6);
        manager.findLast();

        AfishaFilm[] expected = {film4, film3, film2, film1};
        AfishaFilm[] actual = manager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }


}
