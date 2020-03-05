package home_work_JDBC.film;

import home_work_JDBC.people.Actor;
import home_work_JDBC.people.Director;

import java.util.Date;
import java.util.List;

public class Film {
    private int id;
    private String name;
    private Director director;
    private String country;
    private Date datePremier;

    private List<Actor> actors;

    public Film(int id, String name, Director director, String country, Date datePremier) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.country = country;
        this.datePremier = datePremier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDatePremier() {
        return datePremier;
    }

    public void setDatePremier(Date datePremier) {
        this.datePremier = datePremier;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director=" + director +
                ", country='" + country + '\'' +
                ", datePremier=" + datePremier +
                '}';
    }
}
