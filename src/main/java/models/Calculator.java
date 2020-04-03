package models;

public class Calculator {

	public static int add(int factor1, int factor2) {
		int sum;
		
		sum = factor1 + factor2;
		
		return sum;
	}
	
	public static int subtract(int factor1, int factor2) {
		int difference;
		
		difference = factor1 - factor2;
		
		return difference;
	}
	
	public static int multiply(int factor1, int factor2) {
		int product;
		
		product = factor1 * factor2;
		
		return product;
	}
	
	public static float divide(float factor1, float factor2) {
		float quotient;
		
		quotient = factor1 / factor2;
		
		return quotient;
	}
}
