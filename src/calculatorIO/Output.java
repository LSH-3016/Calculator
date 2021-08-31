package calculatorIO;

import calculator.Calculator;

public class Output {
	private final String OUTPUT_MESSAGE = "계산 결과 : ";
	
	public Output(Calculator caculator) {
		System.out.println(OUTPUT_MESSAGE + caculator.getResult());
	}
}