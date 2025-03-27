package ex03_Polymorphism;

abstract class Animal{
	public abstract void cry();
}
class Pig extends Animal{
	//추상클래스를 상속받으면 반드시 추상메서드를 오버라이드 해야한다.
	
	@Override
	public void cry() {
		//super.cry();
		System.out.println("꿀꿀");
	}
}
class Cow extends Animal{
	@Override
	public void cry() {
		//super.cry();
		System.out.println("음메");
	}
}

class Farm{
	public void sound(Animal animal) {
		// instanceof 로 해결
		if(animal instanceof Pig) { //객체 변수 animal은 Pig타입으로 생성된 객체이다.
			System.out.println("꿀꿀");
		}else {
			System.out.println("음메");
		}

		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		//오버라이딩으로 해결
		//들어온 객체에 따라서 오버라이딩 된 메서드가 호출이 된다.
		animal.cry();
	}
}

public class FarmTest {
	public static void main(String[] args) {
	
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
		
		
		
	}
}
