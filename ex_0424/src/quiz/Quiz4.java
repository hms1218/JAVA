package quiz;

public class Quiz4 {
	public static void main(String[] args) {
		String str = "abcde";
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}

//문자열 str이 주어집니다.
//문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
//
//<<입출력 예>>
//입력
//abcde
//
//출력
//a
//b
//c
//d
//e