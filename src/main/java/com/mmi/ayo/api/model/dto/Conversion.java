package com.mmi.ayo.api.model.dto;

public class Conversion {
	
	private Double quantity;
	private ConversionVariables variables; 
	private ConversionType type;
	
	
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public ConversionVariables getVariables() {
		return variables;
	}
	public void setVariables(ConversionVariables variables) {
		this.variables = variables;
	}
	public ConversionType getType() {
		return type;
	}
	public void setType(ConversionType type) {
		this.type = type;
	}
	
}
