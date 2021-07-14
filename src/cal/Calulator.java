/*

 계산기 만들기
 조건 : 	한줄로 식을 입력받고, 각 식을 띄어쓰기로 구분
 	  	연산자 차례대로 계산 및 결과값 도출
 입력예시 : 3 + 10 - 6
 예시 결과 : 7

*/


package cal;

import java.util.ArrayList;
import java.util.Scanner;

public class Calulator {
	
	private static final String INPUT_MESSAGE = "식을 입력 해주세요 : ";
	private static final String OUTPUT_MESSAGE = "계산 결과 : ";
	private static final String ERROR_MESSAGE = "잘못된 값을 입력하셨습니다.";
	private static final String SPERATOR = " ";
	private static final Scanner scanner = new Scanner(System.in);
	
	private static final String PLUS = "+";
	private static final String SUBTRACTION = "-";
	private static final String MULTIPLY = "*";
	private static final String DIVISION = "/";
	
	private static ArrayList<String> number = new ArrayList<String>();
	private static ArrayList<String> operator = new ArrayList<String>();
	

	private static int RESULT;
	
	public static void main(String[] args) {
		
		/*		 식 입력 받음		*/
		String input = Input();
		
		/*		띄어쓰기로 구분		*/
		String splited[] = split(input); //스플릿해서 저장
		
		/*		숫자와 연산자 구분	*/
		for (String repeat : splited) {
			addData(repeat);
		}
		
		/* 			식 계산		*/
		RESULT = parseInt(number.get(0)); // number의 첫번째값으로 결과값 초기설정
		for (int i = 0; i < operator.size(); i++) {
			Caculating(operator.get(i),parseInt(number.get(i+1)));
		}
		
		Output();
		
	}
	
	public static String Input() { // 값 입력받는 메소드
		System.out.print(INPUT_MESSAGE);
		return scanner.nextLine();
	}
	
	public static String[] split(String expression) { // 지정된 문자 기준으로 문자열을 잘라 반환하는 메소드
		return expression.split(SPERATOR);
	}
	
	public static void addData(String splited) {
		if(isNumber(splited) == true)
			number.add(splited);
		else
			operator.add(splited);
	}
	
	public static boolean isNumber(String splited) { // 연산자와 숫자를 구분하는 메소드
		try{
			Integer.parseInt(splited);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static int parseInt(String string) { // 문자열->숫자 간략화 메소드
		return Integer.parseInt(string);
	}

	public static void Caculating (String oper, int num) { // 연산자에 따른 계산을 위한 메소드
		try{
			if(oper.equals(PLUS)) // +면 더하기 수행
		
			doPlus(num);
		else if (oper.equals(SUBTRACTION)) // -면 빼기 수행
			doSubtraction(num);
		} catch(Exception e) {
			e.getStackTrace();
			System.out.println(ERROR_MESSAGE);
		}
	}
	
	public static void doPlus(int num) { // 더하기 수행하는 메소드
		RESULT += num;
	}
	
	public static void doSubtraction(int num) { // 빼기 수행하는 메소드
		RESULT -= num;
	}
	
	public static void Output() { // 결과 출력 메소드
		System.out.print(OUTPUT_MESSAGE + RESULT);
	}
}
