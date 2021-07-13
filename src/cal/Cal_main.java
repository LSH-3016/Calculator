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

public class Cal_main {
	
	public static void main(String[] args) {
		
		/*		 식 입력 받음		*/
		String input = input();
		
		/*		띄어쓰기로 구분		*/
		String temp[] = input.split(" "); //스플릿해서 temp에 저장
		
		/*		숫자와 연산자 구분	*/
		ArrayList num = new ArrayList();
		ArrayList oper = new ArrayList();
		
		for(int i = 0; i < temp.length; i++) {
			if (div(temp[i]).equals("oper")) { // 해당 값이 oper라고 판명나면 oper리스트에 저장
				oper.add(temp[i]);
			}
			else if (div(temp[i]).equals("num")) { // 해당 값이 oper외의 값이라면 num으로 판명하여 num에 저장
				num.add(temp[i]);
			}
		}
		
		/* 			식 계산		*/
		try { // 숫자 이외의 값을 거르기 위해 try사용
			int result = (Integer.parseInt((String) num.get(0))); // 첫번째 숫자로 초기값 설정
			
			for(int i = 0; i < oper.size(); i++){
				result = cal((oper.get(i)).toString(), Integer.parseInt((num.get(i + 1)).toString()), result);
			}
			
		/*			결과 출력		*/
			System.out.print("결과 : " + result);
			
		} catch (Exception e) { // catch를 이용하여 숫자 이외의 값이 전달되면 오류 표시
			System.out.println("잘못된 값을 입력하셨습니다.");
			e.getStackTrace();
		}
		
	}
	
	public static String input() { // 값 입력받는 메소드
		String str = new String();
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		str = scan.nextLine();
		return str;
	}
	
	public static String div(String tmp) { // 연산자와 숫자를 구분하는 메소드
		if(tmp.equals("+") || tmp.equals("-") || tmp.equals("*") || tmp.equals("/")) {
			return "oper"; // 연산자면 oper를 반환
		}
		else {
			return "num"; // 연산자외 값은 모두 num으로 반환
		}
	}

	public static int cal (String oper, int num, int result) { // 연산자에 따른 계산을 위한 메소드
		switch(oper) {
		case "+": // +일때 처리
			return result + num;
		case "-": // -일떄 처리
			return result - num;
		}
		return -99999;
	}
}
