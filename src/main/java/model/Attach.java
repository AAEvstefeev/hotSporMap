package model;

import ch.qos.logback.classic.db.names.TableName;

import java.util.List;

public class Attach implements ObjectDAO {
    public String tableName = "Attach";
    private String id;
    private List<String> imageUrlList;
    private List<String> videoUrlList;
    private List<Image> imageList;
    private List<Video> videoList;
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
