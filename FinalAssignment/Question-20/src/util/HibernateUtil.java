package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Student;

public class HibernateUtil {
	static Session session;
	static SessionFactory factory;
	static {
		factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
	}
	
	public static Session getSession() {
		if (session == null) 
			session = factory.openSession();
		return session;
	}
	public static void closeSession() {
		if (session != null) {
			session.close();
		}
	}
	public static void closeSessionFactory() {
		if (factory != null) {
			factory.close();
		}
	}
}
