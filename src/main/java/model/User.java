package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "USER")
public class User {
	
@Id
@Column(name = "ID")
private String id;
@Column(name = "NAME")
private String name;
@Column(name = "MAIL")
private String mail;
@Column(name = "PASSWORD")
private String password;
@Column(name = "REGISTRATIONDATE")
private Date registrationDate;

public Date getRegistrationDate() {
	return registrationDate;
}
public void setRegistrationDate(Date registrationDate) {
	this.registrationDate = registrationDate;
}
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
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}




}
