package utils;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import model.Spot;
import org.hibernate.Query;
import org.hibernate.Session;
import org.jgroups.util.UUID;
import org.springframework.stereotype.Repository;

@Repository
public class SpotDAOImpl  {

	
	  public void addSpot(Spot s) throws SQLException {
		//  sessionFactory.getCurrentSession().save(s);
		    Session session = null;
		    try {
		      session = HibernateUtils.getSessionFactory().openSession();
		      session.beginTransaction();

		      session.save(s);
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

		  public void updateBus(Long bus_id, Spot s) throws SQLException {
		    Session session = null;
		    try {
		      session = HibernateUtils.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.update(s);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		  }

		  public Spot getBusById(Long id) throws SQLException {
		    Session session = null;
		    Spot bus = null;
		    try {
		      session = HibernateUtils.getSessionFactory().openSession();
		      bus = (Spot) session.load(Spot.class, id);
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		    return bus;
		  }

		  public List<Spot> getAllSpots() throws SQLException {
			  Session s = HibernateUtils.getSessionFactory().openSession();
			  Query q = s.createQuery("from Spot");
			  List<Spot> spotList = q.list();
			  s.close();
			return spotList; 
		   
		  }

		  public void deleteBus(Spot s) throws SQLException {
		    Session session = null;
		    try {
		      session = HibernateUtils.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.delete(s);
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
