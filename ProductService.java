package com.accenture.jdbc.service;

import java.util.Set;

import com.accenture.jdbc.dao.ProductDAO;
import com.accenture.jdbc.entity.Product;

public class ProductService {

	private ProductDAO dao;

	public ProductService() {
		this.dao = new ProductDAO();
	}

	public Set<Product> getAllProducts() {
		return dao.selectAllProducts();
	}

	public Product getProductById(int productId) {
		return dao.selectProductById(productId);
	}

	public int addProduct(Product product) {
		return dao.insertProduct(product);
	}

	public int modifyProduct(Product product) {
		return dao.updateProduct(product);
	}

	public int removeProduct(int productId) {
		return dao.deleteProduct(productId);
	}
}
