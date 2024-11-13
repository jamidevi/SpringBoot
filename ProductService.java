package com.product.restapi.jdbc.service;

import java.util.List;

import com.product.restapi.jdbc.model.Product;

public interface ProductService {
	void saveProduct(Product product);
    Product getProductById(long id);
    List<Product> getAllProducts();
    void deleteAllProducts();
	

}
