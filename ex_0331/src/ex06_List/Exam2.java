package ex06_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		//products라는 이름의 ArrayList를 만들고
		ArrayList<String> products = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품 이름을 입력하세요(종료하려면 exit입력)");
		
		while(true) {
			System.out.print("상품명 입력 : ");
			String input = sc.nextLine();
			
			if(input.equals("exit")) {
				break;
			}
			
			viewProduct(products,input);
			
			
		}
		System.out.println("최종 상품 목록 : " + products);
		
	}
	
	//viewProduct

	//키보드에서 값을 입력받아 상품을 추가한다.(조회)
	//상품이 중복되면 제거한다.
	//최근 조회한 상품목록이 가장 앞에 나오도록 한다.
	
	public static void viewProduct(List<String> list, String product) {
		//중복이 들어오면 제거
		list.remove(product);
		//최근에 검색한 것을 맨앞에
		list.add(0,product);
		System.out.println("상품 클릭 : " + product+" -> " + list);
	}
	
}

