package com.ait.in;

import java.util.Optional;
import java.util.Scanner;

public class OptionalClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id ::");
		int userid = sc.nextInt();
		User u = new User();
		Optional<String> username = u.getUserName(userid);
		if (username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase() + ", Hello");
		} else {
			System.out.println("Data not found ....");
		}

	}

}
