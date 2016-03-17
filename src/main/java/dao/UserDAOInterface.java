package dao;

import java.util.List;

import model.User;

public interface UserDAOInterface {
	public void addUser(User user);

	public List<User> listUser();

	public void removeUser(Integer id);
	
	public User getUser(Integer id);
}
