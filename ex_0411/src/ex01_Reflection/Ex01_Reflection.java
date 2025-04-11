package ex01_Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Ex01_Reflection {
	public static void main(String[] args) {
		//User 클래스에 대한 정보다 clazz에 담긴다.
		//필드의 목록, 메서드의 목록 etc...
		Class<?> clazz = User.class;
		
		//필드의 개수
		Field[] fields = clazz.getDeclaredFields(); // 모든 필드(private 포함)
		
		System.out.println("필드의 개수 : " + fields.length);
		
		//필드의 목록 출력
		//getName() : 필드의 이름을 출력
		//getType() : 필드의 타입을 출력
		for(Field f : fields) {
			System.out.println("- " + f.getType() + "- " + f.getName());
		}
		
		//메서드 목록 가져오기
		Method[] methods = clazz.getDeclaredMethods();
		
		for(Method method : methods) {
			String name = method.getName();
			Class<?> returnType = method.getReturnType();
			Parameter[] parameters = method.getParameters();
			
			System.out.print("- " + returnType.getSimpleName()+" "+name+"(");
			
			for(Parameter parameter : parameters) {
				System.out.print(parameter.getName());
				System.out.print(", ");
			}
			System.out.println(")");
		}
		
	}
}

//리플렉션(Reflection)이란?
//클래스, 메서드, 필드, 생성자 등의 정보를 프로그램 실행 중에 동적으로 조사하거나 조작할 수 있는 기능

//리플렉션 API의 핵심 클래스
//Class<?> 클래스의 메타 정보를 저장할 수 있는 클래스
//Field    클래스의 필드를 표현
//Method   클래스의 메서드를 표현
//Constructor 생성자를 표현
//Annotation 어노테이션 정보를 표현