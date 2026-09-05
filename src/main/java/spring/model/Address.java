package spring.model;

import java.util.List;
import org.springframework.context.annotation.Primary;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component(value = "add1")
//@Primary

public class Address implements IAddress{

	
	private String city = "Ghaziabad", state = "up";

	

}