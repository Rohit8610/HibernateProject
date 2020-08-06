package com.nt.test;

import java.util.Arrays;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.entity.IinsurancePolicy;
import com.nt.entity.InsurancePolicy;
import com.nt.util.Hibernateutil;

public class LoadObjectTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IinsurancePolicy policy=null;
		Session sess=null;
		sess=Hibernateutil.getSession();
		try {
			System.out.println("LoadObjectTest1.main()");
         System.out.println(sess.getClass()+" ");		
			policy=sess.load(InsurancePolicy.class, 1L);
			System.out.println(policy.getClass()+" "+Arrays.deepToString(policy.getClass().getInterfaces()));
			System.out.println("LoadObjectTest1.main()");
			System.out.println(policy.getClass().getSuperclass());
			//System.out.println(policy.getPolicyId());
			//System.out.println(policy);
		     System.out.println(policy.getPolicyName());
		     System.out.println("LoadObjectTest1.main()");
		     System.out.println(policy.getCompany());
		    // System.out.println(policy.getClass().);
		}
		catch(HibernateException he)
		{
			he.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
		Hibernateutil.getSessionClose(sess);
		Hibernateutil.getSessionFactoryClose();
				
		}
		
	}

}
