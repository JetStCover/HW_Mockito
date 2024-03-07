package re.netology.Posters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostersTest {
    @Test
    public void shouldFindAll() {
        Posters poster = new Posters();
        String film1 = "Пацаны: Сезон 1";
        String film2 = "Пацаны: Сезон 2";
        String film3 = "Пацаны: Сезон 3";

        poster.addFilm(film1);
        poster.addFilm(film2);
        poster.addFilm(film3);

        String[] actual = poster.findAll();
        String[] expected = {film1, film2, film3};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldFindLast() {
        Posters poster = new Posters();
        String film1 = "Пацаны: Сезон 1";
        String film2 = "Пацаны: Сезон 2";
        String film3 = "Пацаны: Сезон 3";

        poster.addFilm(film1);
        poster.addFilm(film2);
        poster.addFilm(film3);

        String[] actual = poster.findLast();
        String[] expected = {film3, film2, film1};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldFindLastLimit() {
        Posters poster = new Posters(5);
        String film1 = "Пацаны: Сезон 1";
        String film2 = "Пацаны: Сезон 2";
        String film3 = "Пацаны: Сезон 3";
        String film4 = "Пацаны: Сезон 4";
        String film5 = "Пацаны: Сезон 5";
        String film6 = "Пацаны: Сезон 6";

        poster.addFilm(film1);
        poster.addFilm(film2);
        poster.addFilm(film3);
        poster.addFilm(film4);
        poster.addFilm(film5);
        poster.addFilm(film6);

        String[] actual = poster.findLast();
        String[] expected = {film6, film5, film4, film3, film2};

        Assertions.assertArrayEquals(actual, expected);

    }

}