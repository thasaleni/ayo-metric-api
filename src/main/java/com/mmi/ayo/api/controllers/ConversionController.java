package com.mmi.ayo.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmi.ayo.api.model.dto.Conversion;
import com.mmi.ayo.api.model.dto.ConversionResponse;
import com.mmi.ayo.api.services.ConversionService;

@RestController
@RequestMapping(value = ConversionController.PATH)
public class ConversionController {
	public final static String PATH = "api/convert";
	@Autowired
	private ConversionService conversionService;

	@PostMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> convert(@RequestBody Conversion conversion) {
		ConversionResponse result = null;
		try {
			result = conversionService.convert(conversion);
		} catch (Exception e) {
			ResponseEntity.badRequest().body(e.getMessage());
		}
		return ResponseEntity.ok(result);
	}
}
