package model;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

public class Moment implements ObjectDAO{
    @Transient
    public String tableName = "Moment";
    @Id
    private String id;

    private User user;
    private Date date;
    private Attach attach;
    private Double rating;
    private List<Category> category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Attach getAttach() {
        return attach;
    }

    public void setAttach(Attach attach) {
        this.attach = attach;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

}
