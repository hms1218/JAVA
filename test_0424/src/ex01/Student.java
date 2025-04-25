package ex01;

public class Student {
	String name;
	int age;
	int studentNum;
	
	public Student(String name, int age, int studentNum) {
		this.name = name;
		this.age = age;
		this.studentNum = studentNum;
	}
	
//	public void info() {
//		System.out.printf("이름 : %s, 나이 : %d, 학번 : %d\n",name,age,studentNum);
//	}
	
	public String info() {
		return "이름 : " + name+ ", 나이 : " + age+ ", 학번 : " + studentNum;
	}
	
//	@Override
//	public String toString() {
//		return String.format(name,age,studentNum);
//	}
	
}
