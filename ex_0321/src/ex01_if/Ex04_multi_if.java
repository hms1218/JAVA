package ex01_if;

public class Ex04_multi_if {
	public static void main(String[] args) {
		//if문의 중첩
		//제어문은 자유롭게 중첩해서 사용할 수 있다.
		
		//if(조건식1){
		//	if(조건식2){
		//		조건식1과 2가 모두 참이어야 실행할 명령
		//	}
		//}
		
		//1. boolean 변수는 ==true/==false 없이 사용
		boolean isActive = true;
		
		//if(isActive == true) -> 사용x
		//if(isActive) -> 사용
		
		//2. 조건을 메서드로 추출
//		if(isAccessibleAdmin()) {
//			
//		}
		
		//3. 메서드 안에서 조건에 맞지 않을 때
		//바로 return을 써서 빠져나오자

	}
//	public boolean isAccessibleAdmin(User user) {
//		return user != null && user.isActive() && user.getRole().equals("ADMIN");
//	}
	
//	public void proccess(User user) {
//		if(user != null) {
//			if(user.isActive()) {
//				if(user.hasPermission()) {
//					doSomthing();
//				}
//			}
//		}
//	}
	
//	public void proccess(User user) {
//		if(user == null) return;
//		if(user.isActive()) return;
//		if(user.hasPermission()) return;
//		
//		doSomthing();
//					
//	}
	
	
}
