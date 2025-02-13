package application;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("****Grades****");
		System.out.println();
		System.out.print("Grade 1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		double nota2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		double nota3 = sc.nextDouble();

		double average = (nota1 + nota2 + nota3) / 3;
		System.out.printf("average grades: %.2f",  average);

	}

}
