package com.product.restapi.jdbc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.restapi.jdbc.model.Product;
import com.product.restapi.jdbc.service.ProductService;
@RestController
public class ProductController {
	 @Autowired
	    private ProductService service;

	    @PostMapping("/add")
	    public String insertProduct(@RequestBody Product product) {
	        service.saveProduct(product);
	        return "Product added successfully";
	    }

	    @GetMapping("/findall")
	    public List<Product> getAllProducts() {
	        return service.getAllProducts();
	    }

	    @GetMapping("/findby/{id}")
	    public Product getProductById(@PathVariable long id) {
	        return service.getProductById(id);
	    }

	    @DeleteMapping("/deleteall")
	    public String removeAllProducts() {
	        service.deleteAllProducts();
	        return "All products deleted";
	    }
		
}
