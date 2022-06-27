package com.hotel.order;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class OrderPojo {

	private int orderID;
	private String orderName;
	private LocalDate orderDate;
	private long orderAmount;
	private char orderStatus;
	private ZonedDateTime orderTime;

	public OrderPojo() {
	}

	public OrderPojo(int orderID, String orderName, LocalDate orderDate, long orderAmount, char orderStatus,
			ZonedDateTime timeZone) {
		super();
		this.orderID = orderID;
		this.orderName = orderName;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.orderStatus = orderStatus;
		this.orderTime = timeZone;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public long getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(long orderAmount) {
		this.orderAmount = orderAmount;
	}

	public char getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(char orderStatus) {
		this.orderStatus = orderStatus;
	}

	public ZonedDateTime getTimeZone() {
		return orderTime;
	}

	public void setTimeZone(ZonedDateTime todayWithTimeZone) {
		this.orderTime = todayWithTimeZone;
	}

	@Override
	public String toString() {
		return "OrderPojo [orderID=" + orderID + ", orderName=" + orderName + ", orderDate=" + orderDate
				+ ", orderAmount=" + orderAmount + ", orderStatus=" + orderStatus + ", timeZone=" + orderTime + "]";
	}

}
