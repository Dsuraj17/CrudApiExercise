package org.nlt.controller;

import java.util.ArrayList;
import java.util.List;

import org.nlt.model.Students;
import org.nlt.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
	@Autowired
	private StudentServices studentService;
	
	public StudentController() 
	{
		System.out.println("Student Controller Object Created");
	}
	
	@RequestMapping(value = "/student",method=RequestMethod.POST)
	public String submitStudent(@RequestBody Students student)
	{
		studentService.saveStudent(student);
		return "Student Record Submiited";
	}
	
	@RequestMapping(value = "/student/{id}",method=RequestMethod.GET)
	public Students getStudent(@PathVariable String id)
	{
		Students student = studentService.getStudent(Integer.parseInt(id));
		return student;
	}
	
	@RequestMapping(value = "/students",method=RequestMethod.GET)
	public List<Students> getAllStudent()
	{
		ArrayList<Students> allStudents = studentService.getAllStudents();
		return allStudents;
	}
	
	@RequestMapping(value = "/student/{id}",method=RequestMethod.DELETE)
	public String deleteStudent(@PathVariable String id)
	{
		studentService.deleteStudent(Integer.parseInt(id));
		return "Student Record Deleted";
	}
	
	@RequestMapping(value = "/student/{id}",method=RequestMethod.PUT)
	public String updateStudent(@PathVariable String id,@RequestBody Students stu)
	{
		studentService.updateStudent(Integer.parseInt(id), stu);
		return "Student Record Updated";
	}
}
