package dao;

import model.ObjectDAO;
import model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DatabaseHelperDAO  {
	@Autowired
	private SessionFactory sessionFactory;



	public void add(ObjectDAO user) {
		sessionFactory.getCurrentSession().save(user);
	}


	public List<ObjectDAO> list() {
		return sessionFactory.getCurrentSession().createQuery("from"+ObjectDAO.tableName).list();
	}

	public void remove(Integer id) {
		ObjectDAO objectDAO = (ObjectDAO) sessionFactory.getCurrentSession().load(
				User.class, id);
		if (null != objectDAO) {
			sessionFactory.getCurrentSession().delete(objectDAO);
		}
	}


	public ObjectDAO get(Integer id) {
		ObjectDAO objectDAO = (ObjectDAO) sessionFactory.getCurrentSession().load(
				User.class, id);
		return objectDAO;

	}



}
