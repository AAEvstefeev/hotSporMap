package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "Category")
public class Category implements ObjectDAO{
    @Transient
    public String tableName = "Category";
    @Id
    private String id;
    private String name;
    private boolean winter;
    private boolean summer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWinter() {
        return winter;
    }

    public void setWinter(boolean winter) {
        this.winter = winter;
    }

    public boolean isSummer() {
        return summer;
    }

    public void setSummer(boolean summer) {
        this.summer = summer;
    }


}
