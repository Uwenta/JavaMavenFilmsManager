package ru.netology;

public class FilmsRepository {

    private Banner[] films = new Banner[0];

    public void save(Banner newFilm) {
        Banner[] tmp = new Banner[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = newFilm;
        films = tmp;

    }

    public Banner[] findAll() {
        return films;
    }

    public Banner findById(int id) {
        int copyToIndex = 0;
        for (Banner film : films)
            if (film.getId() == id) {
                return film;
            } else copyToIndex++;
        return null;
    }

    public void removeById(int id) {
        if (findById(id) != null) {
            Banner[] tmp = new Banner[films.length - 1];
            int copyToIndex = 0;
            for (Banner film : films) {
                if (film.getId() != id) {
                    tmp[copyToIndex] = film;
                    copyToIndex++;
                }
                films = tmp;

            }

        }
        return;
    }

    public void removeAll() {
        Banner[] tmp = new Banner[0];
        this.films = tmp;
    }

}
