package one_to_many;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String ar[]){
		Configuration cfg = new Configuration();
		
		cfg.configure();
		//cfg.configure(new String("a"));
	//	cfg.configure(new String("hibernate.cfg.xml"));
		//cfg.configure("one_to_many/hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
				
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student s1,s2,s3;
		s1= new Student();
		s2= new Student();
		s3= new Student();
		
		s1.setMobNo(123456); s2.setMobNo(765432); s3.setMobNo(340543);
		s1.setName("Yagnesh"); s2.setName("Aditya"); s3.setName("Keyur");
		s1.setSid(101); s2.setSid(102); s3.setSid(103);
		
		Set<Student> first = new HashSet<Student>();
		first.add(s1);
		first.add(s2);
		
		Set<Student> sec = new HashSet<Student>();
		sec.add(s3);
				
		College c1 = new College();
		College c2 = new College();
		c1.setCid(1);
		c1.setDept("I.T.");
		c1.setStds(first);
		c1.setName("Gandhy Collge");
		
		c2.setCid(2);
		c2.setDept("I.T.");
		c2.setStds(sec);
		c2.setName("Girls Poly.");
		

		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(c1);
		session.save(c2);
		tx.commit();
		session.close();
	}
}