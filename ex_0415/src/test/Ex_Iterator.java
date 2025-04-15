package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex_Iterator {
	public static void main(String[] args) {
		//반복자(Iterator)
//		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		Iterator<Integer> iter = list.iterator();
		
		//hasNext()
		//next()
		
//		while(iter.hasNext()) {
//			int value = iter.next();
//			System.out.print(value+" ");
//		}
		
		System.out.println();
		
		//Iterator가 리스트 원본의 주소를 참조한다.
		//next()메서드를 호출하면, 참조한 주소로 가서 요소를 직접 읽어온다. 
		
		//한번 사용한 Iterator객체는 재사용할 수 없다.
		//순회를 하고 나면 hasNext()가 가르키는게 리스트의 끝이기 때문에
		//false를 반환하기 때문에 재사용 불가능.
		
		//remove()
		//현재 Iterator가 가르키고 있는 요소를 원본 리스트에서 제거한다.
		
		System.out.println("-----------------------");
		
		while(iter.hasNext()) {
			int value = iter.next();
			if(value % 2 == 0) {
				iter.remove(); //원본에서도 제거됨
			}
		}
		
		System.out.println(list);
		
		//Set은 인덱스가 없기 때문에 하나씩 꺼내는 것이 불가능하다.
		//Iterator를 이용하면 꺼낼 수 있다.
		
		Set<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(5);
		hs.add(3);
		hs.add(2);
		hs.add(4);

		Iterator<Integer> hsIter = hs.iterator();
		
		while(hsIter.hasNext()) {
			int value = hsIter.next();
			System.out.print(value+" ");
		}
		
		System.out.println();
		
		for(Integer value : hs) {
			System.out.print(value+" ");
		}
		
		
	}
}
