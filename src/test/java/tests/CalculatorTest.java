package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Calculator;

class CalculatorTest {

	@Test
	public void additionTest() {
		
		int factor1 = 5;
		int factor2 = 10;
		
		int expectedResult = 15;
		
		int actualResult = Calculator.add(factor1, factor2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void subtractionTest() { 
		
		int factor1 = 5;
		int factor2 = 10;
		
		int expectedResult = -5;
		
		int actualResult = Calculator.subtract(factor1, factor2);
		
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void multiplicationTest() { 
		
		int factor1 = 5;
		int factor2 = 10;
		
		int expectedResult = 50;
		
		int actualResult = Calculator.multiply(factor1, factor2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void divisionTest() { 
		
		int factor1 = 5;
		int factor2 = 10;
		
		float expectedResult = (float) 0.5;
		
		float actualResult = Calculator.divide(factor1, factor2);
		
		assertEquals(expectedResult, actualResult);
	}
}
