package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.student.Student;

@RestController
@RequestMapping
public class TestController {

//	@Autowired
//	ServiceClass serviceClass;
//	
//
//	public ServiceClass getServiceClass() {
//		return serviceClass;
//	}
//
//	public void setServiceClass(ServiceClass serviceClass) {
//		this.serviceClass = serviceClass;
//	}

//	@GetMapping
//	String helloMethod() {
//		return serviceClass.hello();
//	}

	@GetMapping("/slist")
	List<Student> slist(){
		List<Student> s=listStudents();
		return s;
	}
	
	
	public List<Student> listStudents() {
		List<Student> slist = new ArrayList<Student>();
		Student student = new Student();
		student.setId(1);
		student.setName("Pavithra");
		student.setAge(20);
		student.setAddress("hyderabad");
		slist.add(student);
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("Pavithra1");
		student1.setAge(21);
		student1.setAddress("hyderabad1");
		slist.add(student1);
		Student student2 = new Student();
		student2.setId(3);
		student2.setName("Pavithra2");
		student2.setAge(22);
		student2.setAddress("hyderabad2");
		slist.add(student2);
		Student student3 = new Student();
		student3.setId(4);
		student3.setName("Pavithra3");
		student3.setAge(23);
		student3.setAddress("hyderaba3");
		slist.add(student3);
		Student student4 = new Student();
		student4.setId(5);
		student4.setName("Pavithr4");
		student4.setAge(24);
		student4.setAddress("hyderabad4");
		slist.add(student4);

		return slist;
	}
}
