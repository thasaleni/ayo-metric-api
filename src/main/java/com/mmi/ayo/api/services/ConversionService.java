package com.mmi.ayo.api.services;

import com.mmi.ayo.api.model.dto.Conversion;
import com.mmi.ayo.api.model.dto.ConversionResponse;

public interface ConversionService {
	
	ConversionResponse convert(Conversion conversion);

}
