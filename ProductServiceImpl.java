package com.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository repository;

	@Override
	public long countProducts() {
		// TODO Auto-generated method stub
		return repository.count();
	}

	@Override
	public void deleteProductById(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		repository.deleteAll();

	}

	@Override
	public boolean existsProductById(long id) {
		// TODO Auto-generated method stub
		return repository.existsById(id);
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Product> findProductById(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		repository.save(product);

	}

}
