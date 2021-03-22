package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Payment;

@Component
public class PaymentDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int send(Payment payment) {

		return (Integer) hibernateTemplate.save(payment);
	}
	
	public List<Payment> getPayment(){  
	     
	  List<Payment>  payment=this.hibernateTemplate.loadAll(Payment.class);  
	    return payment;  
	}  
	
	public Payment findAll(String keyword){
		SessionFactory sessionFactory = hibernateTemplate.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		Query createQuery = openSession.createQuery("from Payment where name=:n");
		  createQuery.setString("n", keyword);
		  Payment pay = (Payment) createQuery.uniqueResult();
		
	    return pay; 
		
		
	}
}
