package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.model.DatabaseSingleton;
import spring.model.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext factory =    new ClassPathXmlApplicationContext("factory.xml"); 
    	DatabaseSingleton obj1 =  factory.getBean("dbSingleton",DatabaseSingleton.class);
    	DatabaseSingleton obj2 =  factory.getBean("dbSingleton",DatabaseSingleton.class);
    	DatabaseSingleton obj3 =  factory.getBean("dbSingleton",DatabaseSingleton.class);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
	}

}
