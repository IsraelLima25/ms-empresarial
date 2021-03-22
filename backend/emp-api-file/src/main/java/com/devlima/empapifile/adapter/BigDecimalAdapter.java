package com.devlima.empapifile.adapter;

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class BigDecimalAdapter extends XmlAdapter<String, BigDecimal> {

	@Override
	public BigDecimal unmarshal(String value) throws Exception {
		double parseDouble = Double.parseDouble(value);
		return BigDecimal.valueOf(parseDouble);
	}

	@Override
	public String marshal(BigDecimal v) throws Exception {
		return null;
	}
}
