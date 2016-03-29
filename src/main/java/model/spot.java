package model;


import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Spot")
public class Spot implements ObjectDAO{
    @Transient
    public String tableName = "Spot";
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "latitude")
    private double latitude;
    @Column(name = "longitude")
    private double longitude;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;

    private User creator;
    @Column(name = "rating")
    private double rating;
    @Column(name = "safety")
    private double safety;
    @Column(name = "complexity")
    private double complexity;
    @OneToMany(targetEntity=Comment.class, mappedBy="spot", fetch=FetchType.EAGER)
    private List<Comment> comments;
    @OneToMany(targetEntity=Category.class, mappedBy="spot", fetch=FetchType.EAGER)
    private List<Category> category;
    @Column(name = "description")
    private String description;
    @Transient
    private Image mainImage;
    @Column(name = "winter")
    private boolean winter;
    @Column(name = "summer")
    private boolean summer;

    public void setWinter(boolean winter) {
        this.winter = winter;
    }

    public void setSummer(boolean summer) {
        this.summer = summer;
    }

    public boolean isWinter() {
        return winter;
    }

    public boolean isSummer() {
        return summer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(mappedBy = "spot")
    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getSafety() {
        return safety;
    }

    public void setSafety(double safety) {
        this.safety = safety;
    }

    public double getComplexity() {
        return complexity;
    }

    public void setComplexity(double complexity) {
        this.complexity = complexity;
    }
    @OneToMany(mappedBy="spot")
    @OrderBy("title")
    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getMainImage() {
        return mainImage;
    }

    public void setMainImage(Image mainImage){
        this.mainImage = mainImage;
    }

    public String getTableName() {
        return tableName;
    }

    public String getAddress() {
        return address;
    }
    @OneToMany(mappedBy="spot")
    @OrderBy("name")
    public List<Category> getCategory() {
        return category;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }
}
