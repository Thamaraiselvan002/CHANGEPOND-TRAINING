package com.hibernate.practise;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create_App {

	public static void main(String[] args) {
		SessionFactory sessionfactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Song.class).buildSessionFactory();
		Session session=sessionfactory.openSession();
		
		Song song1=new Song();
		song1.setId(2);
		song1.setSong_name("jilla");
		song1.setSinger("Imman");
		
		session.beginTransaction();
		session.save(song1);
		session.getTransaction().commit();
		
		session.close();
		sessionfactory.close();
	}

}
