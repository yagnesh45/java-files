package com.tution;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		
		cfg.configure("com/tution/hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		POJO_class p = new POJO_class();
		p.setId(01);
		p.setDesignation("Project Manager");
		p.setName("Yagnesh");
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();		
	}
}
