package spring.model;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {

	private int id;
	private String name, gender;

	private Address address;
	 // Constructor Autowiring ke liye
    public Employee(Address address) {
        this.address = address;
    }
}
