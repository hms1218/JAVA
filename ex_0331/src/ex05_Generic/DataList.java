package ex05_Generic;
//이 클래스는 데이터를 저장할 수 있는 자료구조
//배열의 타입은 Object이다.
//Object는 모든 클래스의 최상위 클래스이므로 어떠한 데이터 형태라도 저장이 가능하다.
//하지만 데이터를 저장한 후 실제로 꺼내서 사용하려면 어떤 데이터 타입을 지녔는지
//일일히 확인해야 하고, 약속한 데이터가 입력되지 않아 에러가 발생할 수 있다.
public class DataList<T> {
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	public DataList() {
		data = new Object[defaultSize];
	}
	
	public DataList(int size) {
		data = new Object[size];
	}
	
	//배열에 데이터를 추가해주는 메서드
	public void add(T value) {
		data[size++] = value;
	}
	
	//배열에 데이터를 조회하는 메서드
	public T get(int index) {
		return (T)data[index];
	}
	
	//배열의 크기를 반환하는 메서드
	public int size() {
		return size;
	}
	
	
}
