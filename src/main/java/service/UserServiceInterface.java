package service;

import model.User;

import java.util.List;

public interface UserServiceInterface {
	public void addUser(User user);

	public List<User> listUser();

	public void removeUser(Integer id);
}
