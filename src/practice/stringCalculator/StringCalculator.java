package practice.stringCalculator;

public class StringCalculator {
	
	public static int  add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}else {
			String delimiter = ",";
			String[] numbersArray = splitNumbers(numbers, delimiter+"|\n");
			
			return sum(numbersArray);
		}
		

	}
	
	public static String[] splitNumbers(String numbers, String delimiter) {
		return numbers.split(delimiter);
	}
	
	
	public static int sum(String[] numbers) {
		int sum = 0;
		for(String num:numbers) {
			int numInteger = Integer.parseInt(num);
			sum = sum + numInteger;
		}
		
		return sum;
	}
}
