package com.nt.util;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
	/*
	 * private static SessionFactory factory; private static ThreadLocal<Session>
	 * tl=new ThreadLocal(); static { Configuration cfg=new Configuration(); try {
	 * cfg.configure("com/nt/cfg/hibernate.cfg.xml");
	 * factory=cfg.buildSessionFactory(); }catch(HibernateException he) {
	 * System.out.println("Hibernateutil.enclosing_method()"); he.printStackTrace();
	 * } catch(Exception e) {System.out.println("Hibernateutil.enclosing_method()");
	 * e.printStackTrace(); }
	 * 
	 * 
	 * } public static Session getSession() {
	 * System.out.println("Hibernateutil.getSession()"); Session ses=tl.get();
	 * if(ses==null) { if(factory!=null) { ses=factory.openSession(); tl.set(ses); }
	 * } return ses; } public static void getSessionClose(Session sess) {
	 * if(sess!=null) sess.close(); } public static void getSessionFactoryClose() {
	 * if(factory!=null) { factory.close(); } }
	 */


	private static SessionFactory factory;
	private static  ThreadLocal<Session> threadLocal=new ThreadLocal();
	
	static {
		Configuration cfg=null;
		try {
			//boot strap hibernate
			 cfg=new Configuration();
			 cfg.configure("com/nt/cfg/hibernate.cfg.xml");
			 //build SessionFactory
			 factory=cfg.buildSessionFactory();
		}//try
		catch(HibernateException he) {
			he.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//static
	
	public static  Session getSession() {
		Session ses=null;
		//get Session object from ThreadLocal 
		ses=threadLocal.get();
	 if(ses==null) {	
		if(factory!=null) {
			ses=factory.openSession();
			threadLocal.set(ses);
		}//if
	 }//if
		return ses;
	}
	
	public static  void  closeSession() {
		Session ses=null;
		ses=threadLocal.get();
		 if(ses!=null) {
			 ses.close();
			 threadLocal.remove();
		 }
}
}