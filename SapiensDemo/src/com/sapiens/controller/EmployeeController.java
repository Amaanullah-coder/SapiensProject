package com.sapiens.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sapiens.dao.EmployeeDAO;
import com.sapiens.model.Address;
import com.sapiens.model.EmpForm;
import com.sapiens.model.Employee;
import com.sapiens.model.Project;

@Transactional
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO edao;

	@RequestMapping("/addempform")
	public ModelAndView addemplyeeform()
	{
		EmpForm e = new EmpForm();
		return new ModelAndView("addemp","emp",e);
	}
	
	@RequestMapping("/registeremp")
	public ModelAndView registerEmp(EmpForm empl)
	{
		Employee emp1 = new Employee();
		emp1.setFirstName(empl.getFirstName());
		emp1.setLastName(empl.getLastName());
		emp1.setAge(empl.getAge());
		
		edao.addEmp(emp1);
		
		
		Address add = new Address();
		add.setPresentAddress(empl.getPresentAddress());
		add.setEmpref1(emp1);
	
		edao.addAddress(add);
		
		Project poj=new Project();
		poj.setDuration(empl.getDuration());
		poj.setProjectname(empl.getProjectname());
		poj.setStatus(empl.getStatus());
		poj.setFid(emp1);
		
		edao.addProject(poj);
		
		return new ModelAndView("index","emp",empl);
	}
	
	@RequestMapping(value="/viewemp")
	public ModelAndView viewEmployee()
	{
		List emplist=edao.viewAllEmployee();
		return  new ModelAndView("viewemp","emplist",emplist);
		
	}
	
	@RequestMapping(value="/delete/{uid}")
	public ModelAndView deleteEmp(@PathVariable int uid)
	{
		System.out.println("Inside Herte");
		String exit=edao.deleteEmp(uid);
		List emplist=edao.viewAllEmployee();
		return  new ModelAndView("viewemp","emplist",emplist);
	}
	
	
	  @RequestMapping(value="/update/{uid}")
	  public ModelAndView updateEmp(@PathVariable int uid) {
	  Employee emp=edao.getEmpbyId(uid);
	  System.out.println(emp);
	  return new ModelAndView("updating","updata",emp);
	  
	  }
	  
	  @RequestMapping(value="/updateDone")
	  public ModelAndView updateDone(Employee emp)
	  {
		  edao.updateEmp(emp);
		  List emplist=edao.viewAllEmployee();
		  return new ModelAndView("viewemp","emplist",emplist);
	  }
	 
	
	
}
