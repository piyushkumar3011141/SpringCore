package spring.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component 
public class Employee {

	private int id = 	113;
	private String name = "Mohit", gender = "Male";

	@Autowired
	@Qualifier(value = "add1")
	private IAddress address;

}