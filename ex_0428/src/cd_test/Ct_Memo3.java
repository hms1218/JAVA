package cd_test;

import java.util.Arrays;

public class Ct_Memo3 {
	public static void main(String[] args) {
		String[] picture = 
			{".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
		int k = 2;
		String s = "";
		int count = 0;
		int index = 0;
		
		for(String p : picture) {
			for(int i=0; i<p.length(); i++) {
				s += p.charAt(i);
			}
		}
		
		System.out.println(s);
		
	}
}
