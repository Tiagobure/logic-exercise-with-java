package application;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
 
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		System.out.print("Student Name: ");
        String name = sc.nextLine(); 
        System.out.println();
		
        System.out.println("****Grades****");
		System.out.println();
		System.out.print("Grade 1: ");
		double nota1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		double nota2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		double nota3 = sc.nextDouble();
		System.out.print("Grade 4: ");
		double nota4 = sc.nextDouble();
		
		double average = (nota1 + nota2 + nota3+ nota4) / 4;
		
		if(average >= 7) {
			System.out.printf("%s approved grade %.2f.", name,average);
			
		}else {
			System.out.printf("%s disapproved, grade %.2f.", name,average);
			
		}
	
	}

}
