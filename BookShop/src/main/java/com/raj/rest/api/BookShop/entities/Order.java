package com.raj.rest.api.BookShop.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.logging.log4j.internal.LogManagerStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	private static final String EnumType = null;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderid")
	private Long orderId;

	@ManyToOne
	@JoinColumn(name = "userid", referencedColumnName = "userid")
	private User user;

	@Column(name = "orderdate")
	private LocalDateTime orderDate;

	@Column(name = "totalprice")
	private BigDecimal totalPrice;

	@Column(name = "orderstatus")
	private String orderStatus;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public static String getEnumtype() {
		return EnumType;
	}

}
