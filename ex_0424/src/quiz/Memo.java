package quiz;

public class Memo {
	public static void main(String[] args) {
		 String s = "가기가";
		 
		 StringBuilder sb = new StringBuilder(s);
		 
		 String rv = sb.reverse().toString();
		 System.out.println(rv);
		 
		 if(s.equals(rv)) {
			 System.out.println("회문입니다.");
		 }else {
			 System.out.println("회문아님");
		 }
	}
}
