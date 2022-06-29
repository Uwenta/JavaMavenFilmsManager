package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmRepositoryTest {


    Banner film1 = new Banner(1, "film1", "comedy");
    Banner film2 = new Banner(2, "film2", "fantasy");
    Banner film3 = new Banner(3, "film3", "thriller");
    Banner film4 = new Banner(4, "film4", "adventure");
    Banner film5 = new Banner(5, "film5", "horror");

    FilmsRepository repo = new FilmsRepository();

    @Test
    public void shouldSaveAndFindAll() {
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);

        Banner[] expected = {film1, film2, film3, film4};
        Banner[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldFindById() {

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);

        Banner expected = film3;
        Banner actual = repo.findById(film3.getId());

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindByImpossibleId() {

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);

        Banner expected = null;
        Banner actual = repo.findById(0);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRemoveById() {

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.removeById(film4.getId());

        Banner[] expected = {film1, film2, film3, film5};
        Banner[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldRemoveImpossibleById() {

        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.removeById(8);

        Banner[] expected = {film1, film2, film3, film4, film5};
        Banner[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldRemoveAll() {

        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.removeAll();

        Banner[] expected = {};
        Banner[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

}
