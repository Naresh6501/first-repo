package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.DAO.ProductDAO;
import com.zensar.bean.Product;





@Service
public class ProductService {
	@Autowired
	ProductDAO dao;
//add product
	public Product addProduct(Product product) {
		return this.dao.save(product);
	}
//update product
	public Product updateProduct(Product product) {
		return this.dao.save(product);

	}
	//get by id
	public Product findProduct(int id) {
		Optional<Product> optional=dao.findById(id);
		if(optional.isPresent())
			return optional.get();
		return null;
	}
//read all products
	public List<Product> getAllProduct() {
		return this.dao.findAll();
	}
	
//delete product
public boolean deleteProduct(int id ) {
	this.dao.deleteById(id);
	return true;
}
	
}
