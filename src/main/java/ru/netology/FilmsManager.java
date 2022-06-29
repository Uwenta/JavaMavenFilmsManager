package ru.netology;

public class FilmsManager {

    private FilmsRepository repo;
    private int limit = 10;

    public FilmsManager(FilmsRepository repo) {
        this.repo = repo;
    }

    public FilmsManager(int limit, FilmsRepository repo) {
        this.limit = limit;
        this.repo = repo;
    }

    public void add(Banner newFilm) {
        repo.save(newFilm);
    }


    public Banner[] findAll() {
        return repo.findAll();
    }

    public Banner[] findLost() {
        int countLost;
        int countAll = findAll().length;
        if (limit > countAll) {
            countLost = countAll;
        } else countLost = limit;

        Banner[] findLost = new Banner[countLost];
        for (int i = 0; i < countLost; i++) {
            findLost[i] = findAll()[countAll - 1 - i];
        }
        return findLost;

    }


}
