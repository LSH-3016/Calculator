package calculating;

import calculator.Calculator;
import calculator.Operator;
import calculator.Number;

public class Calculating {

	private final char PLUS = '+';
	private final char MINUS = '-';

	public void doCalculating(Calculator calculator) {
		calculator.setResult(calculator.pollNumber().getNumber()); // 첫 숫자값으로 초기값 설정
		while (!calculator.operator.isEmpty()) {
			checkingOperator(calculator, calculator.pollOperator());
		}
	}

	private void checkingOperator(Calculator calculator, Operator operator) {
			if (operator.getOperator() == PLUS) {
				doPlus(calculator, calculator.pollNumber());
			}
			if ((operator.getOperator()) == MINUS) {
				doSubtraction(calculator, calculator.pollNumber());
			}
	}
	
	private void doPlus(Calculator calculator, Number number) {
		calculator.setResult(calculator.getResult() + number.getNumber());
	}

	private void doSubtraction(Calculator calculator, Number number) {
		calculator.setResult(calculator.getResult() - number.getNumber());
	}
}
