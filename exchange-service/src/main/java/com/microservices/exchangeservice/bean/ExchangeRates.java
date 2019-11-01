package com.microservices.exchangeservice.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeRates {
	
	
	@Id
	private long id;
	
	@Column(name="to_currency")
	private String to;

	@Column(name="from_currency")
	private String from;
	
	private BigDecimal exchangeRate;
	private int port;

	public ExchangeRates(String to, String from, BigDecimal exchangeRate,
			int port) {
		super();
		this.to = to;
		this.from = from;
		this.exchangeRate = exchangeRate;
		this.port = port;
	}

	public ExchangeRates() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
