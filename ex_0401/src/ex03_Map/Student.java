package ex03_Map;

public class Student {
	private String name;
	private int totalScore;
	private int subjectCount;
	
	public Student(String name) {
		this.name = name;
	}
	
	public void addScore(int score) {
		totalScore += score;
		subjectCount++;
	}
	
	public double getAverage() {
		if(subjectCount == 0) {
			return 0;
		}else {
			return (double)totalScore / subjectCount;
		}
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
}
