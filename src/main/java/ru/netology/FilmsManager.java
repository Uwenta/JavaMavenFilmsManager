package ru.netology;

public class FilmsManager {

    private String[] films = new String[0];
    private int limit = 10;

    public FilmsManager() {

    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }

    public void save(String newFilm) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;

    }

    public String[] findAll() {
        return films;

    }

    public String[] findLost() {
        int countLost;
        if (limit > films.length) {
            countLost = films.length;
        } else countLost = limit;

        String[] findLost = new String[countLost];
        for (int i = 0; i < findLost.length; i++) {
            findLost[i] = films[films.length - 1 - i];
        }
        return findLost;

    }


}
