package ex05_Generic;

public class GenericExam {
	//Gen클래스를 만들어 제네릭타입 T를 가지고
	//printArr메서드를 생성한다.
	//printArr메서드 내부에서 배열을 순차적으로 출력하는 코드를 작성
	//main에서 Integer, Double, Character 배열을 각각 만든 뒤
	//Gen클래스의 printArr메서드를 각각 호출하여 배열의 내용을 출력하자.
	//결과
	//1 2 3 4 5
	//1.1 2.2 3.3 4.4 5.5
	//A B C D E
	public static void main(String[] args) {
		Integer[] iArr = {1,2,3,4,5};
		Double[] dArr = {1.1,2.2,3.3,4.4,5.5};
		Character[] cArr = {'A','B','C','D','E'};
		
//		Gen<Integer> i = new Gen<>();
//		Gen<Double> d = new Gen<>();
//		Gen<Character> c = new Gen<>();
		
//		i.printArr(iArr);
//		d.printArr(dArr);
//		c.printArr(cArr);
		
		Gen a = new Gen();
		
		//컴파일러가 전달된 인자의 타입을 보고 타입을 추론한다.
		a.printArr(iArr);
		a.printArr(dArr);
		a.printArr(cArr);
		
		//타입의 명시
		a.<Integer>printArr(iArr);
		a.<Double>printArr(dArr);
		a.<Character>printArr(cArr);
		
		
	}
}
