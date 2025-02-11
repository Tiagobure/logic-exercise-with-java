package application;

public class Program {

	public static void main(String[] args) {

		int a = (int) (Math.random() *2) ; // math is double parse for int
		int b = (int) (Math.random() *4);

		int c = 1;

		if ((a + b )< c) {
			int d = a + b;
			System.out.println("SUM: " + d + " less than " + c);
		} else {
			System.out.println("sum greater than " + c);

		}

	}

}
