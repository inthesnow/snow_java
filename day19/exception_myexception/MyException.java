package exception_myexception;

public class MyException extends Exception {
	//사용자 정의 예외는 exception클래스를 상속 받아서 예외클래스로 사용합니다.
	//일반적으로 기본 생성자, 예외메세지를 받아서 저장해주는 생성자 2개를 만듭니다.
	
	public MyException() {
	}
	
	public MyException(String message) {
		super(message);
	}
	//필요한 사용자 정의 메서드 ----

}
