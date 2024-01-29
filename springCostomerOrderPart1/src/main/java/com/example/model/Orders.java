package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "orders")
public class Orders {
	@Id
	private int orderid;
	private String itemname;
	private int price;
	
	@ManyToOne
	private Customer customer;
	public Orders(){
		super();
		
	}
	
	public Orders(int orderid, String itemname, int price, Customer customer) {
		super();
		this.orderid = orderid;
		this.itemname = itemname;
		this.price = price;
		this.customer = customer;
	}
	

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", itemname=" + itemname + ", price=" + price + ", customer=" + customer
				+ "]";
	}
	
	

}
