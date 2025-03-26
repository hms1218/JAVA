package ex04_exam;

import java.util.Scanner;

public class Bank {
	int money;
	int select;
	
	public void bank() {
		UserInfo ui = new UserInfo();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.입  금");
			System.out.println("2.출  금");
			System.out.println("3.잔액확인");
			System.out.println("4.종  료");
			
			System.out.println("선택 : ");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("입   금");
				System.out.println("금액 : ");
				money = sc.nextInt();
				ui.deposit(money);
				break;
			case 2:
				System.out.println("출   금");
				System.out.println("금액 : ");
				money = sc.nextInt();
				ui.withdraw(money);
				break;
			case 3:
				System.out.println("잔액확인");
				System.out.println(ui.showMoney()+"원");
				break;
			case 4:
				System.out.println("종료합니다.");
				return; //함수 자체를 빠져나감
			}
			System.out.println("-----------------------");
		}
	}
	
	
	
	
}
