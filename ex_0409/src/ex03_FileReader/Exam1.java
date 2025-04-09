package ex03_FileReader;

import java.io.FileReader;

public class Exam1 {
	public static void main(String[] args) {
		//text.txt파일을 만들고 한글,영어(대문자,소문자)섞어서 작성
		//text.txt파일의 내용을 읽어와서
		//영어 대문자의 갯수, 소문자의 갯수를 판별하여 출력하세요.
		//대문자 : x개
		//소문자 : x개
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("C:\\Users\\admin\\Desktop\\full_stack_hms\\text.txt");
			
			int code = 0;
			int upperCount = 0;
			int lowerCount = 0;
			while((code = fr.read()) != -1) {
				if((char)code>='A' && (char)code<='Z') {
					upperCount++;
				}
				if((char)code>='a' && (char)code<='z') {
					lowerCount++;
				}
				System.out.print((char)code);
			}
			System.out.println();
			System.out.println("대문자 : " + upperCount +"개");
			System.out.println("소문자 : " + lowerCount +"개");
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
