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
	
	@Test
	public void testTwoNumbers() {
		assertEquals(10, StringCalculator.add("7,3"));
	}
	
	@Test
	public void testMultipleNumbers() {
		assertEquals(10, StringCalculator.add("1,2,3,4"));
	}
	
	@Test
	public void testNewLine() {
		assertEquals(6, StringCalculator.add("1\n2,3"));
	}
	
	@Test
	public void testDifferentDelimiter() {
		assertEquals(3, StringCalculator.add("//;\n1;2"));
	}
	
	@Test
	public void testNegatives() {
		try {
			StringCalculator.add("-10,22");
		}catch (IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Negatives not allowed: -10");;
		}
		
		try {
			StringCalculator.add("-12,-4,5,6,-15");
		}catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(), "Negatives not allowed: -12,-4,-15");
		}
	}
	
	@Test
	public void testNumberAbove1000() {
		assertEquals(5, StringCalculator.add("5,1001"));
	}
	
	
	@Test
	public void testDelimitersOfLength() {
		assertEquals(6, StringCalculator.add("//;;;\n1;;;2;;;3"));
	}
	

}
