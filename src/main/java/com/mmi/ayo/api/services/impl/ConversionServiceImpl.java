package com.mmi.ayo.api.services.impl;

import static com.mmi.ayo.api.model.dto.ConversionConstants.*;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.quantity.Length;
import javax.measure.quantity.Mass;
import javax.measure.quantity.Temperature;
import javax.measure.quantity.Velocity;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;

import org.springframework.stereotype.Service;

import com.mmi.ayo.api.model.dto.Conversion;
import com.mmi.ayo.api.model.dto.ConversionResponse;
import com.mmi.ayo.api.services.ConversionService;

@Service
public class ConversionServiceImpl implements ConversionService {

	@Override
	public ConversionResponse convert(Conversion conversion) {
		ConversionResponse result = null;
		switch (conversion.getType()) {
		case LENGTH:
			result = convertLength(conversion);
			break;
		case MASS:
			result = convertMass(conversion);
			break;
		case SPEED:
			result = convertSpeed(conversion);
			break;
		case TEMPERATURE:
			result = convertTemparature(conversion);
			break;
		case TIME:
			result = convertTime(conversion);
			break;
		default:
			break;
		}
		return result;
	}

	private ConversionResponse convertTime(Conversion conversion) {
		ConversionResponse result = new ConversionResponse();
		result.setFrom(conversion.getVariables().getFrom());
		result.setTo(conversion.getVariables().getTo());
		result.setFromQuantity(conversion.getQuantity());
		if (conversion.getVariables().getFrom().equals(SEC)) {
			Measure<Double, Duration> measure = Measure.valueOf(conversion.getQuantity(), SI.SECOND);
			if (conversion.getVariables().getTo().equals(MIN)) {
				result.setToQuantity(measure.doubleValue(NonSI.MINUTE));
			}
			if (conversion.getVariables().getTo().equals(HR)) {
				result.setToQuantity(measure.doubleValue(NonSI.HOUR));
			}
			if (conversion.getVariables().getTo().equals(DAY)) {
				result.setToQuantity(measure.doubleValue(NonSI.DAY));
			}
			if (conversion.getVariables().getTo().equals(MONTH)) {
				result.setToQuantity(measure.doubleValue(NonSI.MONTH));
			}
			if (conversion.getVariables().getTo().equals(YEAR)) {
				result.setToQuantity(measure.doubleValue(NonSI.YEAR));
			}
		}
		if (conversion.getVariables().getFrom().equals(MIN)) {
			Measure<Double, Duration> measure = Measure.valueOf(conversion.getQuantity(), NonSI.MINUTE);
			if (conversion.getVariables().getTo().equals(SEC)) {
				result.setToQuantity(measure.doubleValue(SI.SECOND));
			}
			if (conversion.getVariables().getTo().equals(HR)) {
				result.setToQuantity(measure.doubleValue(NonSI.HOUR));
			}
			if (conversion.getVariables().getTo().equals(DAY)) {
				result.setToQuantity(measure.doubleValue(NonSI.DAY));
			}
			if (conversion.getVariables().getTo().equals(MONTH)) {
				result.setToQuantity(measure.doubleValue(NonSI.MONTH));
			}
			if (conversion.getVariables().getTo().equals(YEAR)) {
				result.setToQuantity(measure.doubleValue(NonSI.YEAR));
			}
		}
		if (conversion.getVariables().getFrom().equals(HR)) {
			Measure<Double, Duration> measure = Measure.valueOf(conversion.getQuantity(), NonSI.HOUR);
			if (conversion.getVariables().getTo().equals(MIN)) {
				result.setToQuantity(measure.doubleValue(NonSI.MINUTE));
			}
			if (conversion.getVariables().getTo().equals(SEC)) {
				result.setToQuantity(measure.doubleValue(SI.SECOND));
			}
			if (conversion.getVariables().getTo().equals(DAY)) {
				result.setToQuantity(measure.doubleValue(NonSI.DAY));
			}
			if (conversion.getVariables().getTo().equals(MONTH)) {
				result.setToQuantity(measure.doubleValue(NonSI.MONTH));
			}
			if (conversion.getVariables().getTo().equals(YEAR)) {
				result.setToQuantity(measure.doubleValue(NonSI.YEAR));
			}
		}
		if (conversion.getVariables().getFrom().equals(DAY)) {
			Measure<Double, Duration> measure = Measure.valueOf(conversion.getQuantity(), NonSI.DAY);
			if (conversion.getVariables().getTo().equals(MIN)) {
				result.setToQuantity(measure.doubleValue(NonSI.MINUTE));
			}
			if (conversion.getVariables().getTo().equals(HR)) {
				result.setToQuantity(measure.doubleValue(NonSI.HOUR));
			}
			if (conversion.getVariables().getTo().equals(SEC)) {
				result.setToQuantity(measure.doubleValue(SI.SECOND));
			}
			if (conversion.getVariables().getTo().equals(MONTH)) {
				result.setToQuantity(measure.doubleValue(NonSI.MONTH));
			}
			if (conversion.getVariables().getTo().equals(YEAR)) {
				result.setToQuantity(measure.doubleValue(NonSI.YEAR));
			}
		}
		if (conversion.getVariables().getFrom().equals(MONTH)) {
			Measure<Double, Duration> measure = Measure.valueOf(conversion.getQuantity(), NonSI.MONTH);
			if (conversion.getVariables().getTo().equals(MIN)) {
				result.setToQuantity(measure.doubleValue(NonSI.MINUTE));
			}
			if (conversion.getVariables().getTo().equals(HR)) {
				result.setToQuantity(measure.doubleValue(NonSI.HOUR));
			}
			if (conversion.getVariables().getTo().equals(DAY)) {
				result.setToQuantity(measure.doubleValue(NonSI.DAY));
			}
			if (conversion.getVariables().getTo().equals(SEC)) {
				result.setToQuantity(measure.doubleValue(SI.SECOND));
			}
			if (conversion.getVariables().getTo().equals(YEAR)) {
				result.setToQuantity(measure.doubleValue(NonSI.YEAR));
			}
		}
		if (conversion.getVariables().getFrom().equals(YEAR)) {
			Measure<Double, Duration> measure = Measure.valueOf(conversion.getQuantity(), NonSI.YEAR);
			if (conversion.getVariables().getTo().equals(MIN)) {
				result.setToQuantity(measure.doubleValue(NonSI.MINUTE));
			}
			if (conversion.getVariables().getTo().equals(HR)) {
				result.setToQuantity(measure.doubleValue(NonSI.HOUR));
			}
			if (conversion.getVariables().getTo().equals(DAY)) {
				result.setToQuantity(measure.doubleValue(NonSI.DAY));
			}
			if (conversion.getVariables().getTo().equals(SEC)) {
				result.setToQuantity(measure.doubleValue(SI.SECOND));
			}
			if (conversion.getVariables().getTo().equals(MONTH)) {
				result.setToQuantity(measure.doubleValue(NonSI.MONTH));
			}
		}
		return result;
	}

	private ConversionResponse convertTemparature(Conversion conversion) {
		ConversionResponse result = new ConversionResponse();
		result.setFrom(conversion.getVariables().getFrom());
		result.setTo(conversion.getVariables().getTo());
		result.setFromQuantity(conversion.getQuantity());
		if (conversion.getVariables().getFrom().equals(DEGREES_CELCIUS)) {
			Measure<Double, Temperature> measure = Measure.valueOf(conversion.getQuantity(), SI.CELSIUS);
			if(conversion.getVariables().getTo().equals(KELVIN)) {
				result.setToQuantity(measure.doubleValue(SI.KELVIN));
			}
		}
		if (conversion.getVariables().getFrom().equals(KELVIN)) {
			Measure<Double, Temperature> measure = Measure.valueOf(conversion.getQuantity(), SI.KELVIN);
			if(conversion.getVariables().getTo().equals(DEGREES_CELCIUS)) {
				result.setToQuantity(measure.doubleValue(SI.CELSIUS));
			}
		}
		return result;
	}

	private ConversionResponse convertSpeed(Conversion conversion) {
		ConversionResponse result = new ConversionResponse();
		result.setFrom(conversion.getVariables().getFrom());
		result.setTo(conversion.getVariables().getTo());
		result.setFromQuantity(conversion.getQuantity());
		if (conversion.getVariables().getFrom().equals(M_SEC)) {
			Measure<Double, Velocity> measure = Measure.valueOf(conversion.getQuantity(), SI.METERS_PER_SECOND);
			if (conversion.getVariables().getTo().equals(KM_HR)) {
				result.setToQuantity(measure.doubleValue(NonSI.KILOMETERS_PER_HOUR));
			}
			if (conversion.getVariables().getTo().equals(MPH)) {
				result.setToQuantity(measure.doubleValue(NonSI.MILES_PER_HOUR));
			}
			if (conversion.getVariables().getTo().equals(KNOTS)) {
				result.setToQuantity(measure.doubleValue(NonSI.KNOT));
			}
			
		}
		if (conversion.getVariables().getFrom().equals(KM_HR)) {
			Measure<Double, Velocity> measure = Measure.valueOf(conversion.getQuantity(), NonSI.KILOMETERS_PER_HOUR);
			if (conversion.getVariables().getTo().equals(M_SEC)) {
				result.setToQuantity(measure.doubleValue(SI.METERS_PER_SECOND));
			}
			if (conversion.getVariables().getTo().equals(MPH)) {
				result.setToQuantity(measure.doubleValue(NonSI.MILES_PER_HOUR));
			}
			if (conversion.getVariables().getTo().equals(KNOTS)) {
				result.setToQuantity(measure.doubleValue(NonSI.KNOT));
			}
			
		}
		if (conversion.getVariables().getFrom().equals(MPH)) {
			Measure<Double, Velocity> measure = Measure.valueOf(conversion.getQuantity(), NonSI.MILES_PER_HOUR);
			if (conversion.getVariables().getTo().equals(KM_HR)) {
				result.setToQuantity(measure.doubleValue(NonSI.KILOMETERS_PER_HOUR));
			}
			if (conversion.getVariables().getTo().equals(MPH)) {
				result.setToQuantity(measure.doubleValue(NonSI.MILES_PER_HOUR));
			}
			if (conversion.getVariables().getTo().equals(M_SEC)) {
				result.setToQuantity(measure.doubleValue(SI.METERS_PER_SECOND));
			}
			
		}
		if (conversion.getVariables().getFrom().equals(KNOTS)) {
			Measure<Double, Velocity> measure = Measure.valueOf(conversion.getQuantity(), NonSI.KNOT);
			if (conversion.getVariables().getTo().equals(KM_HR)) {
				result.setToQuantity(measure.doubleValue(NonSI.KILOMETERS_PER_HOUR));
			}
			if (conversion.getVariables().getTo().equals(MPH)) {
				result.setToQuantity(measure.doubleValue(NonSI.MILES_PER_HOUR));
			}
			if (conversion.getVariables().getTo().equals(M_SEC)) {
				result.setToQuantity(measure.doubleValue(SI.METERS_PER_SECOND));
			}
			
		}
		return result;
	}

	private ConversionResponse convertMass(Conversion conversion) {
		ConversionResponse result = new ConversionResponse();
		result.setFrom(conversion.getVariables().getFrom());
		result.setTo(conversion.getVariables().getTo());
		result.setFromQuantity(conversion.getQuantity());
		if (conversion.getVariables().getFrom().equals(GRAMS)) {
			Measure<Double, Mass> measure = Measure.valueOf(conversion.getQuantity(), SI.GRAM);
			if (conversion.getVariables().getTo().equals(KG)) {
				result.setToQuantity(measure.doubleValue(SI.KILOGRAM));
			}
			if (conversion.getVariables().getTo().equals(POUND)) {
				result.setToQuantity(measure.doubleValue(NonSI.POUND));
			}
			if (conversion.getVariables().getTo().equals(OUNCE)) {
				result.setToQuantity(measure.doubleValue(NonSI.OUNCE));
			}
			
		}
		if (conversion.getVariables().getFrom().equals(KG)) {
			Measure<Double, Mass> measure = Measure.valueOf(conversion.getQuantity(), SI.KILOGRAM);
			if (conversion.getVariables().getTo().equals(GRAMS)) {
				result.setToQuantity(measure.doubleValue(SI.GRAM));
			}
			if (conversion.getVariables().getTo().equals(POUND)) {
				result.setToQuantity(measure.doubleValue(NonSI.POUND));
			}
			if (conversion.getVariables().getTo().equals(OUNCE)) {
				result.setToQuantity(measure.doubleValue(NonSI.OUNCE));
			}
			
		}
		if (conversion.getVariables().getFrom().equals(POUND)) {
			Measure<Double, Mass> measure = Measure.valueOf(conversion.getQuantity(), NonSI.POUND);
			if (conversion.getVariables().getTo().equals(KG)) {
				result.setToQuantity(measure.doubleValue(SI.KILOGRAM));
			}
			if (conversion.getVariables().getTo().equals(GRAMS)) {
				result.setToQuantity(measure.doubleValue(SI.GRAM));
			}
			if (conversion.getVariables().getTo().equals(OUNCE)) {
				result.setToQuantity(measure.doubleValue(NonSI.OUNCE));
			}
			
		}
		if (conversion.getVariables().getFrom().equals(OUNCE)) {
			Measure<Double, Mass> measure = Measure.valueOf(conversion.getQuantity(), NonSI.OUNCE);
			if (conversion.getVariables().getTo().equals(KG)) {
				result.setToQuantity(measure.doubleValue(SI.KILOGRAM));
			}
			if (conversion.getVariables().getTo().equals(POUND)) {
				result.setToQuantity(measure.doubleValue(NonSI.POUND));
			}
			if (conversion.getVariables().getTo().equals(GRAMS)) {
				result.setToQuantity(measure.doubleValue(SI.GRAM));
			}
			
		}
		return result;
	}

	private ConversionResponse convertLength(Conversion conversion) {
		ConversionResponse result = new ConversionResponse();
		result.setFrom(conversion.getVariables().getFrom());
		result.setTo(conversion.getVariables().getTo());
		result.setFromQuantity(conversion.getQuantity());
		if (conversion.getVariables().getFrom().equals(INCH)) {
			Measure<Double, Length> measure = Measure.valueOf(conversion.getQuantity(), NonSI.INCH);
			if (conversion.getVariables().getTo().equals(KM)) {
				result.setToQuantity(measure.doubleValue(SI.KILOMETER));
			}
			if (conversion.getVariables().getTo().equals(CM)) {
				result.setToQuantity(measure.doubleValue(SI.CENTIMETER));
			}
			if (conversion.getVariables().getTo().equals(MILE)) {
				result.setToQuantity(measure.doubleValue(NonSI.MILE));
			}
			
		}
		if (conversion.getVariables().getFrom().equals(KM)) {
			Measure<Double, Length> measure = Measure.valueOf(conversion.getQuantity(), SI.KILOMETER);
			if (conversion.getVariables().getTo().equals(INCH)) {
				result.setToQuantity(measure.doubleValue(NonSI.INCH));
			}
			if (conversion.getVariables().getTo().equals(CM)) {
				result.setToQuantity(measure.doubleValue(SI.CENTIMETER));
			}
			if (conversion.getVariables().getTo().equals(MILE)) {
				result.setToQuantity(measure.doubleValue(NonSI.MILE));
			}
			
		}
		if (conversion.getVariables().getFrom().equals(CM)) {
			Measure<Double, Length> measure = Measure.valueOf(conversion.getQuantity(), SI.CENTIMETRE);
			if (conversion.getVariables().getTo().equals(KM)) {
				result.setToQuantity(measure.doubleValue(SI.KILOMETER));
			}
			if (conversion.getVariables().getTo().equals(INCH)) {
				result.setToQuantity(measure.doubleValue(NonSI.INCH));
			}
			if (conversion.getVariables().getTo().equals(MILE)) {
				result.setToQuantity(measure.doubleValue(NonSI.MILE));
			}
			
		}
		if (conversion.getVariables().getFrom().equals(MILE)) {
			Measure<Double, Length> measure = Measure.valueOf(conversion.getQuantity(), NonSI.MILE);
			if (conversion.getVariables().getTo().equals(KM)) {
				result.setToQuantity(measure.doubleValue(SI.KILOMETER));
			}
			if (conversion.getVariables().getTo().equals(CM)) {
				result.setToQuantity(measure.doubleValue(SI.CENTIMETER));
			}
			if (conversion.getVariables().getTo().equals(INCH)) {
				result.setToQuantity(measure.doubleValue(NonSI.INCH));
			}
			
		}
		return result;
	}

}
