package ex04_overloading;

public class Bread {
	//각기 다른 기능을 하는 makeBread()메서드를 3개 만드는데,
	//메인 클래스에서 각각의 메서드를 호출했을 때의 결과를 보고 로직을 구현해보자.
	
	//빵을 만들었습니다 <------------------- method 1을 호출해서 나온 결과
	//-------------
	
	//빵을 만들었습니다 <------------------- method 2을 호출해서 나온 결과
	//빵을 만들었습니다.
	//요청하신 n개의 빵을 만들었습니다.
	//-------------
	
	//크림빵을 만들었습니다 <----------------- method 3을 호출해서 나온 결과
	//크림빵을 만들었습니다.
	//요청하신 n개의 빵을 만들었습니다.
	
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
		System.out.println("-------------------------------");
	}
	
	public void makeBread(int n) {
		for(int i=0; i<n; i++) {
			System.out.println("빵을 만들었습니다.");
			
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n",n);
		System.out.println("-------------------------------");
	}
	
	public void makeBread(String s,int n) {
		for(int i=0; i<n; i++) {
			System.out.printf("%s빵을 만들었습니다.\n",s);
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n",n);
		System.out.println("-------------------------------");
	}
	
	
	
	
	
	
	
}
