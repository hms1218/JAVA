package ex04_overloading;

public class BreadMain {
	public static void main(String[] args) {
		Bread br = new Bread();
		
		br.makeBread();
		br.makeBread(5);
		br.makeBread("크림",4);
	}
}
