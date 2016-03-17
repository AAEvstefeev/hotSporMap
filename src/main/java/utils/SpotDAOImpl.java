package utils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jgroups.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.spot;
import net.sf.ehcache.hibernate.HibernateUtil;
@Repository
public class SpotDAOImpl  {

	
	  public void addSpot(spot s) throws SQLException {
		//  sessionFactory.getCurrentSession().save(s);
		    Session session = null;
		    try {
		      session = HibernateUtils.getSessionFactory().openSession();
		      session.beginTransaction();
		      s = new spot();
		      s.setId(UUID.randomUUID().toString());
		      s.setAddres("adress");
		      s.setImageUrl("dsfsdfsdf");
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

		  public void updateBus(Long bus_id, spot s) throws SQLException {
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

		  public spot getBusById(Long id) throws SQLException {
		    Session session = null;
		    spot bus = null;
		    try {
		      session = HibernateUtils.getSessionFactory().openSession();
		      bus = (spot) session.load(spot.class, id);
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		    return bus;
		  }

		  public List<spot> getAllSpots() throws SQLException {
			  Session s = HibernateUtils.getSessionFactory().openSession();
			  Query q = s.createQuery("from spot"); 
			  List<spot> spotList = q.list();
			  s.close();
			return spotList; 
		   
		  }

		  public void deleteBus(spot s) throws SQLException {
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
