package com.goonok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class College {
	@Value("${collegeName}")
	private String collegeName;
	
	@Autowired
	private Principle principle;
	
	@Autowired
	@Qualifier("mathTeacherBean") //using while there are 2 or more implementation of an interface 
	private Teacher teacher;


	public void setPrinciple(Principle principle) {
		this.principle = principle;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public void test() {
		System.out.println("College.test()");
		principle.principleInfo();
		teacher.teach();
		System.out.println("My College Name is: "+collegeName);
	}

}
