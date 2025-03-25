package ex04_exam;

import java.util.Random;

public class MethodTest {
	//배열의 최대값을 찾는 maxFinder 메서드
	//임의의 배열은 매개변수로 받자.
	
	//x ={1,2,3,4,5}
	
	public void maxFinder(int[] x) {
		int max = x[0];
		for(int i=1;i<x.length;i++) {
			if(max < x[i]) {
				max = x[i];
			}
		}
		//for(int max : x){
		//	if(max < x){
		//		max = x;
		//	}
		//}
		System.out.println("최대값 : "+max);
	}
	
	//원의 넓이와 둘레 구하기
	//함수를 호출하면서 반지름을 받는다.
	//원의 넓이를 구하는 circleArea
	//원의 둘레를 구하는 circleRound
	//circleArea는 결과 출력하기
	//circleRound는 결과 반환하기
	//원의 넓이 : 3.14*r*r
	//원의 둘레 : 2*r*3.14
	
	//r=2
	public void circleArea(int r) {
		float circleArea = (float)3.14*r*r;
		System.out.println(circleArea);
	}
	
	public float circleRound(int r) {
		float circleRound = (float)3.14*2*r;
		return circleRound;	
	}
	
	//계산기 만들기
	//사칙연산을 할 수 있는 calculator 메서드 만들기
	//두 수와 연산자를 매개변수로 받는다.
	
	public void calculator(int a,int b,char op) {
		switch(op) {
			case '+' :
				System.out.printf("%d + %d = %d\n",a,b,a+b);
				break;
			case '-' :
				System.out.printf("%d - %d = %d\n",a,b,a-b);
				break;
			case '*' :
				System.out.printf("%d * %d = %d\n",a,b,a*b);
				break;
			case '/' :
				System.out.printf("%d / %d = %d\n",a,b,a/b);
				break;
		}
	}
	
	//1~50사이의 난수를 생성
	//main쪽에서 키보드를 통해서 정수를 입력받는다.
	//check()메서드를 만들어서 사용자가 입력한 숫자를 판단.
	//발생한 난수보다 크다면 DOWN! 작다면 UP!을 출력
	//사용자가 입력한 숫자와 발생한 난수가 같을 경우에
	//프로그램을 종료(몇회만에 맞췄는지 판단해보자)
	
	
	Random rd = new Random();
	int random = rd.nextInt(50)+1;
	int cnt = 1;
	//사용자가 입력한 숫자와 난수를 체크하는 기능
	public String check(int number) {	
		if(number == random) {
			return "정답!";
		}
		else if(number > random) {
			return "DOWN!";
		}
		else {
			return "UP!";
		}
		
	}
	
//  Graph라는 이름의 메인 클래스를 만들어 
//	0 ~ 9사이의 난수를 100개 저장하는 배열을 만들고, 
//	해당 배열이 가지고 있는 각 방의 난수를 판별하여 그래프화 해 보자.
//
//  단, 발생한 난수의 그래프화 작업은 PrintGraph클래스가 하도록 한다.
//
//  결과:
//  0507...... //난수 100개
//  0의 갯수 : ############ 12
//  1의 갯수 : ######### 9
//  2의 갯수 : ########### 11
//  3의 갯수 : ######## 8
//  4의 갯수 : ############## 14
//  5의 갯수 : ####### 7
//  6의 갯수 : ######### 9
//  7의 갯수 : ############# 13
//  8의 갯수 : ####### 7
//  9의 갯수 : ########## 10
	
	int[] count = new int[10];
	String sh = "#";
	
	public void PrintGraph(int[] random) {
		for(int i=0; i<random.length; i++) {
			random[i] = rd.nextInt(10);
			count[random[i]]++;
		}
		for(int i=0; i<10; i++) {
			System.out.printf("%d의 갯수 : %s %d\n",i,sh.repeat(count[i]),count[i]);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
