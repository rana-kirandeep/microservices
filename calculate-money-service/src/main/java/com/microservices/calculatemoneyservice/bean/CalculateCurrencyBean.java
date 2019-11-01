package com.microservices.calculatemoneyservice.bean;

import java.math.BigDecimal;

public class CalculateCurrencyBean {

	private String id;
	private String to;
	private String from;
	private BigDecimal exchangeRate;
	private BigDecimal totalCalculatedMoney;
	private BigDecimal quantity;
	private int port;
	
	
	public CalculateCurrencyBean(){
		super();
	}
	
	public CalculateCurrencyBean(String id, String to, String from,
			BigDecimal exchangeRate, BigDecimal totalCalculatedMoney,
			BigDecimal quantity, int port) {
		super();
		this.id = id;
		this.to = to;
		this.from = from;
		this.exchangeRate = exchangeRate;
		this.totalCalculatedMoney = totalCalculatedMoney;
		this.quantity = quantity;
		this.port = port;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getTotalCalculatedMoney() {
		return totalCalculatedMoney;
	}

	public void setTotalCalculatedMoney(BigDecimal totalCalculatedMoney) {
		this.totalCalculatedMoney = totalCalculatedMoney;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
