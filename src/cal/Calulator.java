/*

 ���� �����
 ���� : 	���ٷ� ���� �Է¹ް�, �� ���� ����� ����
 	  	������ ���ʴ�� ��� �� ����� ����
 �Է¿��� : 3 + 10 - 6
 ���� ��� : 7

*/


package cal;

import java.util.ArrayList;
import java.util.Scanner;

public class Calulator {
	
	private static final String INPUT_MESSAGE = "���� �Է� ���ּ��� : ";
	private static final String OUTPUT_MESSAGE = "��� ��� : ";
	private static final String ERROR_MESSAGE = "�߸��� ���� �Է��ϼ̽��ϴ�.";
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
		
		/*		 �� �Է� ����		*/
		String input = Input();
		
		/*		����� ����		*/
		String splited[] = split(input); //���ø��ؼ� ����
		
		/*		���ڿ� ������ ����	*/
		for (String repeat : splited) {
			addData(repeat);
		}
		
		/* 			�� ���		*/
		RESULT = parseInt(number.get(0)); // number�� ù��°������ ����� �ʱ⼳��
		for (int i = 0; i < operator.size(); i++) {
			Caculating(operator.get(i),parseInt(number.get(i+1)));
		}
		
		Output();
		
	}
	
	public static String Input() { // �� �Է¹޴� �޼ҵ�
		System.out.print(INPUT_MESSAGE);
		return scanner.nextLine();
	}
	
	public static String[] split(String expression) { // ������ ���� �������� ���ڿ��� �߶� ��ȯ�ϴ� �޼ҵ�
		return expression.split(SPERATOR);
	}
	
	public static void addData(String splited) {
		if(isNumber(splited) == true)
			number.add(splited);
		else
			operator.add(splited);
	}
	
	public static boolean isNumber(String splited) { // �����ڿ� ���ڸ� �����ϴ� �޼ҵ�
		try{
			Integer.parseInt(splited);
			return true;
		} catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static int parseInt(String string) { // ���ڿ�->���� ����ȭ �޼ҵ�
		return Integer.parseInt(string);
	}

	public static void Caculating (String oper, int num) { // �����ڿ� ���� ����� ���� �޼ҵ�
		try{
			if(oper.equals(PLUS)) // +�� ���ϱ� ����
		
			doPlus(num);
		else if (oper.equals(SUBTRACTION)) // -�� ���� ����
			doSubtraction(num);
		} catch(Exception e) {
			e.getStackTrace();
			System.out.println(ERROR_MESSAGE);
		}
	}
	
	public static void doPlus(int num) { // ���ϱ� �����ϴ� �޼ҵ�
		RESULT += num;
	}
	
	public static void doSubtraction(int num) { // ���� �����ϴ� �޼ҵ�
		RESULT -= num;
	}
	
	public static void Output() { // ��� ��� �޼ҵ�
		System.out.print(OUTPUT_MESSAGE + RESULT);
	}
}
