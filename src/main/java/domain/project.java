package domain;

import java.io.Serializable;

public class project implements Serializable {
    private Integer id;
    private String name;
    private Integer need_people;
    private Integer num;
    private String introduction;
    private String state;
    private Integer head;

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

    public Integer getNeed_people() {
        return need_people;
    }

    public void setNeed_people(Integer need_people) {
        this.need_people = need_people;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", need_people=" + need_people +
                ", num=" + num +
                ", introduction='" + introduction + '\'' +
                ", state='" + state + '\'' +
                ", head=" + head +
                '}';
    }
}
