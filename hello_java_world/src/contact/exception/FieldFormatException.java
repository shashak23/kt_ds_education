package contact.exception;

// 사용자 예외 처리 만들기 2
public class FieldFormatException extends RuntimeException{

	public FieldFormatException(String message) {
		super(message);
	}
}
