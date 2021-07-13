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
	
	public static void main(String[] args) {
		
		/*		 �� �Է� ����		*/
		String input = input();
		
		/*		����� ����		*/
		String temp[] = input.split(" "); //���ø��ؼ� temp�� ����
		
		/*		���ڿ� ������ ����	*/
		ArrayList num = new ArrayList();
		ArrayList oper = new ArrayList();
		
		for(int i = 0; i < temp.length; i++) {
			if (div(temp[i]).equals("oper")) { // �ش� ���� oper��� �Ǹ��� oper����Ʈ�� ����
				oper.add(temp[i]);
			}
			else if (div(temp[i]).equals("num")) { // �ش� ���� oper���� ���̶�� num���� �Ǹ��Ͽ� num�� ����
				num.add(temp[i]);
			}
		}
		
		/* 			�� ���		*/
		try { // ���� �̿��� ���� �Ÿ��� ���� try���
			int result = (Integer.parseInt((String) num.get(0))); // ù��° ���ڷ� �ʱⰪ ����
			
			for(int i = 0; i < oper.size(); i++){
				result = cal((oper.get(i)).toString(), Integer.parseInt((num.get(i + 1)).toString()), result);
			}
			
		/*			��� ���		*/
			System.out.print("��� : " + result);
			
		} catch (Exception e) { // catch�� �̿��Ͽ� ���� �̿��� ���� ���޵Ǹ� ���� ǥ��
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
			e.getStackTrace();
		}
		
	}
	
	public static String input() { // �� �Է¹޴� �޼ҵ�
		String str = new String();
		Scanner scan = new Scanner(System.in);
		System.out.print("�Է� : ");
		str = scan.nextLine();
		return str;
	}
	
	public static String div(String tmp) { // �����ڿ� ���ڸ� �����ϴ� �޼ҵ�
		if(tmp.equals("+") || tmp.equals("-") || tmp.equals("*") || tmp.equals("/")) {
			return "oper"; // �����ڸ� oper�� ��ȯ
		}
		else {
			return "num"; // �����ڿ� ���� ��� num���� ��ȯ
		}
	}

	public static int cal (String oper, int num, int result) { // �����ڿ� ���� ����� ���� �޼ҵ�
		switch(oper) {
		case "+": // +�϶� ó��
			return result + num;
		case "-": // -�ϋ� ó��
			return result - num;
		}
		return -99999;
	}
}
