package ex02_dataType;

public class Ex01_dataType {
	public static void main(String[] args) {
		//자료형(기본자료형)
		//자바가 처리할 수 있는 데이터의 종류
		//논리형  boolean 1bit	true, false
		//문자형  char    2byte
		//정수형  byte	1byte	-128 ~ 127
		//	    short   2byte	-32,768 ~ 32,767
		//	    int 	4byte	-21,4748,3648 ~ 21,4748,3647(21억)
		//	    long	8byte	-900경 ~ 900경
		//실수형 	float	4byte
		//		double	8byte
		
		//float
		//메모리를 덜 사용하면서 소수점을 포함한 숫자를 다룰 때 적합
		//하지만 정확도가 제한적이기 때문에 금융 계산이나 높은 정밀도가 필요한 작업에 부적합하다.
		
		//double
		//훨씬 더 넓은 범위와 높은 정확도를 제공
		//과학적 계산, 통계, 시뮬레이션 등에서 사용
		
		//정수형을 쓸 때 주의점
		//자료형이 표현할 수 있는 범위를 벗어난 데이터를 저장하면 
		//오버플로우가 발생해 전혀 다른 값이 저장될 수 있다.
		
		//오버플로우(overflow)
		//자료형이 표현할 수 있는 최대 범위보다 큰 수를 저장할 때 
		//발생하는 현상으로 잘못된 결과를 얻을 수 있다.
		
		//언더플로우
		//자료형이 표현할 수 있는 최소 범위보다 작은 수를 저장할 때
		//발생하는 현상
		
		//문자형과 문자열
		//문자형(char)
		//한글자 짜리 데이터 ''안에 사용
		//문자열(String)
		//문자들의 나열 ""안에 사용
		
		//참조자료형
		//메모리상에 데이터가 저장된 주소를 저장하기 위한 공간
		//대표적으로는 문자열을 저장하는 String이 있다.
		//개발자가 직접 만들어 추가할 수 있는 자료형이기 때문에
		//그 수가 정해져있지는 않다.
		
		System.out.println("hello world");
		System.out.println(100);
		System.out.println("100");
		System.out.println(true);
		System.out.println(5+10+":"+5+10);
		System.out.println("3+2="+(3+2));
		
		
		
		
		
		
		
		
		
	}
}
