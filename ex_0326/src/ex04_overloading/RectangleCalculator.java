package ex04_overloading;

public class RectangleCalculator {
	//다양한 방식으로 사각형의 넓이 구하기
	//메서드명 : area
	//1. 정사각형의 한 변의 길이를 받아 넓이 반환하기
	public int area(int a) {
		int area = a*a;
		return area;
	}
	//2. 가로 세로 길이를 받아 직사각형의 넓이 반환하기
	public int area(int a,int b) {
		int area = a*b;
		return area;
	}
	//3. 실수형 가로,세로를 받아 실수 넓이 결과 반환하기
	public double area(double a, double b) {
		double area = a*b;
		return area;
	}
	
	
	
	
}
