package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.Address;
import spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("application-context.xml");
		Employee obj = (Employee) factory.getBean("emp1");
		System.out.println(obj);
		
		
	}

}
