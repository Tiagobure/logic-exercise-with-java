package application;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double value = 7;

		double tax = value + ((value / 100) * 5);
		System.out.println(tax);
	}

}
