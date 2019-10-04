package com.sapiens.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.sapiens.model.Address;
import com.sapiens.model.Employee;
import com.sapiens.model.Project;


@Component
public  class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private HibernateTemplate template;
	
	
	@Override
	public void addEmp(Employee emp)
	{
		
		template.save(emp);
	}


	@Override
	public void addAddress(Address add)
	{
		
		template.save(add);
		
	}
	
	
	public List viewAllEmployee()
	{
		
		String query="select c.id, c.firstName,c.lastName,c.age ,a.presentAddress, p.projectname,p.status,p.duration,p.pid from Employee c, Address a,Project p where c.id=a.empref1 and c.id=p.fid";
		List emplist=template.find(query);
		
		return emplist;
	}

	@Override
	public String deleteEmp(int id)
	{
		Session session=template.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		
		
		
		Query query2=session.createQuery("delete from Address where fkid=:ID");
		query2.setParameter("ID", id);
		int result1=query2.executeUpdate();
		
		Query query3=session.createQuery("delete from Project where fid_id=:ID");
		query3.setParameter("ID", id);
		int result3=query3.executeUpdate();
		
		Query query1=session.createQuery("delete from Employee where id=:ID");
		query1.setParameter("ID", id);
		int result2=query1.executeUpdate();
		tx.commit();
		
		return "viewemp";
		
	}
	
	

	@Override
	public String updateEmp(Employee emp) {
		
		Session session=template.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Query query1=session.createQuery("update Employee set firstname=:fname,lastname=:lname,age=:a where id=:ID");
		query1.setParameter("fname", emp.getFirstName());
		query1.setParameter("lname", emp.getLastName());
		query1.setParameter("a", emp.getAge());
		query1.setParameter("ID", emp.getId());
		int result=query1.executeUpdate();
		tx.commit();
		
		return "Done";
	}

	@Override
	public Employee getEmpbyId(int id) 
	{
		return template.get(Employee.class, id);
		
	}

	@Override
	public void addProject(Project poj) {
		
		template.save(poj);
		
	}
	
	}


