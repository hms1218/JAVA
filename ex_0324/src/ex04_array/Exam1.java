package ex04_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int[] iArr = new int[10];
		//배열에 각각의 인덱스에 1~10를 할당하고
		//총 합을 구하여 출력하세요.
		int sum = 0;
		for(int i=0;i<iArr.length;i++) {
			iArr[i] = i+1;
			System.out.printf("iArr[%d] : %d\n",i,(i+1));
			sum += iArr[i];
		}
		System.out.println("총합 : "+sum);
		
		//iArr에 각 index에 난수를 넣고
		//배열의 짝수 요소들의 총 합 구하기
		
		Random rd = new Random();
		int sum1 = 0;
		
		for(int i=0; i<iArr.length; i++) {
			int random = rd.nextInt(30)+1;
			iArr[i] = random;
			System.out.println(random);
			if(iArr[i]%2==0) {
				sum1 += random;
			}
		}
		System.out.println("총합 : "+sum1);
		
		int[] nums = {5,7,2,9,4,10,3};
		int max = nums[0];
		int min = nums[0];
		//배열에서 최대값과 최소값을 출력하는 프로그램 만들기
		for(int i=1;i<nums.length;i++) {
			if(max < nums[i]) {
				max = nums[i];
			}
			if(min > nums[i]) {
				min = nums[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		System.out.println("-----------------------------");
		
		int[] nums2 = {1,2,1,3,2,1,4};
		//위 배열에서 각 숫자가 몇 번 나왔는지 출력하시오.
		//1 : 3번
		//2 : 2번
		//3 : 1번
		//4 : 1번
//		int cnt = 0;
//		for(int i=0; i<nums2.length; i++) {
//			if(nums2[0]==nums2[i]) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
		int[] count = new int[5];
		for(int i=0; i<nums2.length;i++) {
			count[nums2[i]]++;
			//count[1] count[2] count[1] count[3] count[2] count[1] count[4]
			
		}
		for(int i=1; i<=4; i++) {
			System.out.printf("%d : %d번\n",i,count[i]);
		}
		
		int[] nums3 = {5,3,8,4,2};
		//오름차순으로 정렬하세요
		
		//1. 버블정렬
		//인접한 두 요소를 비교해서 큰 값을 뒤로 보내는 정렬 방식
		int temp = 0;
		for(int i=0;i<nums3.length-1;i++) {
			for(int j=0; j<nums3.length-1-i; j++) {
				if(nums3[j]>nums3[j+1]) {
					temp = nums3[j];
					nums3[j] = nums3[j+1];
					nums3[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums3));
		
		char[] cards = {'1','L','O','2','V','3','E'};
		String myWord = "";
		
		//배열에서 영문자만 추출하여 이어붙혀 출력
		for(int i=0;i<cards.length;i++) {
			if(cards[i]>=65 && cards[i]<=90) {
				myWord += cards[i];
			}
		}
		System.out.println(myWord);
		
		//키보드에서 배열의 길이를 입력받는다.
		//입력받은 배열의 길이만큼 알파벳을 넣고 출력한다.
		//배열의 길이 : 5
		//ABCDE
		
		//배열의 길이 : 3
		//ABC
		
		//int[] arr = new int[길이];
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("배열의 길이 : ");
//		int length = sc.nextInt();
//		int[] arr = new int[length];
//		String al = "";
//		char f = 'A';
//		//char[] c = new char[length];
//		//char c2 = 'A';
//		for(int i=0; i<arr.length; i++) {
//			al += f;
//			f++;
//		}
//		System.out.println(al);
		
		//동전의 개수 구하기
		//10 ~ 5000 사이의 난수를 변수에 담는다.
		//1의 자리는 반드시 0이 되도록 한다.
		//발생된 난수를 각 동전으로 바꿀 때 몇개씩 필요한지 판단하여 작성하세요.
		//가능한 적은 수의 동전을 사용한다.
		
		//4170원
		//500원 : 8개
		//100원 : 1개
		//50원 : 1개
		//10원 : 2개
		
		int money = rd.nextInt(500)+1;
		money *= 10;
		int fiveHd = 0;
		int hd = 0;
		int fifty = 0;
		int ten = 0;
		
		int[] coin = {500,100,50,10};
		
		fiveHd = money / 500;
		hd = (money-fiveHd) / 100;
		fifty = (fiveHd-hd) / 50;
		ten = (hd-fifty) / 10;
		System.out.printf("%d,%d,%d,%d",fiveHd,hd,fifty,ten);
		
		System.out.println();
		
		System.out.println("금액 : "+money);
		for(int i=0; i<coin.length; i++) {
			int res = money / coin[i];
			System.out.printf("%d원 : %d\n",coin[i],res);
			money %= coin[i];
		}
		
		//로또번호 생성하기
		//1~45사이의 난수를 발생시켜 로또번호를 생성하는 프로그램 만들기
		
		
		for(int i=0; i<6; i++) {
			int lotto = rd.nextInt(45)+1;
	
			if(i>0) {
				
			}
			
			System.out.println(lotto);
		}
		
	}
	
}
