package com.sda.advanced.solution.zad17;

public class Converter {

	public double convert(double value, ConversionType conversionType) {
		return value * conversionType.getFactor();
	}
}
