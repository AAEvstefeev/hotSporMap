package service;

import java.util.List;

import model.User;

public interface UserServiceInterface {
	public void addUser(User user);

	public List<User> listUser();

	public void removeUser(Integer id);
}
