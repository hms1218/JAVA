package exam1;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		//키보드에서 특수문자를 제외한 알파벳을 무작위로 받는다.
		//입력받은 문자열에서 소문자 a가 몇개있는지 판별하시오
		//예시:
		//입력 : asdfasdf
		//결과 : 2
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("입력 : ");
//		String str = sc.next();
//
//		int cnt = 0;
//		for(int i=0; i<str.length();i++) {
//			if(str.charAt(i)=='a') {
//				cnt++;
//			}
//		}
//		System.out.println("결과 : " +cnt);
		
		//생일과 성별구하기
		//예시
		//주민번호를 모두 입력하세요(-포함)
		//911223-1033454
		//당신은 1991년 12월 23일에 태어난 남자입니다.
		
//		System.out.print("주민번호(-포함) : ");
//		String num = sc.next();
//		
//		if(num.trim().length()<14 || num.trim().charAt(6)!='-') {
//			System.out.println("주민번호를 올바르게 입력하세요.");
//		} else {
//			String year = num.substring(0,2);
//			String birth = "";
//			
//			if(Integer.parseInt(year) <= 00) {
//				birth = "당신은 20"; 
//			} else {
//				birth = "당신은 19";
//			}
//			
//			birth += year + "년 " + num.substring(2,4) + "월 " + num.substring(4,6) + "일에 태어난 ";
//			
//			String gender = "";
//			
//			if(num.charAt(7)=='1') {
//				gender = "남자입니다";
//			}else if(num.charAt(7)=='2') {
//				gender = "여자입니다";
//			}
//		
//			System.out.println(birth+gender);
//		}
		
		
		//회문 판별하기
		//앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문자열
		//키보드에서 문자열을 입력받아 회문이면 xxx는 회문입니다.
		//아니면 xxx는 회문이 아닙니다.
		//토마토는 회문입니다.
		//지하철은 회문이 아닙니다.
		
		//가나다라마라다나가
		//012345678
		System.out.println("입력 : ");
		String hm = sc.next();
		
		for(int i=0; i<hm.length(); i++) {
			if(hm.charAt(i)==(hm.charAt(hm.length()-i))){
				System.out.println(hm+"은(는) 회문입니다.");
			} else {
				System.out.println(hm+"은(는) 회문이 아닙니다.");
			}
		}
		
//		String rev = "";
//		for(int i=hm.length()-1; i>=0; i--) {
//			rev += hm.charAt(i);
//		}
		
		
		
		
		
	}
}
