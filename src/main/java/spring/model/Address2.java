package spring.model;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


@Component(value = "add2")
public class Address2 implements IAddress {

	
	private String city = "Nodia", state = "up";

	

}