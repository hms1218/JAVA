package ex04_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//메모장 프로그램 만들기
		//사용자가 키보드로 입력한 내용을 "memo.txt"에 저장하고
		//입력이 종료되면 해당 파일의 내용을 다시 읽어서 화면서 출력하기
		//사용자로부터 여러 줄의 텍스트를 입력받는다.
		//사용자가 exit 입력하면 종료합니다.
		//FileReader, FileWriter
//	      메모 입력 (exit 입력 시 종료):
//	      > 오늘 날씨가 좋다.
//	      > 내일은 시험이다.
//	      > exit
//	
//	      저장 완료. 저장된 메모 내용:
//	      오늘 날씨가 좋다.
//	      내일은 시험이다.
		
		//단어의 빈도수
		//오늘 : 1
		//날씨가 : 1
		//좋다 : 1
		
		FileReader fr = null;
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		List<String> lines = new ArrayList<>();
		//파일 쓰기
		try {

			fw = new FileWriter("C:\\Users\\admin\\Desktop\\full_stack_hms\\memo.txt");
			
			
			System.out.println("메모 입력 (exit 입력 시 종료) : ");
			while(true) {		
				System.out.print("> ");
				String memo = sc.nextLine();
				
				if(memo.equalsIgnoreCase("exit")) {
					System.out.println("저장 완료. 저장된 메모 내용:");
					break;
				}
				//메모장에 쓰기 전에 ArrayList에 추가
				lines.add(memo);
				
				fw.write(memo+"\n");
		
			}
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
		//단어별 빈도수 계산
		//Hello world
		//Hello Java
		//I love Java
		
		//Hello : 2
		//world : 1
		//Java : 2
		//I : 1
		//love : 1
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		
		for(String memo : lines) {
			String[] words = memo.toLowerCase().split(" ");
			for(String word : words) {
				if(word.isEmpty()) continue;
				wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
			}
		}
		
		//result.txt에 저장
		try {
			fw = new FileWriter("C:\\Users\\admin\\Desktop\\full_stack_hms\\result.txt");
			for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
				fw.write(entry.getKey() + " : " + entry.getValue() + "\n");
			}
			System.out.println("단어 빈도수 저장 완료");
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//파일 읽기
		try {
			fr = new FileReader("C:\\Users\\admin\\Desktop\\full_stack_hms\\memo.txt");
			
			int code = 0;
			
			while((code = fr.read()) != -1) {
				System.out.print((char)code);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
		//단어 빈도수 파일 읽기
		try {
			fr = new FileReader("C:\\Users\\admin\\Desktop\\full_stack_hms\\result.txt");
			
			int code = 0;
			System.out.println();
			System.out.println("단어의 빈도수");
			while((code = fr.read()) != -1) {
				System.out.print((char)code);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
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
