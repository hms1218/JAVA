package ex04_exam;

public class UserInfo {
	int deposit; //계좌
	
	//입금
	public void deposit(int money) {
		System.out.println("입금 성공");
		deposit += money;
	}
	
	//출금
	public void withdraw(int money) {
		if(deposit < money) {
			System.out.println("잔액 부족");
		}else {
			System.out.println("출금 성공");
			deposit -= money;
		}
	}
	
	//잔액 조회
	public int showMoney() {
		return deposit;
	}
	
		//UserInfo 클래스를 만든 뒤, 금액을 저장할 deposit라는 변수를 만든다.
		//deposit(int money)메서드를 만들어 유저가 돈을 입금했을 경우를 처리.
		//withdraw(int money)메서드를 만들어 유저가 돈을 출금했을 경우를 처리.
		//단, 이 메서드에는 출금하고자 하는 돈 보다 잔액이 적을 경우 잔액이 부족하다는 메시지가 출력되도록 한다.
		//showMoney()메서드를 만들어 현재 잔액을 반환하도록 한다.
		
		//BankMain 클래스를 만들고
		//각각의 메뉴를 다음과 같이 만들고
		//1.입  금
		//2.출  금
		//3.잔액확인   -> 실행 후 다시 돌아와야함
		//4.종  료
		
		//메뉴를 선택할 시 기능을 호출한다.
		//종료를 선택하면 프로그램이 종료된다.
	
	
	
	
}
