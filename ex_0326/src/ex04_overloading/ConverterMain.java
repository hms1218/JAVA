package ex04_overloading;

public class ConverterMain {
	public static void main(String[] args) {
		Converter cv = new Converter();
		
		System.out.printf("%fm\n",cv.convert(500.0));
		
		System.out.printf("%fcm\n",cv.convert(500.0,"inch"));
	}
}
