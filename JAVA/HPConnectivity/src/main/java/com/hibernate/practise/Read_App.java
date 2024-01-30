package com.hibernate.practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Read_App {

	public static void main(String[] args) {
		SessionFactory sessionfactory=new Configuration().configure().addAnnotatedClass(Song.class).buildSessionFactory();
		Session session= sessionfactory.openSession();
		
       
		 Song s= session.get(Song.class, 1); 
		  System.out.println(s);
	}

}
