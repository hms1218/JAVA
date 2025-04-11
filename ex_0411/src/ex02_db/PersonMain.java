package ex02_db;

import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		List<Person> list = PersonMethod.find();
		
		for(Person li : list) {
			System.out.printf("번호: %d, 이름: %s, 나이: %d\n",li.getIdx(),li.getName(),li.getAge());
		}
		
//		PersonMethod.add(4, "이길동", 90);
	}
}
