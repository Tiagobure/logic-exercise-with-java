package application;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		boolean a = false;
		boolean b = false;

		if (a == b) {
			System.out.print("are the same values: ");
			if (a == false) {
				System.out.println("False.");

			} else {
				System.out.println("True ");

			}
		} else {

			System.out.print("different values ");

		}
	}

}
