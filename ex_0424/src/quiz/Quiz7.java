package quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Quiz7 {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Alice", 85);
		scores.put("Bob", 72);
		scores.put("Charlie", 90);
		
		Set<Map.Entry<String, Integer>> students = scores.entrySet();
		
		for(Map.Entry<String, Integer> student : students) {
			if(student.getValue() >= 80) {
				System.out.println("이름 : "+student.getKey()+" 점수 : "+student.getValue());
			}
		}
		
	}
}

//다음 데이터에서 80점 이상인 학생만 출력하세요
