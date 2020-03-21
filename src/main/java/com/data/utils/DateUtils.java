package com.data.utils;

import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateUtils {

	public static Date dateFormatter(String dateString){
		return new Date(getDateTimeFormatter().parseMillis(dateString));
	}
	
	public static DateTimeFormatter getDateTimeFormatter() {
		return DateTimeFormat.forPattern("MM/dd/yyyy");
	}
	
	public static String adding24Hours(String dateString) {
		DateTime dateTime = new DateTime(getDateTimeFormatter().parseMillis(dateString)).plusHours(24);
		return getDateTimeFormatter().print(dateTime);
	}
	
	public static Boolean isWeekend(String date){
		DateTime dateTime = new DateTime(getDateTimeFormatter().parseMillis(date));
		if(dateTime.getDayOfWeek() == 1 || dateTime.getDayOfWeek() == 7 ) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
	
}
