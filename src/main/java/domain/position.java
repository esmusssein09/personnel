package domain;

import java.io.Serializable;

public class position implements Serializable {
    private Integer id;
    private String name;
    private Integer belong;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBelong() {
        return belong;
    }

    public void setBelong(Integer belong) {
        this.belong = belong;
    }

    @Override
    public String toString() {
        return "position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", belong=" + belong +
                '}';
    }
}
