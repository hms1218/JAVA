package ex01_inheritance;

public class Chiwawa extends Dog{
	String angry = "치와와는 참지 않지";
	
	@Override
	public void info() {
		super.info(); //부모클래스에 있는 info()메서드를 호출
		System.out.println("치와와의 특징 : " + angry);
	}
}
