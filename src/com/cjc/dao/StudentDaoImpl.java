package com.cjc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveStudent(Student student) {
		
		System.out.println(" DaoImpl ****************");
		Session session = sessionFactory.openSession();
		
		session.saveOrUpdate(student);
		session.beginTransaction().commit();
		System.out.println("Data Updated");
		
		
	}

	@Override
	public List<Student> selectAllStudent(String uname, String pass) {
		
		
		
		Session session = sessionFactory.openSession();
		Query createQuery = session.createQuery("From Student");
		List list = createQuery.getResultList();
		return list;
	}

	@Override
	public List<Student> deleteStudent(int srollno) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("enter studentdelete");
		Query query = session.createQuery("delete Student where rolllno="+srollno);
		 //query.setParameter("rolllno", srollno);
		query.executeUpdate();
		tx.commit();
		System.out.println("Data Delete");
		
		Query query2 = session.createQuery("From Student");
		Transaction tr1 = session.beginTransaction();
				List list = query2.getResultList();
				tr1.commit();
		return list;
	}

	@Override
	public Student editStudent(int rollno) {
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Student where rolllno="+rollno);
		Student st =(Student) query.getSingleResult();
		System.out.println(st);
		tx.commit();
		
		
		return st;
	}

}
