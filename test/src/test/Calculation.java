package test;

public class Calculation {
	private static double plus(double a, double b) {return a + b;}
	private static double minus(double a, double b) {return a - b;}
	private static double multiply(double a, double b) {return a * b;}
	private static double division(double a, double b) {return a / b;}
	
	public static double comparison(double a, double b, char c) {
		switch (c) {
		case '+':return Calculation.plus(a, b);
		case '-':return Calculation.minus(a, b);
		case '*':return Calculation.multiply(a, b);
		case '/':return Calculation.division(a, b);
		default:return 0;
		}
	}
}
