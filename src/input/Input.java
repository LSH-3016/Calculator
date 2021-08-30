package input;

import java.util.Scanner;
import calculator.Calculator;

public class Input {
	private final String INPUT_MESSAGE = "식을 입력 해주세요 : ";
	private final Scanner SCANNER = new Scanner(System.in);
	private final String SEPERATOR = " ";
	
	public void inputData(Calculator calculator) {
		System.out.print(INPUT_MESSAGE);
		String splitedData[] = doSplit(SCANNER.nextLine());
		for(String repeat : splitedData) { 
			if (isNumber(repeat) == true) {
				calculator.number.add(Integer.parseInt(repeat));
			}
			if (isNumber(repeat) == false) {
				calculator.operator.add(repeat);
			}
		}
	}
	
	private String[] doSplit(String data) {
		return data.split(SEPERATOR);
	}
	
	private boolean isNumber(String data) {
		try{
			Integer.parseInt(data);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
}
