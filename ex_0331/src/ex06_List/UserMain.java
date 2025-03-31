package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<UserInfo> user = new ArrayList<>();
		
		out:while(true) {
			UserInfo ui = new UserInfo();
			
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			ui.setId(id);
			System.out.print("패스워드 입력 : ");
			ui.setPw(sc.nextInt());
			
			//중복체크하기(숙제)
			for(UserInfo x : user) {
				if(x.getId().equals(id)) {
					System.out.println("중복된 아이디입니다.");
					continue out;
				}
			}
			
			user.add(ui);
			
			for(UserInfo x : user) {
				System.out.println(x.getId());
				System.out.println(x.getPw());
			}
			
		}
	}
}
