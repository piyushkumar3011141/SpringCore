package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext bean = new ClassPathXmlApplicationContext("parent_child.xml");
		Employee e2 = bean.getBean("child", Employee.class);
		System.out.println(e2);


		
		
	}

}
