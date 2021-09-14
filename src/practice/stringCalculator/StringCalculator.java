package practice.stringCalculator;

public class StringCalculator {
	
	public static int  add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}
		else {
			String delimiter = ",";
			if(numbers.matches("//(.*)\n(.*)")) {
				//delimiter=Character.toString(numbers.charAt(2));
				delimiter = numbers.substring(2,numbers.indexOf("\n"));
				numbers = numbers.substring(numbers.indexOf("\n")+1);
			}
			
			String[] numbersArray = splitNumbers(numbers, delimiter+"|\n");
		
			return sum(numbersArray);
		}
	}
	
	public static String[] splitNumbers(String numbers, String delimiter) {
		return numbers.split(delimiter);
	}
	
	
	public static int sum(String[] numbers) {
		int sum = 0;
		String negNumbers = "";
		for(String num:numbers) {
			int numInteger = Integer.parseInt(num);
			
			if(numInteger < 0) {
				if(negNumbers.equals("")) {
					negNumbers = num;
				}
				else {
					negNumbers = negNumbers + "," + num;
					//System.out.println(negNumbers);
				}
			}
			
			sum = sum+numInteger;
		}
		
		if(!negNumbers.equals("")) {
			throw new IllegalArgumentException("Negatives not allowed: "+negNumbers);
		}
			
		return sum;
	}

}
