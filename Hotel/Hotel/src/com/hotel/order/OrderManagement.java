package com.hotel.order;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class OrderManagement {

	public static void main(String[] args) {

		OrderImpl orderImpl = new OrderImpl();
		OrderPojo orderPojo = new OrderPojo();

		orderPojo.setOrderName("Dosa");
		orderPojo.setOrderAmount(100);
		orderPojo.setOrderDate(LocalDate.now());

		Optional<OrderPojo> orderPojoObj = orderImpl.takeOrder(orderPojo);
		orderPojoObj = Optional.ofNullable(orderPojoObj).orElse(Optional.of(new OrderPojo()));

		if (orderPojoObj.isPresent()) {
			if (orderPojo.getOrderStatus() == ('R')) {
				System.out.println("*****Order Received*****");
			}
			System.out.println("Your Order ID is: " + orderPojo.getOrderID());
			DateTimeFormatter formatTodayWithZoneId = DateTimeFormatter.ofPattern("MM/dd/yy hh:mm:ss VV");
			//System.out.format("Formatted date time with zone ID of Europe is %s",orderPojo.getTimeZone().format(formatTodayWithZoneId));
			System.out.format("Order date and time is %s",orderPojo.getTimeZone().format(formatTodayWithZoneId));
		} else {
			System.out.println("Please wait for your order");
		}

	}

}
