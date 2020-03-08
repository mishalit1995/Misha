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
        for (Film film : films) {
            System.out.println(film.toString());
        }
    }

    public void getActorByFilm(String name) {
        int id = dbWorker.getFilmId(name);
        List<Actor> actors = dbWorker.getActorByFilm(id);
        for (Actor actor : actors) {
            System.out.println(actor.toString());
        }
    }

    public void getActorsFilmNumber(int number) {
        List<Actor> actors = dbWorker.getActorsByFilms(number);
        for (Actor actor : actors) {
            System.out.println(actor.toString());
        }

    }

    public void getActorDirector() {
        List<Actor> actors = dbWorker.getActorDirector();
        for (Actor actor : actors) {
            System.out.println(actor.toString());
        }
    }

    public void deleteOldFilms(int year) {
        dbWorker.deleteOldFilm(year);
    }


    public void closeConnection() {
        connectionHolder.closeConnection();
    }
}
