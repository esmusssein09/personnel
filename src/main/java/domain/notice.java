package domain;

import java.io.Serializable;
import java.util.Date;

public class notice implements Serializable {
    private Integer id;
    private String scope;
    private Date creat_time;
    private String content;
    private Integer publisher;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "notice{" +
                "id=" + id +
                ", scope='" + scope + '\'' +
                ", creat_time=" + creat_time +
                ", content='" + content + '\'' +
                ", publisher=" + publisher +
                '}';
    }
}
