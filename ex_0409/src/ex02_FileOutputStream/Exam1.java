package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//학생의 이름과 점수를 저장하는 프로그램
//이름과 점수를 FileOutputStream을 이용하여 scores.txt파일에 저장하세요.

//요구사항
//1. 사용자로부터 이름과 점수를 입력받는다. (Scanner)
//2. 입력받은 데이터를 "이름 : 점수 \n" 형식으로 문자열로 만들어 파일에 쓴다.
//ex) "김철수 : 84"
//3. 이름에 exit를 입력하면 프로그램 종료
//4. 파일은 scores.txt로 저장되며, 기존 내용은 덮어쓴다.
//5. "이름 : 점수" 형식의 문자열의 각 문자의 char값을 +3을 해 암호화한다.
//ex) John : 85\n -> Mrkq#=#;8

public class Exam1 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			fos = new FileOutputStream("C:\\Users\\admin\\Desktop\\full_stack_hms\\scores.txt");
			
			while(true) {
				System.out.print("이름 : ");
				String name = sc.next();
				//equalsIgnoreCase : 대문자 무시하고 값을 검증
				if(name.equalsIgnoreCase("exit")) {
					System.out.println("탈출");
					break;
				}
				
				System.out.print("점수 : ");
				int score = sc.nextInt();
				
				String line = name + " : " + score + "\n";
				
				//String msg = " : ";
				//String n = "\n";
				
				//fos.write((name+msg+score+n).getBytes());
				//fos.write(line.getBytes());
				
				String res = "";
				
				for(int i=0; i<line.length(); i++) {
					res += (char)(line.charAt(i)+3);
				}
				
				fos.write(res.getBytes());
				
				System.out.println("생성 완료");
				
			}

		} catch (Exception e) {
			
		} 
		
		//복호화를 해서 콘솔에 출력하기
		
		File f = new File("C:\\Users\\admin\\Desktop\\full_stack_hms\\scores.txt");
		FileInputStream fis = null;
		byte[] buffer = new byte[(int)f.length()];
		
		try {
			fis = new FileInputStream(f);
			
			fis.read(buffer);
			
			String content = new String(buffer);
			
			String res = "";
			
			for(int i=0; i<content.length(); i++) {
				res += (char)(content.charAt(i)-3);
			}
			System.out.println("복호화 결과 :");
			System.out.println(res);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			try {
				if(fos != null) {
					fos.close();
				}
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
	}
}
