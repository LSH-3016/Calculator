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

public class Cal_main {
	
	private static final String INPUT_MESSAGE = "���� �Է� ���ּ��� : ";
	private static final String OUTPUT_MESSAGE = "��� ��� : ";
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
		for (int i = 0; i < splited.length; i++) {
			addData(splited[i]);
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
	
	public static int parseInt(String string) {
		return Integer.parseInt(string);
	}

	public static void Caculating (String oper, int num) { // �����ڿ� ���� ����� ���� �޼ҵ�
		if(oper.equals(PLUS))
			doPlus(num);
		else if (oper.equals(SUBTRACTION))
			doSubtraction(num);
	}
	
	public static void doPlus(int num) {
		RESULT += num;
	}
	
	public static void doSubtraction(int num) {
		RESULT -= num;
	}
	
	public static void Output() {
		System.out.print(OUTPUT_MESSAGE + RESULT);
	}
}
