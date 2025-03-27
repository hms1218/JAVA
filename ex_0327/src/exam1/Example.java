package exam1;

class A{
    public A(){
    	System.out.println("A");
    }
    public A(int x){
    	System.out.println("A: " + x);
    }
}

class B extends A{
    public B(){
    	super(100);
    }
    public B(int x){
    	super(); // 생략되어있음
    	System.out.println("B: "+x);
    }
}


public class Example{
	public static void main(String[] args){
	    B b = new B(11);
	}
}


//출력 결과를 예상하여 작성하시오.
//A
//B : 11