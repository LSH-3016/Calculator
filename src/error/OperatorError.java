package error;

public class OperatorError implements catchError{

	private final String ERROR_MESSAGE = "�߸��� �����ڸ� �Է��ϼ̽��ϴ�.";
	
	@Override
	public void outputErrorMessage() {
		System.out.println(ERROR_MESSAGE);
	}

}
