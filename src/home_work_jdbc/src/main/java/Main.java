package home_work_JDBC;

import home_work_JDBC.FilmsLibrary.Library;

public class Main {
    public static void main(String[] args) {
        Library filmLibrary = new Library();
        filmLibrary.startLibrary();

        filmLibrary.getNewfilm();
        filmLibrary.getActorsFilmNumber(10);
        filmLibrary.getActorDirector();

        filmLibrary.closeConnection();

    }
}
