package com.flipkart.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.flipkart.entity.Product;


public class ProductDAOImpl {

	public void saveProduct(Product product) {
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("onlineShopping");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			// entity
			product.setProductname(product.getProductname());
			product.setProductPrice(product.getProductPrice());
			product.setProductRating(product.getProductRating());

			// save call
			entityManager.persist(product);

			transaction.commit();
			entityManager.close();

			System.out.println("Product Saved!!");

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
			
		} finally {
			if (transaction != null && transaction.isActive()) {
				transaction.commit();
			}
			if (entityManager != null) {
				entityManager.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}
}

	
