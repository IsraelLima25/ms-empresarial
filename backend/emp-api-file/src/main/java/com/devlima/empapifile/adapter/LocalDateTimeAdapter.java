package com.devlima.empapifile.adapter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

	private DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	@Override
	public String marshal(LocalDateTime dateTime) {
		return "";
	}

	@Override
	public LocalDateTime unmarshal(String dateTime) {

		Instant instant = Instant.parse(dateTime);
		LocalDateTime localDateTimeParse = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		localDateTimeParse.format(dateFormat);
		return localDateTimeParse;
	}
}
