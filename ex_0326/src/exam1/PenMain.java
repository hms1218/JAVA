package exam1;

public class PenMain {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.setAmount(10);
		System.out.println(p.getAmount());
		
		Ballpen b = new Ballpen();
		b.setColor("검정");
		System.out.println(b.getColor());
		System.out.println(b.getAmount());
		
		FountainPen f = new FountainPen();
		f.refill(5);
	}
}
