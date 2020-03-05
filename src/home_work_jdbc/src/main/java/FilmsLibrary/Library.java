package home_work_JDBC.FilmsLibrary;


import home_work_JDBC.dataBase.ConnectionHolder;
import home_work_JDBC.dataBase.DBWorker;
import home_work_JDBC.film.Film;
import home_work_JDBC.people.Actor;

import java.util.List;

public class Library {

    private ConnectionHolder connectionHolder;
    private DBWorker dbWorker;

    public void startLibrary() {
        connectionHolder = new ConnectionHolder();
        connectionHolder.createConnection();
        dbWorker = new DBWorker();
    }

    public void getNewfilm() {
        List<Film> films = dbWorker.getFilmByYear();
    }

    public void getActorByFilm(String name) {
        int id = dbWorker.getFilmId(name);
        List<Actor> actors = dbWorker.getActorByFilm(id);
    }

    public void getActorsFilmNumber(int number) {
        List<Actor> actors = (List<Actor>) addCast(dbWorker.getActorsByFilms(number));
    }

    public void getActorDirector() {
        List<Actor> actors = (List<Actor>) addCast(dbWorker.getActorDirector());
    }

    public void deleteOldFilms(int year) {
        dbWorker.deleteOldFilm(year);
    }

    private List<?> addCast(List<?> list) {
        for (Object o : list) {
            if (o instanceof Film) {
                Film film = (Film) o;
                film.setActors(dbWorker.getActorByFilm(film.getId()));
            }
            if (o instanceof Actor) {
                Actor actor = (Actor) o;
                actor.setFilms(dbWorker.getFilmWithActor(actor.getId()));
            }
        }
        return list;
    }

    public void closeConnection() {
        connectionHolder.closeConnection();
    }
}
