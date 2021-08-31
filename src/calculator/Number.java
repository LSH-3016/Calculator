package calculator;

import error.NumberError;

public class Number implements Validity{
	
	private final int number;
	
	public Number(String data) {
		doValidation(data);
		this.number = parseInt(data);
	}

	@Override
	public void doValidation(String data) {
		try{
			parseInt(data);
		} catch(NumberFormatException e) {
			new NumberError().outputErrorMessage();
		}
	}
	
	private int parseInt(String data) {
		return Integer.parseInt(data);
	}
	
	public int getNumber() {
		return this.number;
	}
}
