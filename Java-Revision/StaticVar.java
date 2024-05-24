package com.ex;

public class StaticVar {

	final static int val = 0; // constant

	static int x; // static

	public static int checkEvenOdd() {
		x = 4;
		x = 2;
		x = 0; // x is updated to 0

		if (x == val) {
			System.out.println("condition Fail");
		}

		else if (x % 2 == 0) {
			System.out.print(" is even number");
		} else {
			System.out.println(" is not even number");
		}
		return x;
	}

	public static void main(String[] args) {

		checkEvenOdd();
	}

}
