package com.mmi.ayo.api.services.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.mmi.ayo.api.model.dto.Conversion;
import com.mmi.ayo.api.model.dto.ConversionConstants;
import com.mmi.ayo.api.model.dto.ConversionType;
import com.mmi.ayo.api.model.dto.ConversionVariables;
import com.mmi.ayo.api.services.ConversionService;

public class ConversionServiceImplTest {
	private ConversionService service;
	@Before
	public void setup(){
		service = new ConversionServiceImpl();
	}
	
	@Test
	public void testConvertMinuteToSeconds(){
		Conversion conversion = new Conversion();
		conversion.setQuantity(2.0);
		conversion.setType(ConversionType.TIME);
		ConversionVariables variables = new ConversionVariables();
		variables.setFrom(ConversionConstants.MIN);
		variables.setTo(ConversionConstants.SEC);
		conversion.setVariables(variables);
		assertEquals(120.0, service.convert(conversion).getToQuantity(), 0);
	}
	@Test
	public void testConvertDaysToHours(){
		Conversion conversion = new Conversion();
		conversion.setQuantity(2.0);
		conversion.setType(ConversionType.TIME);
		ConversionVariables variables = new ConversionVariables();
		variables.setFrom(ConversionConstants.DAY);
		variables.setTo(ConversionConstants.HR);
		conversion.setVariables(variables);
		assertEquals(48.0, service.convert(conversion).getToQuantity(), 0);
	}
	@Test
	public void testConvertYearToDays(){
		Conversion conversion = new Conversion();
		conversion.setQuantity(2.0);
		conversion.setType(ConversionType.TIME);
		ConversionVariables variables = new ConversionVariables();
		variables.setFrom(ConversionConstants.YEAR);
		variables.setTo(ConversionConstants.DAY);
		conversion.setVariables(variables);
		assertEquals(730.485, service.convert(conversion).getToQuantity(), 0);
	}
	
	@Test
	public void testConvertKelvinToCelcius() {
		Conversion conversion = new Conversion();
		conversion.setQuantity(90.0);
		conversion.setType(ConversionType.TEMPERATURE);
		ConversionVariables variables = new ConversionVariables();
		variables.setFrom(ConversionConstants.KELVIN);
		variables.setTo(ConversionConstants.DEGREES_CELCIUS);
		conversion.setVariables(variables);
		assertEquals(-183.14999999999998, service.convert(conversion).getToQuantity(), 0);
	}
	@Test
	public void testConvertCelciusToKelvin() {
		Conversion conversion = new Conversion();
		conversion.setQuantity(34.00);
		conversion.setType(ConversionType.TEMPERATURE);
		ConversionVariables variables = new ConversionVariables();
		variables.setFrom(ConversionConstants.DEGREES_CELCIUS);
		variables.setTo(ConversionConstants.KELVIN);
		conversion.setVariables(variables);
		assertEquals(307.15, service.convert(conversion).getToQuantity(), 0);
	}
	
	@Test
	public void testConvertMPHToKMP() {
		Conversion conversion = new Conversion();
		conversion.setQuantity(9.00);
		conversion.setType(ConversionType.SPEED);
		ConversionVariables variables = new ConversionVariables();
		variables.setFrom(ConversionConstants.MPH);
		variables.setTo(ConversionConstants.KM_HR);
		conversion.setVariables(variables);
		assertEquals(14.484096, service.convert(conversion).getToQuantity(), 0);
	}
	
	@Test
	public void testConvertKMPToKnots() {
		Conversion conversion = new Conversion();
		conversion.setQuantity(9.00);
		conversion.setType(ConversionType.SPEED);
		ConversionVariables variables = new ConversionVariables();
		variables.setFrom(ConversionConstants.KM_HR);
		variables.setTo(ConversionConstants.KNOTS);
		conversion.setVariables(variables);
		assertEquals(4.859611231101512, service.convert(conversion).getToQuantity(), 0);
	}
	@Test
	public void testConvertKGToPounds() {
		Conversion conversion = new Conversion();
		conversion.setQuantity(15.0);
		conversion.setType(ConversionType.MASS);
		ConversionVariables variables = new ConversionVariables();
		variables.setFrom(ConversionConstants.KG);
		variables.setTo(ConversionConstants.POUND);
		conversion.setVariables(variables);
		assertEquals(33.06933932773164, service.convert(conversion).getToQuantity(), 0);
	}
	@Test
	public void testConvertGramsToOunce() {
		Conversion conversion = new Conversion();
		conversion.setQuantity(200.00);
		conversion.setType(ConversionType.MASS);
		ConversionVariables variables = new ConversionVariables();
		variables.setFrom(ConversionConstants.GRAMS);
		variables.setTo(ConversionConstants.OUNCE);
		conversion.setVariables(variables);
		assertEquals(7.0547923899160825, service.convert(conversion).getToQuantity(), 0);
	}
	
	@Test
	public void testConvertMilesToKM() {
		Conversion conversion = new Conversion();
		conversion.setQuantity(100.00);
		conversion.setType(ConversionType.LENGTH);
		ConversionVariables variables = new ConversionVariables();
		variables.setFrom(ConversionConstants.MILE);
		variables.setTo(ConversionConstants.KM);
		conversion.setVariables(variables);
		assertEquals(160.9344, service.convert(conversion).getToQuantity(), 0);
	}
}
