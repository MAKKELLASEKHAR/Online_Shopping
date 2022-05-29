package com.cg.onlineshopping.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int order_id;
	@Column(name="order_status",length=20)
	private String order_status;
	@Column(name="order_date",length=20)
	private Date order_date;
	@Column(name="item_name",length=20)
	private long estimate_delivery_time;
	@OneToOne
	@JoinColumn(name="customer_id",unique=true)
	private Customer customer;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public long getEstimate_delivery_time() {
		return estimate_delivery_time;
	}
	public void setEstimate_delivery_time(long estimate_delivery_time) {
		this.estimate_delivery_time = estimate_delivery_time;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
