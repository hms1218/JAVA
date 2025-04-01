package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonFunction {
	
	public void personFunc() {
		ArrayList<Person> personArr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		
		
		boolean exit = true;
		
		while(exit) {
			Person p = new Person();
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보");
			System.out.println("4. 종료");
			System.out.print("항목 선택 : ");
			int num = sc.nextInt();
			switch(num) {
				case 1:
					System.out.println("-----정보추가-----");
					System.out.print("이름 : ");
					p.setName(sc.next());
					System.out.print("나이 : ");
					p.setAge(sc.nextInt());
					System.out.print("전화 : ");
					p.setPhoneNumber(sc.next());
					
					personArr.add(p);
					System.out.println("정보가 저장되었습니다.");
					break;
				case 2:
					System.out.println("-----정보삭제-----");
					System.out.print("삭제할 이름 : ");
					String dName = sc.next();
					for(int i=0; i<personArr.size(); i++) {
						if(personArr.get(i).getName().equals(dName)) {
							personArr.remove(i);
							System.out.println(dName+"의 정보를 삭제했습니다.");
							break;
						}else {
							if(i+1 == personArr.size()) {
							System.out.println(dName+"이 없습니다.");
							}
						}
					}
					break;
				case 3:
					System.out.println("-----전체정보-----");
					System.out.println("등록인원 : "+personArr.size()+"명");
					for(Person info : personArr) {
						System.out.println("이름 : " + info.getName());
						System.out.println("나이 : " + info.getAge());
						System.out.println("전화 : " + info.getPhoneNumber());
						System.out.println("---------------");
					}
					break;
					
				case 4:
					System.out.println("종료합니다");
					exit = false;
					break;
			}
			
		}
	}
}
