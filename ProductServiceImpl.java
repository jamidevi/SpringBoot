package com.product.restapi.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.product.restapi.jdbc.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
    private JdbcTemplate template;

    @Override
    public void saveProduct(Product product) {
        template.update("INSERT INTO product (id, name, price) VALUES (?, ?, ?)",
            new Object[] {product.getId(), product.getName(), product.getPrice()});
    }

    @Override
    public Product getProductById(long id) {
        return template.queryForObject(
            "SELECT * FROM product WHERE id = ?",
            BeanPropertyRowMapper.newInstance(Product.class),
            id
        );
    }

    @Override
    public List<Product> getAllProducts() {
        return template.query(
            "SELECT * FROM product",
            BeanPropertyRowMapper.newInstance(Product.class)
        );
    }

    @Override
    public void deleteAllProducts() {
        template.update("DELETE FROM product");
    }
}
