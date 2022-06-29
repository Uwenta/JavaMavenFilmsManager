package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import static org.mockito.Mockito.doReturn;

public class FilmsManagerTest {

    FilmsRepository repo = Mockito.mock(FilmsRepository.class);

    Banner film1 = new Banner(1, "film1", "comedy");
    Banner film2 = new Banner(2, "film2", "fantasy");
    Banner film3 = new Banner(3, "film3", "thriller");
    Banner film4 = new Banner(4, "film4", "adventure");
    Banner film5 = new Banner(5, "film5", "horror");

    @Test
    public void shouldFindLostWithLimit() {
        FilmsManager manager = new FilmsManager(3, repo);
        Banner[] films = {film1, film2, film3, film4, film5};
        doReturn(films).when(repo).findAll();

        Banner[] expected = {film5, film4, film3};
        Banner[] actual = manager.findLost();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLostWithoutLimit() {
        FilmsManager manager = new FilmsManager(repo);
        Banner[] films = {film1, film2, film3, film4, film5};
        doReturn(films).when(repo).findAll();

        Banner[] expected = {film5, film4, film3, film2, film1};
        Banner[] actual = manager.findLost();

        Assertions.assertArrayEquals(expected, actual);
    }

}


