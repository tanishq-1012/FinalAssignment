package test;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Student;
import util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSession();
		Transaction transaction = null;
		Integer id=null;
		Boolean flag=false;
		try {
			if (session != null) {
				transaction = session.beginTransaction();
				// Reading Data
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter Student Id to update");
				id = scanner.nextInt();
				Student student = session.get(Student.class, id);
				if (student != null) {
					System.out.println("Original Record::");
					System.out.println(student);
					System.out.println("Enter Student New Name");
					String name = scanner.next();
					System.out.println("Enter Student New Age");
					int age = scanner.nextInt();
					System.out.println("Enter Student New Address");
					String address = scanner.next();
					// Updating Data
					student.setName(name);
					student.setAge(age);
					student.setAddress(address);
					if (transaction != null)
						session.saveOrUpdate(student);
					flag=true;
				}
				scanner.close();
				
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				//Retrieving the updated data and printing it
				System.out.println(session.get(Student.class, id));
			} else
				transaction.rollback();

			HibernateUtil.closeSession();
			HibernateUtil.closeSessionFactory();

		}
	}
}
