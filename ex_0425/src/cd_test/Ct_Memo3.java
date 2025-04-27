package cd_test;

import java.util.Arrays;

public class Ct_Memo3 {
	public static void main(String[] args) {
		String[] str_list = {"d","r","u"};
		String s = "";
		String[] answer = {};
		int index = 0;
		
		for(int i=0; i<str_list.length; i++) {
			s += str_list[i];
		}
		
		if(s.indexOf("l")==-1 && s.indexOf("r")==-1) {
			answer = new String[0];
			System.out.println("둘다업슴");
		}else {
			if(s.indexOf("l") != -1 && s.indexOf("r")!=-1) {
				if(s.indexOf("l") < s.indexOf("r")) {
					System.out.println("l도 있꼬 r도잇음");
					answer = new String[s.indexOf("l")];
					for(int i=0; i<s.indexOf("l"); i++) {
						answer[index++] = str_list[i];
						System.out.println("r이 더큼");
					}
				}else if(s.indexOf("l") > s.indexOf("r")) {
					System.out.println("r도 있꼬 l도 잇음");
					answer = new String[s.length()-s.indexOf("r")-1];
					for(int i=s.indexOf("r")+1; i<s.length(); i++) {
						answer[index++] = str_list[i];
						System.out.println("l이 더큼");
					}
				}
			}else if(s.indexOf("l") != -1 && s.indexOf("r")==-1) {
				System.out.println("l만있음");
				answer = new String[s.indexOf("l")];
				for(int i=0; i<s.indexOf("l"); i++) {
					answer[index++] = str_list[i];
					System.out.println("r이 더큼");
				}
			} else if(s.indexOf("l") == -1 && s.indexOf("r")!=-1) {
				System.out.println("r만 잇음");
				answer = new String[s.length()-s.indexOf("r")-1];
				for(int i=s.indexOf("r")+1; i<s.length(); i++) {
					answer[index++] = str_list[i];
					System.out.println("l이 더큼");
				}
			}
			
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
