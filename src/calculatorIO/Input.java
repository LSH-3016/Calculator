package calculatorIO;

import java.util.Scanner;
import calculator.Calculator;
import calculator.Number;
import calculator.Operator;

public class Input {
	private final String INPUT_MESSAGE = "식을 입력 해주세요 : ";
	private final Scanner SCANNER = new Scanner(System.in);
	private final String SEPERATOR = " ";
	
	public Input(Calculator calculator) {
		String splitedData[] = doSplit(inputData());
		for(int i = 0; i < splitedData.length; i++) {
			if (i % 2 == 0) {
				calculator.setNumber(new Number(splitedData[i]));
			}
			if (i % 2 != 0) {
				calculator.setOperator(new Operator(splitedData[i]));
			}
			
		}
	}
	
	private String inputData() {
		System.out.println(INPUT_MESSAGE);
		return SCANNER.nextLine();
	}
	
	private String[] doSplit(String data) {
		return data.split(SEPERATOR);
	}
}
