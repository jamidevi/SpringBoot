package com.product.service;

import java.util.List;
import java.util.Optional;

import com.product.model.Product;

public interface ProductService {
	long countProducts();
    void deleteProductById(long id);
    void deleteAllProducts();
    boolean existsProductById(long id);
    List<Product> findAllProducts();
    Optional<Product> findProductById(long id);
    void saveProduct(Product product);

}
