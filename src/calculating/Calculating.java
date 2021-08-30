package calculating;

import calculator.Calculator;

public class Calculating {

	private final char PLUS = '+';
	private final char MINUS = '-';
	private final String ERROR_MESSAGE = "잘못된 값을 입력하셨습니다.";

	public void doCalculating(Calculator calculator) {
		calculator.setResult(calculator.number.poll()); // 첫 숫자값으로 초기값 설정
		while (!calculator.operator.isEmpty()) {
			checkingOperator(calculator, calculator.operator.poll());
		}
	}

	private void checkingOperator(Calculator calculator, String operator) {
		try {
			if ((operator.charAt(0)) == PLUS) {
				doPlus(calculator);
			}
			if ((operator.charAt(0)) == MINUS) {
				doSubtraction(calculator);
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println(ERROR_MESSAGE);
		}
	}
	
	private void doPlus(Calculator calculator) {
		calculator.setResult(calculator.result + calculator.number.poll());
	}

	private void doSubtraction(Calculator calculator) {
		calculator.setResult(calculator.result - calculator.number.poll());
	}
}
