package org.nlt.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.nlt.model.Students;
import org.nlt.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServices 
{
	@Autowired
	private StudentRepository studentRepo;
	
	public StudentServices() 
	{
		System.out.println("Student Services Object Created");
	}
	
	public void saveStudent(Students student)
	{
		studentRepo.save(student);
	}
	
	public Students getStudent(int id)
	{
		Students student = studentRepo.findById(id).get();
		return student;
	}
	
	public ArrayList<Students> getAllStudents()
	{
		Iterator<Students> stuIterator = studentRepo.findAll().iterator();
		
		ArrayList<Students> stuArrayList=new ArrayList();
		
		while(stuIterator.hasNext())
		{
			stuArrayList.add(stuIterator.next());
		}
		return stuArrayList;
	}
	
	public void deleteStudent(int id)
	{
		studentRepo.deleteById(id);
	}
	
	public void updateStudent(int id,Students newStuObject)
	{
		Students oldStuObject = studentRepo.findById(id).get();
		oldStuObject.setName(newStuObject.getName());
		oldStuObject.setAge(newStuObject.getAge());
		oldStuObject.setPhone(newStuObject.getPhone());
		oldStuObject.setModified(new Date());
		oldStuObject.setCreated(new Date());
		studentRepo.save(oldStuObject);
	}
}
