package home_work_JDBC;

import home_work_JDBC.FilmsLibrary.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.connection();

        System.out.println(library.getNewFilms());
        System.out.println(library.getActorByFilmName("Catch Me If You Can"));
        System.out.println(library.getActorByFilmNumber(2));
        System.out.println(library.getActorsDirectors());
        library.deleteOldFilms(10);

        library.close();

    }
}
