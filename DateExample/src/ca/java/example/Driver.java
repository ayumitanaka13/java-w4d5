package ca.java.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Driver {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		LocalDate startDay = LocalDate.of(2020, 4, 12);
		System.out.println(startDay);
		
		System.out.println();
		System.out.println(d.getDayOfYear());
		System.out.println(d.getDayOfMonth());
		System.out.println(d.getDayOfWeek());
		System.out.println(d.getMonth());
		System.out.println(d.getMonthValue());
		System.out.println(d.getYear());
		System.out.println(d.isLeapYear());
		System.out.println(d.plusDays(2));
		System.out.println(d.plusMonths(3));
		//there are four options => FULL, LONG, MEDIUM, SHORT
		System.out.println(d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		
		LocalTime t = LocalTime.now();
		System.out.println();
		System.out.println(t);
		LocalTime startTime = LocalTime.of(8, 15, 13);
		System.out.println(startTime);
		System.out.println(t.getHour());
		System.out.println(t.getMinute());
		System.out.println(t.getSecond());
		System.out.println(t.equals(startTime));
		System.out.println(t.isAfter(startTime));
//		System.out.println(d.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));

//		2020-10-30T11:45:09.695923
//		2020-10-30
//		2020-04-12
//
//		304
//		30
//		FRIDAY
//		OCTOBER
//		10
//		2020
//		true
//		2020-11-01
//		2021-01-30
//		2020/10/30
//
//		11:45:09.725440
//		08:15:13
//		11
//		45
//		9
//		false
//		true
	}
}
