package ex02_lamda;

//함수형 인터페이스가 되기 위한 조건
//무조건 추상메서드가 1개여야 합니다.

@FunctionalInterface //어노테이션을 선언한 순간 인터페이스에는 무조건 1개의 추상메서드가 있어야한다. 0개도 2개도 안된다.
public interface MyCalculator {
	int plus(int num1, int num2);
}

//인터페이스 :
//상수 -> 한 번 대입하면 바뀌지 않는 값
//추상메서드 -> 구현체({})가 없는 메서드
//default 메서드 -> default 접근제한자를 가진 완전한 메서드
//만 갖는다.