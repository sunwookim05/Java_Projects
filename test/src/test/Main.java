package test;

import java.util.Scanner;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		
		boolean loop = true;
		double a, b, result;
		char c;
		
		scan = new Scanner(System.in);
		
		while (loop) {
			a = scan.nextDouble();
			c = scan.next().charAt(0);
			b = scan.nextDouble();
			
			result = Calculation.comparison(a, b, c);

			System.out.println(a + " " + c + " " + b + " = " + result);
			
			loop = loopRequest();
		}
	}

	private static boolean loopRequest() {
		System.out.print("Would you like to do it again? (Y Or N) ");
		
		char i = scan.next().charAt(0);
		
		if(i == 'N' || i == 'n') {
			return false;
		}else {
			return true;
		}
	}
}
