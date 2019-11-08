package com.training.exercise;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {
		// Using Calender
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		Date date = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, -2);
		cal.add(Calendar.DATE, -6);
		Date result = cal.getTime();

		String calDate = df.format(result);
		//

		// Using Timezone
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss Z");
		String zonedDate = ZonedDateTime.now().minusMonths(2).minusDays(6).format(dtf);
		//

	}



	
}
