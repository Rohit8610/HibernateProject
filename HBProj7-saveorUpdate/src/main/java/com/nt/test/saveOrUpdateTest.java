package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.MemberShip;
import com.nt.util.Hibernateutil;

public class saveOrUpdateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session sess=Hibernateutil.getSession();
Transaction tx=null;
Boolean flag=false;
MemberShip m=new MemberShip();
m.setMid(104L);
m.setName("amar");
m.setReward(22L);
try {
	tx=sess.beginTransaction();
	sess.saveOrUpdate(m);
flag=true;	
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
	System.out.println("operation commited");
}
else
{
	tx.rollback();
	System.out.println("operation is rollbacked");
}
}
Hibernateutil.getSessionClose(sess);
Hibernateutil.getSessionFactoryClose();
}

}
