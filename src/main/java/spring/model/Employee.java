package spring.model;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

abstract public class Employee {

	private int id;
	private String name, gender;
	
	private Address address;
	public abstract Address applyAddress();
	
	

}
