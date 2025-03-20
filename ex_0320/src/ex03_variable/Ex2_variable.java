package ex03_variable;

public class Ex2_variable {
	public static void main(String[] args) {
		//변수의 유효범위(scope)
		//모든 변수는 만들어진 중괄호 안에서만 사용할 수 있다.
		String favoriteFood;
		favoriteFood = "제육";
		
		if(10>5) {
			favoriteFood = "제육";
		}
	}
	//favoriteFood = "제육"; -> 에러발생
}
