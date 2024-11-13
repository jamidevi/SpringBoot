package com.product.restapi.jdbc.model;
import org.springframework.data.annotation.Id;
 import lombok.Data;
@Data

public class Product {
	@Id
	long id;
	String name;
	String price;

}
