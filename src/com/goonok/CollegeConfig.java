package com.goonok;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.goonok") // for annotation @Component before the calling class
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

	@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}
	
	@Bean
	public Teacher englishTeacher() {
		return new EnglishTeacher();
	}
	
	@Bean
	public Principle principleBean() {
		return new Principle();
	}
	@Bean("college")
	public College collegeBean() {
		College college = new College(); 
		college.setPrinciple(principleBean());
		college.setTeacher(englishTeacher());
		return college;
	}
	
	
}
