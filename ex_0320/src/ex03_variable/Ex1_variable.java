package ex03_variable;

public class Ex1_variable {
	public static void main(String[] args) {
		//변수
		//프로그램을 만들고 실행하는데 필요한 값들을
		//메모리에 저장해두고, 필요할 때마다 꺼내서 사용
		
		//메모리에 무질서하게 저장되는 것이 아니라,
		//메모리 규칙속에서 일부 공간을 할당받아야한다.
		
		//메모리에 값을 저장하기 위해 할당해 놓은 특정 공간을
		//변수라고 한다.
		
		//1. 변수의 선언
		//변수를 사용하기 위해서는 선언을 우선 해야한다.
		//자료형 변수명
		
		//변수명 짓는 규칙
		//1. 숫자 특수문자($,_제외)가 첫글자로 올 수 없다.
		//2. 대소문자 구별한다.
		//3. 일반적으로 영어소문자로 시작한다.
		//4. 특수문자가 포함될 수 없다.
		//5. 예약어 금지(if,switch,for,while)
		//6. 한글 사용 금지
		
		//표기법
		//카멜표기법
		//두번째 단어부터 첫글자를 대문자로 표기
		//userName, homeAddress
		
		//스네이크 표기법
		//모든 단어가 소문자로 시작하고 단어와 단어 사이는
		//_로 연결하는 방식
		//user_name, home_address
		
		//변수에 데이터 입력하기
		//데이터를 직접 사용하는 대신, 변수에 저장하고
		//변수명을 사용하여 값을 사용한다.
		
		int studentAge;
		studentAge = 20;
		System.out.println(studentAge);
		
		boolean b = true;
		System.out.println("b의 값 : "+b);
		//자바는 변수의 타입을 엄격하게 지켜야한다.
		
		//문자형
		char ch = 'a';
		System.out.println("ch의 값 : "+ch);
		
		//아스키코드 때문에 에러가 나지 않는다.
		char ch2 = 65; //아스키코드
		System.out.println("ch2의 값 : "+ch2);
		
		//정수형
		byte by = 127;
		short s = 32767;
		int n = 555555555;
		System.out.println("by의 값 : "+by);
		System.out.println("s의 값 : "+s);
		System.out.println("n의 값 : "+n);
		
		//실수형
		float f1,f2;
		
		//java에서는 실수의 타입을 double형으로 인식하기 때문에
		//데이터가 float타입이라는 것을 명시해줘야 한다.
		f1 = 3.14f;
		f2 = 12f;
		System.out.println("f1 = "+f1);
		System.out.println("f2 = "+f2);
		
		int myAge = 20;
		int yourAge = myAge;
		
		myAge = 21;
		System.out.println("yourAge : " + yourAge);
		
		// 두 변수에 들어있는 값을 교환하려면 어떻게 해야할까??
		int su1 = 20, su2 = 30;
		
		System.out.println("변경전");
		System.out.println("su1 : "+su1);
		System.out.println("su2 : "+su2);
		
		int temp = su1;
		su1 = su2;
		su2 = temp;
		
		System.out.println("변경후");
		System.out.println("su1 : "+su1);
		System.out.println("su2 : "+su2);
		
		
		
		
	}
}
