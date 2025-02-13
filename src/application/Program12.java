package application;

import java.util.Locale;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Product: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		System.out.println("<<<<<< PAYMENT METHOD >>>>>>");

		double priceEnd = Payment(price);

		System.out.println("<<<<<< FINAL VALUE >>>>>>");
		System.out.println(Product(name, priceEnd));
	}

	static String Product(String Name, Double price) {

		return "Product " + Name + ", Price " + String.format("%.2f",price);
	}

	static double Payment(Double amount) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("type 1 -  Pay in cash or Pix, get a 15% discount ");
		System.out.println("type 2 -  Pay in cash on credit card, get a 10% discount ");
		System.out.println("type 3 -  Pay in two installments on card, normal "
				+ "price of the product without interest ");
		System.out.println("type 4 -  Pay in three or more installments on card, "
				+ "normal price of the product plus 10% interest ");

		System.out.println();
		System.out.print("Choose a number: ");
		int type = sc.nextInt();

		if (type == 1) {
			amount -= ((amount / 100) * 15);
		} else if (type == 2) {
			amount -= ((amount / 100) * 10);
		} else if (type == 3) {
			amount = amount - 0;
		} else if (type == 4) {
			amount += ((amount / 100) * 10);
		}

		return amount;

	}
}
