package com.ait.in;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
		String format = sdf.format(d);
		System.out.println(format);
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedate = sdf1.parse("2024-10-14");
		System.out.println(parsedate);
	}

}
