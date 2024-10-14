package com.ait.in;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class NewDateDemo {
	public static void main(String[] args) throws Exception {
		LocalDate of = LocalDate.of(2022, 9, 18);
		System.out.println(of);
		LocalDate date = LocalDate.now();
		System.out.println(date);
		date = date.plusDays(5);
		System.out.println(date);
		date = date.plusMonths(2);
		System.out.println(date);
		date = date.plusYears(2);
		System.out.println(date);
		date = date.plusWeeks(3);
		System.out.println(date);
		boolean leapYear = LocalDate.parse("2024-10-14").isLeapYear();
		System.out.println("LeapYear =" + leapYear);
		LocalTime time = LocalTime.now();
		System.out.println(time);
		time = time.plusHours(2);
		System.out.println(time);
		LocalDateTime DT = LocalDateTime.now();
		System.out.println(DT);
		Period between = Period.between(LocalDate.parse("2002-06-15"), LocalDate.now());
		System.out.println(between);
		Duration between2 = Duration.between(LocalTime.parse("13:00"), LocalTime.now());
		System.out.println(between2);
	}

}
