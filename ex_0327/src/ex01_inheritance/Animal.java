package ex01_inheritance;

public class Animal {
	//공통적으로 가지고 있는 성질
	int eyes = 2;
	int legs = 4;

	public void info() {
		System.out.println("눈의 개수 : " + eyes);
		System.out.println("다리의 개수 : " + legs);
	}
	
}
