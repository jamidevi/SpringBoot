package com.product.restapi.jpa.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.restapi.jpa.mysql.model.ProductModel;
public interface ProductRepository extends JpaRepository<ProductModel,Long> {

}
