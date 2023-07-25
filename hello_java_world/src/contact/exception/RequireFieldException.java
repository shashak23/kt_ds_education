package contact.exception;

// 사용자 예외 처리 만들기
public class RequireFieldException extends RuntimeException{

	public RequireFieldException(String message) {
		super(message);
	}
}
