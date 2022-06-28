package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FilmsManagerTest {


    @Test
    public void shouldSaveFilmAndFindAll() {
        FilmsManager manager = new FilmsManager();
        manager.save("Film1");
        manager.save("Film2");
        manager.save("Film3");
        manager.save("Film4");
        manager.save("Film5");

        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLostLessThanLimit() {
        FilmsManager manager = new FilmsManager();
        manager.save("Film1");
        manager.save("Film2");
        manager.save("Film3");
        manager.save("Film4");
        manager.save("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLost();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLostWithLimit3() {
        FilmsManager manager = new FilmsManager(3);
        manager.save("Film1");
        manager.save("Film2");
        manager.save("Film3");
        manager.save("Film4");
        manager.save("Film5");

        String[] expected = {"Film5", "Film4", "Film3"};
        String[] actual = manager.findLost();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLostWithLimit6() {
        FilmsManager manager = new FilmsManager(6);
        manager.save("Film1");
        manager.save("Film2");
        manager.save("Film3");
        manager.save("Film4");
        manager.save("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLost();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLostWithLimit4() {
        FilmsManager manager = new FilmsManager(4);
        manager.save("Film1");
        manager.save("Film2");
        manager.save("Film3");
        manager.save("Film4");
        manager.save("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2"};
        String[] actual = manager.findLost();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLostWithLimit5() {
        FilmsManager manager = new FilmsManager(5);
        manager.save("Film1");
        manager.save("Film2");
        manager.save("Film3");
        manager.save("Film4");
        manager.save("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLost();
        Assertions.assertArrayEquals(expected, actual);
    }


}
