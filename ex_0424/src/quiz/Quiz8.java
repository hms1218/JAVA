package quiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz8 {
	public static void main(String[] args) {
		Map<String,List<Integer>> student = new HashMap<>();
		
		student.put("Kim", Arrays.asList(80,80,80));
		student.put("Lee", Arrays.asList(60,60,60));
		student.put("Park", Arrays.asList(90,90,90));
		
//		Set<Map.Entry<String,List<Integer>>> entry = student.entrySet();
		
		for(Map.Entry<String,List<Integer>> entry : student.entrySet()) {
			String name = entry.getKey();
			List<Integer> list = entry.getValue();
			
			int sum = 0;
			for(int score : list) {
				sum += score;
			}
			
			double avg = (double)sum / list.size();
			
			if(avg >= 80) {
				System.out.println("이름 : "+name+" ,평균 : "+avg);
			}
		}
		
		
		
	}
}

//한 학급에는 여러 명의 학생이 있으며, 각 학생은 여러 국,영,수 시험을 응시한 점수를 가지고 있다.
//학생의 이름과 그 학생의 시험 점수들이 주어진다.
//
//모든 학생의 이름과 점수를 효율적으로 저장할 수 있는 구조를 설계하라.
//
//각 학생의 평균 점수를 계산하고, 평균이 80점 이상인 학생만 이름과 평균 점수를 출력하라.
