package home_work_JDBC.FilmsLibrary;


import home_work_JDBC.dataBase.ConnectionHolder;
import home_work_JDBC.dataBase.DBWorker;
import home_work_JDBC.film.Film;
import home_work_JDBC.people.Actor;

import java.util.List;

public class Library {

    private DBWorker requests;
    private ConnectionHolder connectionHolder;

    public void connection() {
        connectionHolder = new ConnectionHolder();
        connectionHolder.connection();
        requests = new DBWorker();
    }


    public List<Film> getNewFilms() {
        List<Film> films = requests.getFilmsByYear();
        if (!films.isEmpty()) {
            films = setCast(films);
            return films;
        } else {
            return null;
        }
    }

    public List<Actor> getActorByFilmName(String name) {
        int filmID = requests.getFilmId(name);
        List<Actor> actors = requests.getActorsByFilm(filmID);
        if (!actors.isEmpty()) {
            actors = setFilms(actors);
            return actors;
        } else
            return null;
    }


    public List<Actor> getActorByFilmNumber(int count) {
        List<Actor> actors = requests.getActorsByNFilms(count);
        if (!actors.isEmpty()) {
            actors = setFilms(actors);
            return actors;
        } else
            return null;
    }

    public List<Actor> getActorsDirectors() {
        List<Actor> actors = requests.getActorsDirectors();
        if (!actors.isEmpty()) {
            actors = setFilms(actors);
            return actors;
        } else {
            return null;
        }
    }

    public void deleteOldFilms(int years) {
        requests.deleteOldFilms(years);
    }

    private List<Actor> setFilms(List<Actor> actors) {
        for (Actor actor : actors) {
            actor.setFilms(requests.getFilmsByActor(actor.getId()));
        }
        return actors;
    }

    public List<Film> setCast(List<Film> films) {
        for (Film film : films) {
            film.setActors(requests.getActorsByFilm(film.getId()));
        }
        return films;
    }

    public void close() {
        connectionHolder.closeConection();

    }
}