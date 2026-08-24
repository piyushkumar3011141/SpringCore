package spring.model;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee implements InitializingBean , DisposableBean{

	private int id;
	private String name, gender;

	private Address address;
	
	private void xmlInitMethod() {
		System.out.println("xmlInitMethod");
	}
	
	private void xmlDestroyMethod() {
		System.out.println("xmlDestroyMethod");
	}
	
	//InitializingBean method
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee6.afterPropertiesSet()(InitializingBean)");
	}
		
		//DisposableBean method
	@Override
	public void destroy() throws Exception {
		System.out.println("Employee6.destroy()");
	}

}
