package com.product.restapi.jpa.mysql.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class ProductModel {
	@Id
	long id;
	String name;
	String price;

}
