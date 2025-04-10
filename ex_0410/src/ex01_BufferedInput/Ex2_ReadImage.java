package ex01_BufferedInput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex2_ReadImage {
	public static void main(String[] args) {
		//byte 배열을 사용해서 이미지를 읽어왔을 때
		//속도가 굉장히 빠르다는 것을 알 수 있었다.
		
		FileInputStream readFile = null;
		BufferedInputStream bis = null;
		
		try {
			System.out.println("보조스트림으로 읽기");
			readFile = new FileInputStream("C:\\Users\\admin\\Desktop\\full_stack_hms\\wall.jpg");
			
			//버퍼라는 공간을 만들어주고 read()를 통해서 읽어온 데이터를
			//버퍼라는 공간에 저장을 해주고, 버퍼가 다 차게되면 내보낸다.
			bis = new BufferedInputStream(readFile);
			
			//시작 시간 측정
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			//이미지를 읽는 속도를 측정하려는 것이기 때문에
			//읽기만 한다.
			while(bis.read() != -1) {
				
			}
			//종료 시간 측정
			long end = System.currentTimeMillis();

			double time = (end - (double)start) / 1000;
			System.out.println("소요시간 : " + time + "초");
			System.out.println("보조스트림으로 읽기 종료");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(bis != null) {
					bis.close();
				}
				if(readFile != null) {
					readFile.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
