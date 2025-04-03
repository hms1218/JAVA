package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class P_lamda{
	//리스트의 필터 메서드를 만든다.
	//숫자 리스트에서 조건을 결합한 결과만 필터링
	
	public List<Integer> filter(List<Integer> list, Predicate<Integer> condition){
		List<Integer> result = new ArrayList<>();
		
		for(Integer a : list) {
			if(condition.test(a)) {
				result.add(a);
			}
		}
		return result;
		
	}
}



public class Exam1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(50,80,120,150,180,210,250,300);
		
		//조건
		//Predicate<Integer>를 사용해 다음 조건을 구현
		//짝수(even)
		//100이상
		//200미만
		
		Predicate<Integer> isEven = t -> t%2==0;
		Predicate<Integer> isOver100 = t -> t>=100;
		Predicate<Integer> isUnder200 = t -> t<200;
		
		Predicate<Integer> condition = isEven.and(isOver100).and(isUnder200);
			
		//메서드 호출해서 리스트와 조건 넘겨주면 된다.
		P_lamda pl = new P_lamda();
		List<Integer> list = pl.filter(numbers, condition);
		System.out.println(list);
		
		
	}
}
