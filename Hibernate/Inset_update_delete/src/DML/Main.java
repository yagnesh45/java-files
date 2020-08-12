package DML;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import DML.Student;

public class Main {
	public static void main(String[] args) {
		
	
	Configuration cfg = new Configuration();
	
	cfg.configure("DML/hibernate.cfg.xml");
	SessionFactory sessionFactory = cfg.buildSessionFactory();
	
	Student s = new Student();
	s.setId(101);
	s.setDept("I.T.");
	s.setName("ysp");
	
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	//session.save(s);
	
	session.update(s);
	tx.commit();
	session.close();
}
}