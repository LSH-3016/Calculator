package calculatorIO;

import calculator.Calculator;

public class Output {
	private final String OUTPUT_MESSAGE = "��� ��� : ";
	
	public Output(Calculator caculator) {
		System.out.println(OUTPUT_MESSAGE + caculator.getResult());
	}
}