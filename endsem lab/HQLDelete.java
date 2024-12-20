package com.klu.JFSD12_HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLDelete {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

        Query q = s.createQuery("delete from Student where id = :studentId");
        q.setParameter("sid", 111);

       q.executeUpdate();
    }
}
