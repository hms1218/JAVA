package ex05_Generic;

public class GenMain {
	public static void main(String[] args) {
		GenEx<Integer> v1 = new GenEx<>();
		v1.setValue(100);
		
		System.out.println(v1.getValue());
		
		
		GenEx<String> v2 = new GenEx<>();	
		v2.setValue("홍길동");
		
		System.out.println(v2.getValue());
		
	}
}
