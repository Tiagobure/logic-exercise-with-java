package application;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int a = 5;
		int b = 7;
		int c = 10;

		if (a == b || a == c || b == c) {
			System.out.println("The values ​​must be different. Try again.");
			return;
		}

		// order
		if (a < b) {
			int temp = a;
			a = b; 
			b = temp; 
		}
		if (a < c) {
			int temp = a;
			a = c;
			c = temp;
		}
		if (b < c) {
			int temp = b;
			b = c;
			c = temp;
		}
        System.out.println("Values ​​in descending order: " + a + ", " + b + ", " + c);

	}

}
