package application;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		Double minimum = 1518.00;
		System.out.print("you wage: ");
		Double salary = sc.nextDouble();

		double quantity = salary / minimum;

		System.out.printf("You salary %.2f", quantity);
		sc.close();

	}

}
