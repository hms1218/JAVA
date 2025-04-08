package ex01_Thread;

//데몬스레드
//메인 작업을 돕는 역할을 하는 스레드
//메인 작업을 하는 스레드가 종료되면 같이 종료
public class DaemonMain {
	public static void main(String[] args) {
		//데몬스레드의 생성
		Thread daemonThread = new Thread(new MyDaemonRunnable());
		
		//데몬스레드로 설정한다.
		daemonThread.setDaemon(true);
		
		//데몬 스레드 시작
		daemonThread.start();
		
		//메인 스레드에서 1부터 15까지 출력
		 for (int i = 1; i <= 15; i++) {
            System.out.println(i);
            
            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	        
	        System.out.println("메인 스레드 종료");
		
	}
}

class MyDaemonRunnable implements Runnable {
	@Override
	public void run() {
		try {
			for(int i=1; i<=15; i++) {
				System.out.println("저장되었습니다.");
				Thread.sleep(3000); // 3초 대기
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

//main도 스레드임
//스레드 -> 작업의 흐름
//하나의 프로그램 안에서 여러 작업을 동시에 실행할 수 있게 해주는 기술
//하나의 프로그램에는 최소 1개의 스레드가 있다.
//우리가 인위적으로 스레드를 생성하는 것이 가능
//1. Thread 클래스를 상속받아서 생성
//2. Runnable 인터페이스를 구현
//메인 작업과 별개로 동시에 작업을 하고 싶은 내용을 run()메서드 안에 작성을 한다.
//Runnable 방식이 더 유연하고 실무에서도 많이 쓴다.
//스레드를 여러개 만들고 사용할 때, 스레드가 공유하고 변수나 메서드에 접근을 하면 데이터 충돌 발생 가능성이 있다.
//하나의 스레드가 점유할 때는 다른 스레드가 사용할 수 없는 동기화를 해야한다(synchronized)

//프로세스 안에 스레드가 1개면 -> 싱글 스레드
//프로세스 안에 스레드가 여러개 -> 멀티 스레드