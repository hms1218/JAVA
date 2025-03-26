package ex04_overloading;

public class RectangleCalculatorMain {
	public static void main(String[] args) {
		RectangleCalculator rtc = new RectangleCalculator();
		
		System.out.println("정사각형의 넓이 : "+ rtc.area(8));
		System.out.println("직사각형의 넓이 : "+ rtc.area(7,4));		
		System.out.println("직사각형의 넓이 : "+ rtc.area(3.0,4.2));		
		
	}
}
