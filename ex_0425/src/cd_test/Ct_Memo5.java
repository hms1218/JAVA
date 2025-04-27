package cd_test;

import java.util.Arrays;

public class Ct_Memo5 {
	public static void main(String[] args) {
		String myStr = "eeeabcdabcabee";
		String[] answer = {};
		
		String s = myStr.replaceAll("[a-c]", " ").trim();
		System.out.println(s);
		if(s.isEmpty()) {
			answer = new String[]{"EMPTY"};
		}else {
			answer = s.split("\\s+");
		}
		
		System.out.println(s);
		System.out.println(Arrays.toString(answer));
	}
}

//공백 정규식 ( \s)
//정규식 자체에서는 \s가 맞습니다. (공백 문자 매칭)
//하지만 Java 코드 안에서는 문자열을 쓸 때 백슬래시(\) 자체도 이스케이프 문자로 취급돼서,
//백슬래시 하나만 쓰면 에러가 나요.
//그래서 Java 코드 안에서는 \\s라고 써야 실제 정규식으로 \s가 전달됩니다.

//여러개의 공백은 \\s+ 사용
//ex) String hi = "Hello   World!";
// hi.split("\\s+");   -> 결과 : [Hello, World!]
// hi.split("\\s");    -> 결과 : [Hello, , , ,World!]


//임의의 문자열이 주어졌을 때 문자 "a", "b", "c"를 구분자로 사용해 문자열을 나누고자 합니다.

//예를 들어 주어진 문자열이 "baconlettucetomato"라면 나눠진 문자열 목록은 
//["onlettu", "etom", "to"] 가 됩니다.

//문자열 myStr이 주어졌을 때 위 예시와 같이 "a", "b", "c"를 사용해 나눠진 문자열을 순서대로 
//저장한 배열을 return 하는 solution 함수를 완성해 주세요.

//단, 두 구분자 사이에 다른 문자가 없을 경우에는 아무것도 저장하지 않으며, 
//return할 배열이 빈 배열이라면 ["EMPTY"]를 return 합니다.