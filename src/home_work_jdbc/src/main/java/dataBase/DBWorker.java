package home_work_JDBC.dataBase;

import home_work_JDBC.film.Film;
import home_work_JDBC.people.Actor;
import home_work_JDBC.people.Director;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


import static home_work_JDBC.dataBase.ConnectionHolder.*;


public class DBWorker {

    private static final String GET_ACTOR_BY_FILM = "SELECT * FROM film_library.cast_team RIGHT JOIN film_library.actors " +
            "ON cast_team.actor_id = actors.id WHERE film_id = ?;";
    private static final String GET_FILM_BY_YEAR = "SELECT * FROM film_library.films RIGHT JOIN " +
            "film_library.directors ON director_id = directors.id WHERE premiere >= (current_date - '1 year');";
    private static final String GET_ACTORS_N_FILMS = "SELECT * FROM film_library.actors a JOIN " +
            " (SELECT actor_id, count(film_id) amount FROM film_library.cast_team GROUP BY actor_id) af " +
            " on (a.id = af.actor_id) WHERE af.amount >= ?;";
    private static final String GET_ACTOR_DIRECTOR = "SELECT * FROM film_library.actors where name  " +
            "IN(SELECT name FROM film_library.directors);";
    private static final String DELETE_OLD_FILM = "DELETE FROM film_library.films WHERE " +
            "date_part('year', age(current_date, premiere)) > ? ;";
    private static final String GET_FILM_BY_ACTOR = "SELECT * FROM film_library.cast_team RIGHT JOIN " +
            "film_library.films ON film_id = films.id RIGHT JOIN film_library.directors ON " +
            "films.director_id = directors.id WHERE actor_id = ? ;";
    private static final String GET_FILM_ID = "SELECT * FROM film_library.films WHERE title = ?";


    public List<Film> getFilmsByYear() {
        List<Film> films = new ArrayList<>();
        try (ResultSet rs = statement.executeQuery(GET_FILM_BY_YEAR)) {
            while (rs.next()) {
                films.add(new Film(rs.getInt("id"), rs.getString("title"),
                        new Director(rs.getInt("director_id"), rs.getString("name"),
                                rs.getDate("birth")), rs.getString("country"),
                        rs.getDate("premiere")));
            }
            return films;
        } catch (SQLException e) {
            e.printStackTrace();
            return films;
        }
    }

    public List<Actor> getActorsByFilm(int id) {
        List<Actor> actors = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_ACTOR_BY_FILM)) {
            preparedStatement.setInt(1, id);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    actors.add(new Actor(rs.getInt("id"), rs.getString("name"),
                            rs.getDate("birth")));
                }
                return actors;
            } catch (SQLException e) {
                e.printStackTrace();
                return actors;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actors;
    }

    public List<Film> getFilmsByActor(int id) {
        List<Film> films = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_FILM_BY_ACTOR)) {
            preparedStatement.setInt(1, id);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    films.add(new Film(rs.getInt("film_id"), rs.getString("title"),
                            new Director(rs.getInt("director_id"), rs.getString("name"),
                                    rs.getDate("birth")), rs.getString("country"),
                            rs.getDate("premiere")));
                }
                return films;
            } catch (SQLException e) {
                e.printStackTrace();
                return films;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return films;
    }

    public List<Actor> getActorsByNFilms(int amount) {
        List<Actor> actors = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_ACTORS_N_FILMS)) {
            preparedStatement.setInt(1, amount);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    actors.add(new Actor(rs.getInt("id"), rs.getString("name"),
                            rs.getDate("birth")));
                }
                return actors;
            } catch (SQLException e) {
                e.printStackTrace();
                return actors;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actors;
    }


    public void deleteOldFilms(int years) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_OLD_FILM)) {
            preparedStatement.setInt(1, years);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public int getFilmId(String name) {
        int id = 0;
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_FILM_ID)) {
            preparedStatement.setString(1, name);
            try (ResultSet rs = preparedStatement.executeQuery()) {
                while (rs.next()) {
                    id = rs.getInt("id");
                }
                return id;
            } catch (SQLException e) {
                e.printStackTrace();
                return id;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }


    public List<Actor> getActorsDirectors() {
        List<Actor> actors = new ArrayList<>();
        try (ResultSet rs = statement.executeQuery(GET_ACTOR_DIRECTOR)) {
            while (rs.next()) {
                actors.add(new Actor(rs.getInt("id"), rs.getString("name"),
                        rs.getDate("birth")));
            }
            return actors;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}

