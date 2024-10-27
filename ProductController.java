package com.product.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.service.ProductService;
@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	ProductService service;
	
	@PostMapping("/add")
	public String insertProduct(@RequestBody Product product) {
		service.saveProduct(product);
		return "Product added successfully";
	}
	@GetMapping("/count")
	public String getProductCount() {
		return String.valueOf(service.countProducts());
	}
	@GetMapping("/findall")
	public List<Product>getAllProducts(){
		return service.findAllProducts();
	}
	@GetMapping("/findby/{id}")
	public Product getProductById(@PathVariable long id) {
		Optional<Product> opt = service.findProductById(id);
        return opt.orElse(null);
	}
	@GetMapping("exists/{id}")
	public String getProductExistence(@PathVariable long id) {
		return String.valueOf(service.existsProductById(id));
	}
	@DeleteMapping("/delete/{id}")
	public String removeProductById(@PathVariable long id) {
		 service.deleteProductById(id);
			return "Product deleted";
	}
	@DeleteMapping("/deleteall")
	public String removeAllProducts() {
			service.deleteAllProducts();
			return "All products deleted";
		}
			
	

}
