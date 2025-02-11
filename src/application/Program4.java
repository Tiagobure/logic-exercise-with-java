package application;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("insert one number: ");
		int number = sc.nextInt();
		
		
		System.out.println("PREVOUS NUMBER (" + (number-1) +") NUMBER AFTER (" +(number+1)+ ")");
			
		sc.close();
		
	}

}
