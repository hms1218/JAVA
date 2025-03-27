package exam2;

public class CalcMain {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println("합 : "+c.add(10, 5));
		System.out.println("차 : "+c.substract(10, 5));
		int[] a = {1,2,3,4,5};
		System.out.println("평균 : "+c.average(a));
	}
}
