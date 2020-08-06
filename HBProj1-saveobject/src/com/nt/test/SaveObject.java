package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.entity.Product;

public class SaveObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction tx=null;
		boolean flag=false;
		Configuration cfg = new Configuration();  
				cfg.configure("com/nt/cfg/hibernat.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session sess=factory.openSession();
		Product prod=new Product();
		prod.setpid(446);
		prod.setpname("mouse");
		prod.setqty(2);
		prod.setprice(600.00f);
        try {
        	tx=sess.beginTransaction();
        sess.save(prod);
        flag=true;
       
        }
        catch(HibernateException he)
        {
        	he.printStackTrace();
        	System.out.println("internal problem");
        	flag=false;
        }
        finally
        {
        	if(flag==true)
        	{
        		tx.commit();
        		System.out.println("object is saved");
        	}
        	else
        	{
        		tx.rollback();
        		System.out.println("object is not saved");
        	}
        	sess.close();
        	factory.close();
        }

	}

}
