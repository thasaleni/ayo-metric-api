package com.mmi.ayo.api.model.dto;

public class ConversionResponse {
	private String from;
	private String to;
	private double fromQuantity;
	private double toQuantity;

	public ConversionResponse() {
		this.from = "";
		this.to = "";
		this.fromQuantity = 0.0;
		this.toQuantity = 0.0;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public double getFromAmount() {
		return fromQuantity;
	}

	public void setFromQuantity(double fromQuantity) {
		this.fromQuantity = fromQuantity;
	}

	public double getToQuantity() {
		return toQuantity;
	}

	public void setToQuantity(double toQuantity) {
		this.toQuantity = toQuantity;
	}

}
