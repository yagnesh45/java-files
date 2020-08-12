package select_query;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args){
		Configuration cfg = new Configuration();
		
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query =  session.createQuery("from first");
		List<POJO_class> list = (List<POJO_class>) query.list();
		System.out.println("Size of list:"+list.size());
		
		for(POJO_class p: list){
			System.out.println("Id:"+p.getId()+"\nName:"+p.getName()+"\nDesignation:"+p.getDesignation());
		}
		tx.commit();
		session.close();		
	}
}
