package com.klu.JFSD12_HQL;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory sf = cfg.buildSessionFactory();
	        Session s = sf.openSession();
	        Transaction t = s.beginTransaction();
	        
	        Query q = s.createSQLQuery("insert Student(sid,sname,sfee)values(222,'asdf',50000000)");
	         q.executeUpdate();
	         
	         System.out.println("Inserted");

	}

}
