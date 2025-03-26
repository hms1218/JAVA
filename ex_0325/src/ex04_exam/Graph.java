package ex04_exam;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] random = new int[100];
		int[] count = new int[10];
		
		for(int i=0; i<random.length; i++) {
			random[i] = rd.nextInt(10);
			count[random[i]]++;
		}
		
		PrintGraph pg = new PrintGraph();
		for(int i=0; i<count.length; i++) {
			System.out.printf("%d의 개수 : %s %d\n",i,pg.print('#',count[i]),count[i]);
		}
		
		
		
		
		
		
		
	}
}
