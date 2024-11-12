package com.product.restapi.jpa.mysql.service;

import java.util.List;

import java.util.Optional;

import com.product.restapi.jpa.mysql.model.ProductModel;
public interface ProductService {
	long countProducts();
    void deleteProductById(long id);
    void deleteAllProducts();
    boolean existsProductById(long id);
    List<ProductModel> findAllProducts();
    Optional<ProductModel> findProductById(long id);
    void saveProduct(ProductModel product);

}
