package application;

import java.util.Locale;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		
		System.out.println("-------------IMC------------");
		System.out.println();
		
		
		System.out.print("Your weight in kg:");
		double kg = sc.nextDouble();
		System.out.print("Your height in meters: ");
		double altura = sc.nextDouble();
		
		double imc = kg/(altura*altura);
		
		
		
		if(imc <= 18.5) {
			System.out.printf("Underweight: %.1f",imc);
		}else if(imc <=24.9) {
			System.out.printf("Ideal weight (congratulations): %.1f",imc);
		}else if(imc <=29.9) {
			System.out.printf("Slightly overweight: %.1f",imc);
		}else if(imc <= 34.9) {
			System.out.printf("Grade I obesity: %.1f",imc);
		}else if(imc <=39.9) {
			System.out.printf("Grade II obesity (severe): %.1f",imc);
		}else {
			System.out.printf("Grade III obesity (morbid): %.1f",imc);
		}
		
		
		
		
		
		
		
		
		/*Abaixo de 18,5   | Abaixo do peso          

 Entre 18,6 e 24,9 | Peso ideal (parabéns)  

 Entre 25,0 e 29,9 | Levemente acima do peso

 Entre 30,0 e 34,9 | Obesidade grau I 

 Entre 35,0 e 39,9 | Obesidade grau II (severa)

 Maior ou igual a 40 | Obesidade grau III (mórbida)*/
		
		
		
		
	}

}
