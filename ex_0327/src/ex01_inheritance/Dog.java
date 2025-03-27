package ex01_inheritance;

public class Dog extends Animal{
	String smell = "냄새를 잘 맡는다";
	
	@Override
	public void info() {
		System.out.println("---강아지---");
		super.info(); //부모클래스에 있는 info()메서드를 호출
		System.out.println("강아지의 특징 : " + smell);
	}
}
