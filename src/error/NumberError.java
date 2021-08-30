package error;

public class NumberError implements catchError{
	
	private final String ERROR_MESSAGE = "잘못된 숫자를 입력하셨습니다.";

	@Override
	public void outputErrorMessage() {
		System.out.println(ERROR_MESSAGE);
	}
}