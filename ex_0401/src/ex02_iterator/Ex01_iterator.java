package ex02_iterator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex01_iterator {
	public static void main(String[] args) {
		//반복자
		//컬렉션 객체를 통해 생성
		//반봅ㄱ자를 통해서 컬렉션 객체의 요소들에 접근할 수 있다.
		//hasNext(), next()
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Iterator<Integer> iter = list.iterator();
		
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.print(val+" ");
		}
		System.out.println();
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<=10; i++) {
			set.add(i);
		}
		
		Iterator<Integer> iter2 = set.iterator();
		//Set의 경우 index가 따로 없기 때문에 요소를 하나씩 꺼내는 것이 불가능하다.
		while(iter2.hasNext()) {
			int val = iter2.next();
			System.out.print(val+" ");
		}
		
		//향상된 for문
		//리스트의 처음부터 끝까지 하나씩 뽑아서 x에 대입, 중간에 멈추지 않음
		//내부에서는 iterator를 통해서 동작하고 있음
		for(int x : list) {
			System.out.println(x);
		}
		
		
		
		
	}
}
