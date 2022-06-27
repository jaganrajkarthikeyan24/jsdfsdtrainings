package com.icici.dao;

import com.icici.entity.OrderItem;

public class OrderItemClient {

	public static void main(String[] args) {

		OrderItem orderItem = new OrderItem();
		orderItem.setProductId(101);
		
		
		OrderItemDaoImpl orderItemDaoImpl= new OrderItemDaoImpl();
		orderItemDaoImpl.saveOrderItemForOrder(orderItem, 11);
	}

}
