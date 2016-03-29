package dao;

import model.ObjectDAO;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import utils.HibernateUtils;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ObjectDAOImpl {

	
	  public void add(ObjectDAO objectDAO) throws SQLException {
		//  sessionFactory.getCurrentSession().save(s);
		    Session session = null;
		    try {
		      session = HibernateUtils.getSessionFactory().openSession();
		      session.beginTransaction();

		      session.save(objectDAO);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		    	e.printStackTrace();
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {

		        session.close();
		      }
		    }
		  }

		  public void update(ObjectDAO objectDAO) throws SQLException {
		    Session session = null;
		    try {
		      session = HibernateUtils.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.update(objectDAO);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		  }

		  public ObjectDAO get(String id) throws SQLException {
		    Session session = null;
		    ObjectDAO objectDAO = null;
		    try {
		      session = HibernateUtils.getSessionFactory().openSession();
		      objectDAO = (ObjectDAO) session.load(objectDAO.getClass(), id);
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		    return objectDAO;
		  }

		  public List<ObjectDAO> list() throws SQLException {
			  Session s = HibernateUtils.getSessionFactory().openSession();
			  Query q = s.createQuery("from"+ObjectDAO.tableName);
			  List<ObjectDAO> ObjectDAOList = q.list();
			  s.close();
			return ObjectDAOList;
		   
		  }

		  public void delete(ObjectDAO objectDAO) throws SQLException {
		    Session session = null;
		    try {
		      session = HibernateUtils.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.delete(objectDAO);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при удалении", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		  }

		
}
