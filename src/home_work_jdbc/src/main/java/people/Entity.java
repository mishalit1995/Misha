package home_work_JDBC.people;

import java.util.Date;

public abstract class Entity {

    private int id;
    private String name;
    private Date birth;

    public Entity(int id, String name, Date birth) {
        this.id = id;
        this.name = name;
        this.birth = birth;
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

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birth +
                '}';
    }
}
