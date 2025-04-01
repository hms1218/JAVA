package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<MenuItem> menuArr = new ArrayList<>();
		ArrayList<MenuItem> orderList = new ArrayList<>();
		
		MenuItem item1 = new MenuItem();
		item1.menu="아메리카노";
		item1.price=3000;
		
		MenuItem item2 = new MenuItem();
		item2.menu="라떼";
		item2.price=3500;
		
		MenuItem item3 = new MenuItem();
		item3.menu="카푸치노";
		item3.price=4000;
		
		menuArr.add(item1);
		menuArr.add(item2);
		menuArr.add(item3);
		
		boolean running = true;
		
		while(running) {
			System.out.println("=== 카페 주문 시스템 ===");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 주문 하기");
			System.out.println("3. 결제 하기");
			System.out.println("4. 프로그램 종료");
			System.out.println("5. 취소 하기");
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			switch(num) {
				case 1: 
					System.out.println("[메뉴판]");
					for(int i=0; i<menuArr.size(); i++) {
						System.out.println((i+1)+". "+menuArr.get(i).menu+" - "+menuArr.get(i).price+"원");
					}
					
					break;
				case 2:
					//메뉴추가기능
					//메뉴번호를 입력받아서 해당 번호에 해당하는 객체를 orderList에 추가하면 된다.
					//번호를 잘못 입력하면 "잘못된 메뉴 번호입니다."
					System.out.print("메뉴 번호 입력 : ");
					int menuNum = sc.nextInt();
					if(menuNum >= 1 && menuNum <= menuArr.size()) {
						MenuItem selected = menuArr.get(menuNum-1);
						orderList.add(selected);
						System.out.println("'"+selected.menu+"'가 주문에 추가되었습니다.");
					}else {
						System.out.println("잘못된 메뉴 번호입니다.");
					}
					break;
					
				case 3:
					//결제하기
					//orderList가 비어있으면 결제할 주문이 없습니다 출력하기
					if(orderList.isEmpty()) {
						System.out.println("결제할 주문이 없습니다.");
					}else {
						System.out.println("[결제내역]");
						int sum = 0;
						for(MenuItem order : orderList) {
							System.out.println("- " + order.menu);
							sum += order.price;
						}
						System.out.println("총 금액 : " + sum + "원");
						System.out.println("결제가 완료되었습니다. 감사합니다!");
					}
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					running = false;
					break;
				case 5:
					//취소하기
					//orderList가 비어있으면
					//주문내역이 없습니다 출력
					//비어있지 않으면 
					//[현재 주문 내역]
					//1. 아메리카노 - 3000원
					//2. 라떼 	 - 3500원
					
					//취소할 주문번호를 입력하세요
					//orderList에서 remove하면됨
					if(orderList.isEmpty()) {
						System.out.println("주문내역이 없습니다.");
					} else {
						System.out.println("[현재 주문 내역]");
						for(int i=0; i<orderList.size(); i++) {
							System.out.println((i+1)+". "+orderList.get(i).menu+" - "+orderList.get(i).price+"원");
						}
						System.out.println("취소할 주문번호를 입력하세요 : ");
						int orderNum = sc.nextInt(); 
						if(orderNum >= 1 && orderNum <= orderList.size()) {
							MenuItem selected = orderList.get(orderNum-1);
							orderList.remove(selected);
							System.out.println("'"+selected.menu+"'가 취소되었습니다.");
						}else {
							System.out.println("잘못된 취소 번호입니다.");
						}
					}
			}
		}
	}
}
