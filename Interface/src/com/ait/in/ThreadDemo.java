package com.ait.in;
// Approach 1
public class ThreadDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		Thread t = new Thread(td);
		t.start();

	}

}
