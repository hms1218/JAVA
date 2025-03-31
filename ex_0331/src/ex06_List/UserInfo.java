package ex06_List;

public class UserInfo {
	private String id;
	private int pw;
	
	//1. setter&getter
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPw(int pw) {
		this.pw = pw;
	}
	
	public String getId() {
		return id;
	}
	
	public int getPw() {
		return pw;
	}
	
	//2. 생성자를 통해서 받는다.
//	public UserInfo(String id, int pw) {
//		this.id = id;
//		this.pw = pw;
//	}
}

//유저의 아이디와 패스워드를 가지는 
//UserInfo 클래스를 하나 만든다. 필드는 private으로 지정한다.
//Main클래스에서 유저의 정보를
//ArrayList에 추가하여 출력해보자

//---결과---
//아이디 생성 : aaa
//패스워드 입력 : 1234
//aaa
//1234
//------------------
//아이디 생성 : bbb
//패스워드 입력 : 5678
//aaa
//1234
//------------------
//bbb
//5678
//------------------