package quiz;

public class Quiz5 {
	public static void main(String[] args) {
		String answer = "";
		String[] arr = {"a","b","c"};
		
		for(int i=0; i<arr.length; i++) {
			answer += arr[i];
		}
		
		System.out.println(answer);
	}
}

//문자들이 담겨있는 배열 arr가 주어집니다.
//arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

//1 ≤ arr의 길이 ≤ 200
//arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.

//입출력 예
//arr	            result
//["a","b","c"]	"abc"