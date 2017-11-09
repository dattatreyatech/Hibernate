package com.am.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.am.entities.Advisor;

public class Test {

	public static void main(String[] args) {
		Advisor advisor=new Advisor();
		advisor.setContactNo("8179279992");
		advisor.setEmailAddress("ashok@gmail.com");
		advisor.setExperience(3);
		advisor.setFirstNm("Ashok");
		advisor.setLastNm("G");
		advisor.setQualification("B.tech");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(advisor);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}
