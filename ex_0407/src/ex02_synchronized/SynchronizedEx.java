package ex02_synchronized;

public class SynchronizedEx implements Runnable{

	private long money = 10000;
	
	//클래스에 대한 정보를 담을 수 있다.
	//메타정보 : 파일에 대한정보 (ex.이름,재생시간,용량,생성시기,저장위치...)
	Class cls = SynchronizedEx.class;
	
	@Override
	public void run() {
		//SynchronizedEx.class : SynchronizedEx 클래스 자체를 의미
		//SynchronizedEx클래스에 락을 걸겠다.
		//하나의 스레드가 이미 점유 중이라면 다른 스레드가 사용할 수 없다.
		
		//synchronized 블록
		//필요한 부분만 선택적으로 동기화를 할 수 있어서 조금 더 성능을 최적화할 수 있다.
		synchronized (SynchronizedEx.class) {
			for(int i=0; i<10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(getMoney() <= 0) {
					break;
				}
				outMoney(1000);
			}
		}
		
	}
	
	public long getMoney() {
		return money;
	}
	
	public void setMoney(long money) {
		this.money = money;
	}
	
	//출금
	public void outMoney(long money) {
		//접근한 스레드의 이름을 저장
		String threadName = Thread.currentThread().getName();
		//잔고가 0보다 크면
		if(getMoney() > 0) {
			this.money -= money;
			System.out.println(threadName+" - 잔액 : "+getMoney()+"원");
		} else {
			System.out.println("잔액이 없습니다.");
		}
		
		
	}
	
	
	
}
