package ex02_BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex01_BufferedReader {
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("C:\\Users\\admin\\Desktop\\full_stack_hms\\book.txt");
			br = new BufferedReader(fr);
			
			String str = "";
			//버퍼에 문자를 저장하기 때문에 한번에 불러오는 것이 가능하다.
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
