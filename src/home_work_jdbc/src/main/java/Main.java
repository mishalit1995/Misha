package home_work_JDBC;


import home_work_JDBC.FilmsLibrary.Library;

public class Main {
    public static void main(String[] args) {
        Library filmLibrary = new Library();

        filmLibrary.startLibrary();

        System.out.println("Get films by last and this year");
        filmLibrary.getNewfilm();

        System.out.println("Get films by name 'Silicon Valley'");
        filmLibrary.getActorByFilm("Silicon Valley");

        System.out.println("Get actors by film id '2'");
        filmLibrary.getActorsFilmNumber(2);

        System.out.println("Get who is the actor and director");
        filmLibrary.getActorDirector();

        System.out.println("Delete old films by year");
        filmLibrary.deleteOldFilms(10);

        filmLibrary.closeConnection();
    }
}
