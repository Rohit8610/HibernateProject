package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.InsurancePolicy;
import com.nt.util.Hibernateutil;

public class LoadObjectTest {
	public static void main(String arg[])
	{
	InsurancePolicy policy=null;
	Session ses=Hibernateutil.getSession();
	try {
		policy=ses.get(InsurancePolicy.class,1L);
	if(policy==null)
	{
		System.out.println("record not found");
	}
	else
	{
		System.out.println("record found and display");
		System.out.println(policy);
	}
	}catch(HibernateException he)
	{
		he.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		Hibernateutil.getSessionClose(ses);
		Hibernateutil.getSessionFactoryClose();
	}

}
}