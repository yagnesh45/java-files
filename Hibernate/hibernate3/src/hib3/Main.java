package hib3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hib3.Student;

public class Main {
	public static void main(String ar[]){
		Configuration cfg = new Configuration();
		
		cfg.configure("hib3/hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Student s = new Student();
		s.setId(101);
		s.setName("Yagnesh");
		
		Address permenant=new Address();
		permenant.setBlock_no(20);
		permenant.setCity("Surat");
		permenant.setStreet("VIP Road");
		s.setP_address(permenant);
		

		Address temp=new Address();
		temp.setBlock_no(212);
		temp.setCity("Gandhinagar");
		temp.setStreet("Mahatma mandir");
		s.setT_address(temp);
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		//session.save(s);
		
		session.update(s);
		tx.commit();
		session.close();
	}
}
