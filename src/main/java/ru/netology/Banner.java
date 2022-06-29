package ru.netology;

public class Banner {

    private int id;
    private String name;
    private String genre;

    public Banner(int id, String name, String genre) {

        this.setId(id);
        this.setName(name);
        this.setGenre(genre);

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
