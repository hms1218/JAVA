package ex02_break;

public class Ex02_break {
	public static void main(String[] args) {
		//break문은 switch를 할 때 나왔던 구문으로
		//case를 종료할 때 사용
		//반복문이 진행되는 도중, 특정 조건을 만족해
		//더 이상 반복문을 실행할 필요 없이 종료하려고 할 때 사용한다.
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int s = 0;
		while(s < 10) {
			if(s==5) {
				break;
			}
			System.out.print(s+" ");
			s++;
		}
		
		System.out.println();
		
		//break, continue와 같은 기타제어문들은
		//반복문 안에서만 사용할 수 있다.(반복문 안에있는 조건문)
		
		//기타제어문 밑에는 코드가 올 수 없다.
		
		
		
		
		
		
		
		
		
		
		
	}
}
