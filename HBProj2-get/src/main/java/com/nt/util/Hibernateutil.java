package com.nt.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
private static SessionFactory factory;
static
{
	Configuration cfg=new Configuration();
	try {
	cfg.configure("com/nt/cfg/hibernate.cfg.xml");
	factory=cfg.buildSessionFactory();
}catch(HibernateException he)
	{
	he.printStackTrace();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
}
public static Session getSession()
{	if(factory!=null)
	{
		return factory.openSession();
	}
return null;
}
public static void getSessionClose(Session sess)
{
	if(sess!=null)
		sess.close();
}
public static void getSessionFactoryClose()
{
	if(factory!=null)
	{
		factory.close();
	}
}
}
