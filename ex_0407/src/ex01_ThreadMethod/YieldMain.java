package ex01_ThreadMethod;

public class YieldMain {
	public static void main(String[] args) {
		Runnable task = () -> {
			String name = Thread.currentThread().getName();
			for(int i=1; i<=5; i++) {
				System.out.println(name + " : " + i);
				Thread.yield(); // 양보 요청
			}
		};
		
		
		YieldExample ye = new YieldExample();
		ye.start();
		
		Thread t1 = new Thread(task,"스레드2"); // runnable은 독재적으로 실행 불가능
		t1.start();
	}
}
