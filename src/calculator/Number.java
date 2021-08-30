package calculator;

import error.NumberError;

public class Number {
	
	private final int number;
	
	public Number(String data) {
		isNumber(data);
		this.number = parseInt(data);
	}
	
	private void isNumber(String data) {
		try{
			parseInt(data);
		} catch(NumberFormatException e) {
			new NumberError().outputErrorMessage();
		}
	}
	
	private int parseInt(String data) {
		return Integer.parseInt(data);
	}
}
