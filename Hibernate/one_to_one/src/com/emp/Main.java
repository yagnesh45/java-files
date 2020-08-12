package com.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String ar[]){
		Configuration cfg = new Configuration();
		
		cfg.configure("com/emp/hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
				
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Salary s=new Salary();
		s.setBasic(300000);
		s.setBonus(5000);
		
		Emp e=new Emp();
		e.setNo(101);
		e.setName("Yagnesh");
		e.setContact(1000);
		e.setSalary(s);
		
		s.setE(e);
		
		session.save(e);		
		tx.commit();
		session.close();
	}
}