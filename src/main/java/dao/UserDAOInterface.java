package dao;

import model.User;

import java.util.List;

public interface UserDAOInterface {
	public void addUser(User user);

	public List<User> listUser();

	public void removeUser(Integer id);
	
	public User getUser(Integer id);
}
