package ex03_for;

public class Ex02_multi_for {
	public static void main(String[] args) {
		//for문 안에 또 다른 for문을 사용하는 경우
		//반복문을 반복하는 것
		//for(초기식;조건식;증감식;){
		//	for(초기식;조건식;증감식;){
		//		반복하고자 하는 명령
		//	}
		//}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(i+" "+j);
			}
		}
		
		// A B C D
		// E F G H
		// I J K L
		char ch='A';
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		
		//---------------------------------------------------
		
		//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는
		//모든 경우의 수를 출력하는 프로그램을 작성하시오.
		//1,5 / 2,4 / 3,3 / 4,2 / 5,1
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.printf("%d,%d\n",i,j);
				}
			}
		}
		
		
	}
}
