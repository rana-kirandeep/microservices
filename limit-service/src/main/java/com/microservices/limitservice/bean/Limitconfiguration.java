package com.microservices.limitservice.bean;

public class Limitconfiguration {

	private int min;
	private int max;
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public Limitconfiguration(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	
}
