package com;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class DbConnect {
	
	StandardServiceRegistry sr = new StandardServiceRegistryBuilder().
			configure("com/hibernate.cfg.xml").build();
	Metadata md = new MetadataSources(sr).getMetadataBuilder().build();
	SessionFactory sf = md.getSessionFactoryBuilder().build();
	Session s1 = sf.openSession();
	private List cn = null;
	
		public List dbconStudent(int x) {
		String hq="Select _q from Student _q where class_id="+x;
		System.out.println("session opened");
		List <Student>stud = s1.createQuery(hq,Student.class).getResultList();
		System.out.println(stud);
		return stud;
	}
	
		public List dbconSubject(int x) {
			String hq="Select _q from Subject _q where class_id="+x;
			System.out.println("session opened");
			List <Subject>stud = s1.createQuery(hq,Subject.class).getResultList();
			System.out.println(stud);
			return stud;	
		}

}
