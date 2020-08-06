package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.Project;
import com.nt.util.Hibernateutil;

public class DeleteObjectTest {

	public static void main(String[] args) {
     Transaction tx=null;
     Boolean flag=false;
		Session sess=Hibernateutil.getSession();
     
	Project p=new Project();
	p.setProjId(101L);
	try {
		tx=sess.beginTransaction();
		if(p!=null)
		{
			sess.delete(p);
			flag=true;
		}
		else
		{
			return ;
		}
		
		
	}
	catch(HibernateException he)
	{
		he.printStackTrace();
	    flag=false;	
	}
	finally
	{
		
		if(flag)
		{
			tx.commit(); 
			System.out.println("object deleted");
		}
		else
		{
			tx.rollback();
			System.out.println("object not deleted");
		}
	}
	Hibernateutil.getSessionClose(sess);
	Hibernateutil.getSessionFactoryClose();
			
	}

}
