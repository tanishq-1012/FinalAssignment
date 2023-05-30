package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import model.Student;
import util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		if (session != null) {
			Query<Student> query = session.createQuery("FROM Student");
			List<Student> list = query.list();
			list.forEach(System.out::println);
			HibernateUtil.closeSession();
			HibernateUtil.closeSessionFactory();
		}
	}

}
