package ex05_Generic;

import java.util.ArrayList;
import java.util.List;

public class Gen {
	
	public <T> void printArr(T[] arr) {
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr);
//		}
		for(T x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}


	
	
}
