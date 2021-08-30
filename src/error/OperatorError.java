package error;

public class OperatorError implements catchError{

	private final String ERROR_MESSAGE = "잘못된 연산자를 입력하셨습니다.";
	
	@Override
	public void outputErrorMessage() {
		System.out.println(ERROR_MESSAGE);
	}

}
