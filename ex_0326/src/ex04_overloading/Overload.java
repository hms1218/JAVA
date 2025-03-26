package ex04_overloading;

public class Overload {
	public void result() {
		System.out.println("인자가 없는 메서드");
	}
	
	//매개변수의 개수가 다른 경우
	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	//매개변수의 개수는 같으나 타입이 다른 경우
	public void result(char ch) {
		System.out.println("문자를 인자로 받는 메서드");
	}
	
	//매개변수가 2개인 경우
	public void result(String s, int n) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");
	}
	
	//매개변수의 순서가 다른 경우
	public void result(int n, String s) {
		System.out.println("정수,문자열을 인자로 받는 메서드");
	}
	
}
