package calculating;

import calculator.Calculator;

public class Calculating {

	private final char PLUS = '+';
	private final char MINUS = '-';
	private final String ERROR_MESSAGE = "�߸��� ���� �Է��ϼ̽��ϴ�.";

	public void doCalculating(Calculator calculator) {
		calculator.setResult(calculator.number.poll()); // ù ���ڰ����� �ʱⰪ ����
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
