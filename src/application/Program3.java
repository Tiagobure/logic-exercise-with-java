package application;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("insert one number: ");
		int numb1 = sc.nextInt();
		System.out.print("insert second number: ");
		int numb2 = sc.nextInt();
		int c;

		if (numb1 == numb2) {
			c = numb1 + numb2;
			System.out.print("Sum " + c);

		} else {
			c = numb1 * numb2;
			System.out.print("multiplication " + c);

		}
	}

}
