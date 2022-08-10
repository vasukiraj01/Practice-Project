package com.hibernate;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Servlet implementation class StoreData
 */
@WebServlet("/StoreData")
public class StoreData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		         StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		            Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		          
		        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		        Session session = factory.openSession();  
		        Transaction t = session.beginTransaction();  
		          
		         Employee e1=new Employee();    
		            e1.setId(1);    
		            e1.setFirstName("Gaurav");    
		            e1.setLastName("Chawla");    
		         
		       session.save(e1);  
		       t.commit();  
		       System.out.println("successfully saved");    
		        factory.close();  
		        session.close();     
		    }  
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
