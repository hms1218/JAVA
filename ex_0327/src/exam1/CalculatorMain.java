package exam1;

public class CalculatorMain {
	public static void main(String[] args) {
		CalPlus p = new CalPlus();
		CalMinus m = new CalMinus();
		
		System.out.println("CalPlus : "+p.getResult(10, 5));
		System.out.println("CalMinus : "+m.getResult(10, 5));
	}
}
