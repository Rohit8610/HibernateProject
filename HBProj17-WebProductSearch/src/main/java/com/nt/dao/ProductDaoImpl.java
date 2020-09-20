package com.nt.dao;

import org.hibernate.Session;

import com.nt.entity.Product;
import com.nt.util.Hibernateutil;

public class ProductDaoImpl implements ProductDao {

	@Override
	public Product getByPid(int pid) {
		/*
		 * System.out.println("ProductDaoImpl.getByPid()"); Session
		 * ses=Hibernateutil.getSession();
		 * System.out.println("ProductDaoImpl.getByPid()"); Product
		 * prod=ses.get(Product.class, pid);
		 * System.out.println("ProductDaoImpl.getByPid()"); return prod;
		 */	
		Session ses=null,ses1=null;
		Product prod=null;
	        //get SEssion object
		ses=Hibernateutil.getSession();
		ses1=Hibernateutil.getSession();
		System.out.println("ProductDaoImpl.getByPid()");
		System.out.println(ses.hashCode()+"   "+ses1.hashCode());
		//get/load object
		prod=ses.get(Product.class, pid);
		return prod;
	
	}

}
