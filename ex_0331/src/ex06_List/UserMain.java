package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<UserInfo> user = new ArrayList<>();
		
		while(true) {
			UserInfo ui = new UserInfo();
			
			System.out.print("아이디 생성 : ");
			ui.setId(sc.next());
			System.out.print("패스워드 입력 : ");
			ui.setPw(sc.nextInt());
			
			//중복체크하기(숙제)
			for(UserInfo x : user) {
				if(user.contains(x.getId())) {
					System.out.println("중복된 아이디입니다.");
				}
			}
			
			user.add(ui);
			
			for(UserInfo y : user) {
				System.out.println(y.getId());
				System.out.println(y.getPw());
			}
			
		}
	}
}
