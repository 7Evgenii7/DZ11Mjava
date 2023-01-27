package ru.netology;

public class FilmManager {
    private String[] films = new String[0];
    private int number;

    public FilmManager() {
        this.number = 10;

    }

    public FilmManager(int nember) {
        this.number = nember;
    }




    public void addFilm(String film){
        String[] tmp = new String[films.length + 1];
        for(int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }
    public String[] findAll() {
        return films;

    }
    public String[] findLast() {
        int resultLength;
        if (films.length < number) {
            resultLength = films.length;
        } else {
            resultLength = number;
        }



        String[] tmp = new String[resultLength];
        for (int i = 0; i < films.length; i++) {
            tmp[i]= films[films.length -1 - i];

        }
        return tmp;

    }


}
