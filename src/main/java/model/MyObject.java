package model;

public class MyObject {
private String name;
private int count;
private boolean isWork;
private float longitute;
private double latitude;

public MyObject(String name, int count, boolean isWork, float longitute, double latitude) {
	super();
	this.name = name;
	this.count = count;
	this.isWork = isWork;
	this.longitute = longitute;
	this.latitude = latitude;
}

public MyObject(String name, int count, boolean isWork) {
	super();
	this.name = name;
	this.count = count;
	this.isWork = isWork;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public boolean isWork() {
	return isWork;
}
public void setWork(boolean isWork) {
	this.isWork = isWork;
}
public float getLongitute() {
	return longitute;
}
public void setLongitute(float longitute) {
	this.longitute = longitute;
}
public double getLatitude() {
	return latitude;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}

}
