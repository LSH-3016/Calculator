package calculator;

import error.OperatorError;

public class Operator implements Validity {

	private final char operator;

	private final char PLUS = '+';
	private final char MINUS = '-';

	public Operator(String data) {
		doValidation(data);
		this.operator = parseChar(data);
	}

	@Override
	public void doValidation(String data) {
		try {
			if (parseChar(data) == PLUS || parseChar(data) == MINUS) {
				return;
			}
			throw new Exception();
		} catch (Exception e) {
			new OperatorError().outputErrorMessage();
		}
	}

	private char parseChar(String data) {
		return data.charAt(0);
	}

	public char getOperator() {
		return this.operator;
	}
}