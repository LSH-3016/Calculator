package output;

import calculator.Calculator;

public class Output {
	private final String OUTPUT_MESSAGE = "��� ��� : ";
	
	public void outputData(Calculator caculator) {
		System.out.println(OUTPUT_MESSAGE + caculator.getResult());
	}
}
