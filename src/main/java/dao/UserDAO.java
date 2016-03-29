package dao;

import java.util.List;

import model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO implements UserDAOInterface {
	@Autowired
	private SessionFactory sessionFactory;


	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public List<User> listUser() {
		return sessionFactory.getCurrentSession().createQuery("from Contact").list();
	}

	@Override
	public void removeUser(Integer id) {
		User user = (User) sessionFactory.getCurrentSession().load(
				User.class, id);
		if (null != user) {
			sessionFactory.getCurrentSession().delete(user);
		}
	}

	@Override
	public User getUser(Integer id) {
		User user = (User) sessionFactory.getCurrentSession().load(
				User.class, id);
		return user;

	}



}
