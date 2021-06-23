package com.petercai.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.petercai.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<Employee> findAll() {
		
		//Get Hibernate session
		Session session = entityManager.unwrap(Session.class);
		//Native  Hibernate API
		Query<Employee> theQuery = session.createQuery("from Employee", Employee.class);
		List<Employee> employees = theQuery.getResultList(); 
		return employees;
	}


	@Override
	public Employee findById(int theId) {
		Session session = entityManager.unwrap(Session.class);
		Employee theEmployee = session.get(Employee.class, theId);
		return theEmployee;
	}


	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(theEmployee);
	}


	@Override
	public void delete(int theId) {
		Session session = entityManager.unwrap(Session.class);
		//prepared statements
		Query<Employee> theQuery = session.createQuery("delete from Employee where id=:employeeId");
		theQuery.setParameter("employeeId", theId);
		theQuery.executeUpdate();
	}
	
	
	
}
