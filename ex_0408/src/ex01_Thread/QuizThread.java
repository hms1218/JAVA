package ex01_Thread;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread{
	
	public void startGame() {
		int count = 0;
		
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				
				Random rd = new Random();
				int random1 = rd.nextInt(100)+1;
				int random2 = rd.nextInt(100)+1;
				
				int sum = random1 + random2;
				
				System.out.print(random1 + " + " + random2 + " : ");

				int num = sc.nextInt();
				
				if(num==sum) {
					System.out.println("정답입니다.");
					count++;
				}else {
					System.out.println("오답입니다.");
				}
				
				if(count==5) {
					System.out.println("5문제 끝" + " -> " + timeCount + "초");
					break;
				}
			} catch (Exception e) {
				System.out.println("정답은 정수로 입력하세요.");
			}
			
		
		}
		
	}
	
	int timeCount = 0;
	@Override
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				timeCount++;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	

}

//QuizThread 클래스를 만들어 스레드를 상속받는다.
//startGame() 메서드를 만들고 그 안에서 1~100 사이의 난수 두개를 더하는 문제를 출제
//키보드에서 답을 입력하여 5문제가 정답처리 될 때까지 로직을 반복합니다.

//모든 문제를 맞추는데 몇 초가 걸렸는지를 화면에 출력하며 프로그램을 종료하기

//QuizMain 클래스에서는 
//QuizThread qt = new QuizThread();
//qt.start();
//qt.startGame();