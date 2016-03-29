package model;

public class Vote implements ObjectDAO {
    public String tableName = "Vote";
    private String id;
    private User user;
    private TypeVote type;
    private Double value;

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

    public TypeVote getType() {
        return type;
    }

    public void setType(TypeVote type) {
        this.type = type;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
