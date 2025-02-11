package application;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("insert one number: ");
		int number = sc.nextInt();
		
		if(number < 0) {
			System.out.print("Number nagative, ");
		}else {
			System.out.print("number positive, ");
		}
		if(number%2 ==  0) {
			System.out.print("even number!! ");

		}else {
			System.out.print("odd number!! ");
			
		}
		sc.close();
	}

}
