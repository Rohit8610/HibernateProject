package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.BankAccount;
import com.nt.util.Hibernateutil;

public class UpdateObjectTest {
	public static void main(String arg[])
	{
Session sess=Hibernateutil.getSession();
BankAccount b=null;
Boolean flag=true;
Transaction tx=null;
b=new BankAccount();
b.setAccno(101L);
b.setAccHolderName("raj");
b.setAmount(40000.00f);
try {
	tx=sess.beginTransaction();
	sess.update(b);
	flag=true;
}
catch(HibernateException he)
{flag=false;
	System.out.println("object not found");
	he.printStackTrace();
}
finally
{
	if(flag==true)
	{
		tx.commit();
		System.out.println("object updated");
	}
	else
	{
		tx.rollback();
		System.out.println("object not updated");
	}
	Hibernateutil.getSessionClose(sess);
    Hibernateutil.getSessionFactoryClose();
}

	}
}
