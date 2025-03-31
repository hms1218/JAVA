package ex05_Generic;

import java.util.List;

//제네릭에 들어올 수 있는 타입을 숫자로 제한
//<?> : 정확히 타입을 모를 때 사용
//<T> : 정의하는 시점에서 사용
class Calculator<T extends Number>{
	
	//필드에서도 사용
	List<? extends Number> numberList;
	
	void add(T a, T b) {};
	void sub(T a, T b) {};
	void mul(T a, T b) {};
	void div(T a, T b) {};
}

public class Ex03_Generic {
	public static void main(String[] args) {
		//Calculator<Object> cal1 = new Calculator();
		//Calculator<String> cal2 = new Calculator();
		Calculator<Integer> cal3 = new Calculator();
		Calculator<Float> cal4 = new Calculator();
		Calculator<Double> cal5 = new Calculator();
	}
}
