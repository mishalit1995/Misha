package home_work_JDBC.people;


import home_work_JDBC.film.Film;

import java.util.Date;
import java.util.List;

public class Director extends Entity {

    private List<Film> films;

    public Director(int id, String name, Date birthday) {
        super(id, name, birthday);
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

