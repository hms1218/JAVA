package ex03_Map;

import java.util.HashMap;

public class Ex01_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, Character> map = new HashMap<>();
		
		//put(K k, V v)
		//HashMap에 데이터 추가하기
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		map.put(4, 'A');//map에 저장되는 value는 중복될 수 있다.
		
		System.out.println(map);
		
		map.put(1, 'F');//같은 값을 가진 key가 있다면 value를 갱신한다.
		
		System.out.println(map);
		
		//remove(k k)
		//데이터의 삭제
		map.remove(3);
		
		System.out.println(map);
		
		//size()
		//컬렉션의 크기를 반환
		System.out.println("map의 크기 : " + map.size());
		
		//get(K k)
		//데이터의 조회
		char res = map.get(1);
		System.out.println(res);
		
		HashMap<String, Double> map2 = new HashMap<>();
		
		map2.put("k1", 100.0);
		map2.put("k2", 3.14);
		map2.put("k3", 4.15);
		
		System.out.println(map2);
		
		double result = map2.get("k2");
		System.out.println(result);
		
		//containsKey(K k)
		//map안에 key가 존재하면 true, 없으면 false
		//containsValue(V v)
		//map안에 value가 존재하면 true, 없으면 false
		
		
		
		
	}
}
