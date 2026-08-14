package spring.model;

import java.util.List;
import java.util.Set;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
	//Primitive and Spring based dependency
	private int id;
	private String name, gender;
	
	//Dependency Object Based Dependency
	private Address address;
	
	//Collection Dependency
	private List<String>list;
	
	private Set<String>set;
	
	private Map<Integer,String>map;
}
