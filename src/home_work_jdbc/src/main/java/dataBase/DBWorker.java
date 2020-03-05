package home_work_JDBC.dataBase;


import home_work_JDBC.film.Film;
import home_work_JDBC.people.Actor;
import home_work_JDBC.people.Director;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static home_work_JDBC.dataBase.ConnectionHolder.statement;
import static home_work_JDBC.dataBase.ConnectionHolder.preparedStatement;


public class DBWorker {

    private static final String GET_ACTOR_BY_FILM = "SELECT * FROM film_library.cast_team RIGHT JOIN film_library.actors " +
            "ON cast_team.actor_id = actors.id WHERE film_id = ?;";

    private static final String GET_FILM_BY_YEAR = "SELECT * FROM film_library.films RIGHT JOIN " +
            "film_library.directors ON director_id = directors.id WHERE premiere >= (current_date - interval '1 year' );";
    private static final String GET_ACTORS_N_FILMS = "SELECT * FROM film_library.actors a JOIN " +
            " (SELECT actor_id, count(film_id) amount FROM film_library.cast_team GROUP BY actor_id) af " +
            " on (a.id = af.actor_id) WHERE af.amount >= ?;";

    private static final String GET_ACTOR_DIRECTOR = "SELECT * FROM film_library.actors " +
            "INTERSECT SELECT * FROM film_library.directors;";

    private static final String DELETE_OLD_FILM = "DELETE FROM film_library.films WHERE " +
            "date_part('year', age(current_date, premiere)) > ? ;";

    private static final String GET_FILM_BY_ACTOR = "SELECT * FROM film_library.cast_team RIGHT JOIN " +
            "film_library.films ON film_id = films.id RIGHT JOIN film_library.directors ON " +
            "films.director_id = directors.id WHERE actor_id = ? ;";


    public List<Actor> getActorByFilm(int id) {
        List<Actor> actors = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery(GET_ACTOR_BY_FILM + id)) {
            while (resultSet.next()) {
                actors.add(new Actor(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getDate("birthday")));
            }
            return actors;
        } catch (SQLException e) {
            e.printStackTrace();
            return actors;
        }
    }

    public List<Film> getFilmByYear() {
        List<Film> films = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery(GET_FILM_BY_YEAR)) {
            while (resultSet.next()) {
                films.add(new Film(resultSet.getInt("id"), resultSet.getString("title"),
                        new Director(resultSet.getInt("drector_id"), resultSet.getString("name"),
                                resultSet.getDate("birthday")), resultSet.getString("country"),
                                resultSet.getDate("datePremier")));
            }
            return films;
        } catch (SQLException e) {
            e.printStackTrace();
            return films;
        }
    }

    public int getFilmId(String film) {
        int id = 0;
        try {
            preparedStatement.setString(1, film);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                id = resultSet.getInt("id");
            }
            return id;
        } catch (SQLException e) {
            e.printStackTrace();
            return id;
        }
    }

    public List<Actor> getActorsByFilms(int number) {
        List<Actor> actors = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery(GET_ACTORS_N_FILMS + number)) {
            while (resultSet.next()) {
                actors.add(new Actor(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getDate("birthday")));
            }
            return actors;
        } catch (SQLException e) {
            e.printStackTrace();
            return actors;
        }
    }

    public List<Actor> getActorDirector() {
        List<Actor> actors = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery(GET_ACTOR_DIRECTOR)) {
            while (resultSet.next()) {
                actors.add(new Actor(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getDate("birthday")));
            }
            return actors;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteOldFilm(int year) {
        try {
            statement.executeUpdate(DELETE_OLD_FILM + year);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Film> getFilmWithActor(int actorId) {
        List<Film> films = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery(GET_FILM_BY_ACTOR + actorId)) {
            while (resultSet.next()) {
                films.add(new Film(resultSet.getInt("film_id"), resultSet.getString("title"),
                        new Director(resultSet.getInt("director_id"), resultSet.getString("name"),
                                resultSet.getDate("birthday")), resultSet.getString("country"),
                                resultSet.getDate("premier")));
            }
            return films;
        } catch (SQLException e) {
            e.printStackTrace();
            return films;
        }
    }
}
