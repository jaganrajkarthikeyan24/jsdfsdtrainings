package com.flipkart.client;

import com.flipkart.DAO.ProductDAOImpl;
import com.flipkart.entity.Product;

public class ProductClient {

	public static void main(String[] args) {
		
		ProductDAOImpl productDAOImpl = new ProductDAOImpl();
		Product product = new Product("i-Phone", 50000, "4.5");
		
		productDAOImpl.saveProduct(product);
	}

}
