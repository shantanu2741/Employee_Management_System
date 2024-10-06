package com.cm.controller;

 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cm.entities.Employee;
import com.cm.service.EmpService;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController 
{

	@Autowired
	private EmpService empService;

	@GetMapping("/")
	public String index(Model m) 
	{
		List<Employee> list = empService.getAllEmp();
		m.addAttribute("empList", list);
		return "index";
	}

	@GetMapping("/loadEmpSave")
	public String loadEmpSave() 
	{
		return "emp_save";
	}

	@GetMapping("/EditEmp/{id}")
	public String EditEmp(@PathVariable int id, Model m) 
	{
		Employee emp = empService.getEmpById(id);
		m.addAttribute("emp", emp);
		return "edit_emp";
	}

	@PostMapping("/saveEmp")
	public String saveEmp(@ModelAttribute Employee emp, HttpSession session) 
	{

		Employee newEmp = empService.saveEmp(emp);

		if (newEmp != null) 
		{
			session.setAttribute("msg", "Register sucessfully");
		}
		else 
		{
			session.setAttribute("msg", "something wrong on server");
		}

		return "redirect:/loadEmpSave";
	}

	@PostMapping("/updateEmpDtls")
	public String updateEmp(@ModelAttribute Employee emp, HttpSession session) 
	{

		Employee updateEmp = empService.saveEmp(emp);

		if (updateEmp != null) 
		{
			session.setAttribute("msg", "Update sucessfully");
		} 
		else 
		{
			session.setAttribute("msg", "something wrong on server");
		}

		return "redirect:/";
	}

	@GetMapping("/deleteEmp/{id}")
	public String loadEmpSave(@PathVariable int id, HttpSession session) 
	{
		boolean f = empService.deleteEmp(id);
		if (f) 
		{
			session.setAttribute("msg", "Delete sucessfully");
		} 
		else 
		{
			session.setAttribute("msg", "something wrong on server");
		}
		return "redirect:/";
	}

}
