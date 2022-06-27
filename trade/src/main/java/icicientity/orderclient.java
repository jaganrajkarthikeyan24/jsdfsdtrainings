package icicientity;

import java.util.List;

public class orderclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
				ordermanagementimpl orderManagementImpl = new ordermanagementimpl();
				order order = new order();
				
				order.setOrderName("Diwali purchase");
				order.setAmount(2000);
				
				order.setOrderName("Pongal purchase");
				order.setAmount(5000);
				
				//orderManagementImpl.createOrder(order);
				
				/*order = orderManagementImpl.getOrder(4);
				System.out.println(order.getOrderId());
				System.out.println(order.getOrderName());

				*/
				
				/*
				 * int orderId=4; order=orderManagementImpl.getOrder(orderId); 
				 * if(order==null) {
				 * System.out.println("order id" + orderId + "is not available");
				 * }
				 * else{
				 * System.out.println(order.getOrderId());
				 * System.out.println(order.getOrderName());
				 * }
				
				 */
				/*
				 * int orderId=4; orderManagementImpl.deleteOrder(orderId);
				 */
				
				
				
				List<order> orderList = orderManagementImpl.listOrder();

				if (orderList == null) {
					System.out.println("No Order Found");
				} else {
					for (order Order : orderList) {
						System.out.println(order.getOrderId());
						System.out.println(order.getOrderName());
						System.out.println(order.getStatus());
						System.out.println(order.getAmount());
					}

					System.out.println("Order details retrival  successfull....");
				}

				
				
				
				
				
				
			}

		

	}


