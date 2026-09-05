package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new AnnotationConfigApplicationContext("spring.model");
		
		Employee bean1 = ioc.getBean("employee",Employee.class);
		System.out.println(bean1);
		
		
		
		
	}

}