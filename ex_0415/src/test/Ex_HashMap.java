package test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex_HashMap {
	public static void main(String[] args) {

		//Map
		//containsKey()
		//contatinsValue()
		
		HashMap<String, List<Integer>> student = new HashMap<>();
		
		student.put("홍길동", Arrays.asList(100,90,48));
		student.put("박개발", Arrays.asList(60,30,78));
		student.put("김가가", Arrays.asList(92,70,68));
		
		System.out.println(student.keySet());
		
		for(String name : student.keySet()) {
			System.out.println(name);
		}
		
		System.out.println(student.get("박개발").get(1));
		
		System.out.println(student);
		
		//getOrDefault(Object key, V defaultValue);
		//key를 통해서 조회된 value가 있다면 value를 반환
		//조회된 value가 없으면 default 값을 반환
		
		HashMap<String, Integer> hs2 = new HashMap<>();
		
		hs2.put("cherry", 7);
		hs2.put("date", 4);
		
		Integer grapeValue = hs2.getOrDefault("grape", 0);
		System.out.println(grapeValue);
		
		//keySet()
		//Map에 들어있는 모든 key를 Set형태로 반환한다.
		Set<String> keys = hs2.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		
		//values()
		//Map에 들어있는 모든 value를 Collection형태로 반환
		Collection<Integer> values = hs2.values();
		
		for(Integer val : values) {
			System.out.println(val);
		}
		
		//entrySet()
		//모든 key-value 쌍을 Map.Entry객체로 구성된 Set형태로 반환
		Set<Map.Entry<String, Integer>> entries = hs2.entrySet();
		System.out.println(entries);
		
		for(Map.Entry<String, Integer> ent : entries) {
			System.out.println(ent);
		}
		
		//컬렉션 사용 순위
		//1. ArrayList
		//2. HashMap
		//3. HashSet
		
		
		
	}
}
