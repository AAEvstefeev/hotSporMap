package model;

import ch.qos.logback.classic.db.names.TableName;

import javax.persistence.*;
import java.util.List;
@Entity
public class Attach implements ObjectDAO {
    @Transient
    public String tableName = "Attach";
    @Id
    private String id;
   // @ElementCollection
   // @CollectionTable(name = "imageUrl", joinColumns = @JoinColumn(name = "id"))
    @Transient
    private List<String> imageUrlList;
  //  @ElementCollection
  //  @CollectionTable(name = "videoUrl", joinColumns = @JoinColumn(name = "id"))
    @Transient
    private List<String> videoUrlList;
    @OneToMany(targetEntity = Image.class, mappedBy = "id")
    private List<Image> imageList;
    @OneToMany(targetEntity = Video.class, mappedBy = "id")
    private List<Video> videoList;
    @OneToOne
    @JoinColumn(name = "id")
    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getImageUrlList() {
        return imageUrlList;
    }

    public void setImageUrlList(List<String> imageUrlList) {
        this.imageUrlList = imageUrlList;
    }

    public List<String> getVideoUrlList() {
        return videoUrlList;
    }

    public void setVideoUrlList(List<String> videoUrlList) {
        this.videoUrlList = videoUrlList;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public List<Video> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<Video> videoList) {
        this.videoList = videoList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
