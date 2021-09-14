package test.stringCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practice.stringCalculator.StringCalculator;

public class StringCalculatorTest {

	public static void main(String[] args) {
		
		org.junit.runner.JUnitCore.main("test.stringCalculator.StringCalculatorTest");

	}
	
	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	@Test
	public void testOneNumber() {
		assertEquals(1, StringCalculator.add("1"));
	}

}
