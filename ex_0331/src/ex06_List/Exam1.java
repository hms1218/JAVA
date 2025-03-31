package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		
		out : while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			for(String y : list) {
				if(list.contains(id)) {
					System.out.println("중복된 아이디입니다.");
					continue out;
				}
			}
			list.add(id);
			for(String x : list) {
				System.out.print(x+" ");
			}
			System.out.println();
			
			if(list.size()==5) {
				break;
			}
		}
		
		
	}
	
}

	//아래의 결과를 도출하시오. 입력받기
	//아이디 생성 : abc
	//abc
	//아이디 생성 : abc2
	//abc2	
	//아이디 생성 : abc3
	//abc3
	//아이디 생성 : 

	//아래의 결과를 도출하시오. 입력받기 / 수정하기
	//아이디 생성 : abc
	//abc
	//아이디 생성 : abc
	//중복된 아이디	
	//아이디 생성 : abc2
	//abc, abc2
	//아이디 생성 : c
	//abc, abc2, c