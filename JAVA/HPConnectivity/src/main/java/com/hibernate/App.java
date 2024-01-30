package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
       SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
      Session session =factory.openSession();
   
       session.beginTransaction();
       
		/* get the values from tables
		 
		  int id=2; 
		  Student s= session.get(Student.class, id); 
		  System.out.println(s);
		  
		 */
		
       
       
       /* create and add the values in tables
        
          Student s=new Student();
          
           s.setId(1); 
		   s.setF_name("thamaraiselvan"); 
		   s.setL_name("S"); 
		   s.setAge(22);
		   session.save(s);
		   
		   s.setId(2); 
		   s.setF_name("parthasarathy"); 
		   s.setL_name("j"); 
		   s.setAge(21);
		   session.save(s);
		   
		   s.setId(3); 
		   s.setF_name("vigneshwar"); 
		   s.setL_name("V"); 
		   s.setAge(22);
		 
		   s.setId(4); 
		   s.setF_name("santhosh"); 
		   s.setL_name("kumar.S"); 
		   s.setAge(22);
		 
		  session.save(s);
		  
		  */
       
		/* Update the values 
		 
		   int id=4; Student s=session.get(Student.class, id);
		   s.setF_name("santhosh kumar"); s.setL_name("S");
		   
		 */
     
		/* delete the values
		  
		   Student s=session.get(Student.class, 5); 
		   session.delete(s);
		   
		 */
      
       session.getTransaction().commit();
       session.close();
       factory.close();
    }
}
