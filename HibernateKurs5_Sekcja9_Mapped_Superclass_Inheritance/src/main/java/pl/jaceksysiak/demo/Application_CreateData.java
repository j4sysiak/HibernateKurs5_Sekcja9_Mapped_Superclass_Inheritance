package pl.jaceksysiak.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pl.jaceksysiak.demo.entity.Bond;
import pl.jaceksysiak.demo.entity.Investment;
import pl.jaceksysiak.demo.entity.Stock;

public class Application_CreateData {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Stock.class)
								.addAnnotatedClass(Investment.class)
								.addAnnotatedClass(Bond.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {	
			// start a transaction
			session.beginTransaction();
			
			//Creating the Object 
			
			//Saving the Object to DB		
			
			
			// commit transaction
			session.getTransaction().commit();
			

		    
		}
		finally {
			
			// add clean up code
			session.close();			
			factory.close();
		}
	}
	

	}