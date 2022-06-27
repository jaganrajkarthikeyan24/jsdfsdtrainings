package icicientity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class ordermanagementimpl {
	EntityManagerFactory emf = null;
	EntityManager entityManager = null;
	EntityTransaction transaction = null;

	EntityManager getEntityManager() {
		try {
			emf = Persistence.createEntityManagerFactory("corebanking");
			entityManager = emf.createEntityManager();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return entityManager;
	}

	void closeEntityManagerFactory() {
		if (emf != null) {
			emf.close();
		}

	}

	void closeEntityManager() {
		if (entityManager != null) {
			entityManager.close();
		}

	}

	
                    //create	
		public void createOrder(order order) {
			EntityManagerFactory emf = null;
			EntityManager entityManager = null;
			EntityTransaction transaction = null;
			try {
				emf = Persistence.createEntityManagerFactory("corebanking");
				entityManager = emf.createEntityManager();

				transaction = entityManager.getTransaction();

				// start transaction
				transaction.begin();

				// entity
				order.setOrderName(order.getOrderName());
				order.setAmount(order.getAmount());
				// save call
				entityManager.persist(order);

				transaction.commit();
				entityManager.close();

				System.out.println("Order saved   successfull....");

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
		
		
		order getOrder(int orderId) {
			order order=null;
			try {
				getEntityManager();

				// entity
				order = entityManager.find(order.class, orderId);

				entityManager.close();

				System.out.println("Order saved   successfull....");

			} catch (Exception e) {
				System.out.println(e);
			} finally {
				closeEntityManager();
				closeEntityManagerFactory();
			}

			return order;
		}

		
		//update
		order updateOrder(order order) {

			order orderEntity = null;
			try {
				getEntityManager();
				transaction = entityManager.getTransaction();

				// start transaction
				transaction.begin();

				// entity
				orderEntity = entityManager.find(order.class, order.getOrderId());
				
				
				
				orderEntity.setOrderName(order.getOrderName());
				orderEntity.setAmount(order.getAmount());
				orderEntity.setStatus(order.getStatus());

				transaction.commit();
				
				System.out.println("Order saved   successfull....");

			} catch (Exception e) {
				transaction.rollback();
				System.out.println(e);
			} finally {
				closeEntityManager();
				closeEntityManagerFactory();
			}

			return order;
		}
		
		//delete
		
		public void deleteOrder(int orderId) {
			order order=null;
			try {
				getEntityManager();
				
				transaction = entityManager.getTransaction();

				// start transaction
				transaction.begin();

				// entity
				order = entityManager.getReference(order.class, orderId);
				if (order == null) {
					System.out.println("order not received");
				}else {
					entityManager.remove(order);
					System.out.println("Order removed   successfull....");
				}

				transaction.commit();

			} catch (Exception e) {
				System.out.println(e);
			} finally {
				closeEntityManager();
				closeEntityManagerFactory();
			}

		}

		
		List<order> listOrder() {
			List<order> orderList = null;
			try {
				getEntityManager();
				transaction = entityManager.getTransaction();

				// start transaction
				transaction.begin();

				Query q = entityManager.createQuery(" from order");
				orderList = q.getResultList();

				System.out.println("num of sudents:" + orderList.size());

				transaction.commit();

			} catch (Exception e) {
				transaction.rollback();
				System.out.println(e);
			} finally {
				closeEntityManager();
				closeEntityManagerFactory();
			}

			return orderList;
		}

		
		
		
		
		

		
}		

		
		
