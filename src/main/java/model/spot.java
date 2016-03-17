package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SPOTS")
public class spot {
	
	@Id
	@Column(name = "ID")
private String id;
	@Column(name = "latitude")
private double latitude;
	@Column(name = "longitude")
private double longitude;
	@Column(name = "Address")
private String addres;
	@Column(name = "imageurl")
private String imageUrl;
	@Column(name = "City")
private String city;
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
public String getAddres() {
	return addres;
}
public void setAddres(String addres) {
	this.addres = addres;
}
public String getImageUrl() {
	return imageUrl;
}
public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}


}
