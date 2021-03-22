package com.devlima.empapifile.adapter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {

	private DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	@Override
	public String marshal(LocalDate dateTime) {
		return "";
	}

	@Override
	public LocalDate unmarshal(String dateTime) {

		LocalDate parseLocalDate = LocalDate.parse(dateTime, dateFormat);
		return parseLocalDate;
	}

}
