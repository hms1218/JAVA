package ex01_multi_array;

import java.util.Arrays;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int[][] arr = {
						{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15},
						{16,17,18,19,20}
					};
		//배열 arr의 총합과 평균을 구하시오.
		//총합 : 
		//평균 : 
		
		int sum = 0;
		int count = 0;
		float avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				count++;
				
			}
		}
		avg = (float)sum/count;
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+avg);
		
		System.out.println("--------------------------------");
		
		//학생들의 정보를 입력하고, 출력하는 프로그램 작성하기
		//학생들의 수학과 영어성적을 등록하는 프로그램
		//1. 프로그램을 실행하면 몇 명의 정보를 저장할 것인지 입력받는다.
		//2. 입력받은 수 만큼 학생들의 이름, 수학, 영어성적을 입력받는 프로그램 작성하기(String)
		
		//예시
		//등록할 인원 수 : 2
		//이름 : 홍길동
		//수학 : 90
		//영어 : 85
		//-------------------------
		//이름 : 독고길동
		//수학 : 40
		//영어 : 100
		//-------------------------
		//2명 등록 완료
		//홍길동 90 85
		//독고길동 70 100
		
		Scanner sc = new Scanner(System.in);
		System.out.println("등록할 인원 수 : ");
		int people = sc.nextInt();
		
		String[][] students = new String[people][3];
		
		for(int i=0; i<students.length;i++) {
			System.out.println("이름 : ");
			students[i][0] = sc.next();
			System.out.println("수학 : ");
			students[i][1] = sc.next();
			System.out.println("영어 : ");
			students[i][2] = sc.next();
			System.out.println("------------------");
		}
		
		System.out.println(people+"명 등록 완료");
		
		for(int i=0; i<students.length; i++) {
			for(int j=0; j<students[i].length; j++) {
				System.out.print(students[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
