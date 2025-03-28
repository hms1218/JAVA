package ex01_innerClass;

interface buttonClickListener{
	public void click();
}


public class AnonymousExample {
	public class Button{
		private buttonClickListener listener;
		
		public void setListener(buttonClickListener listener) {
			this.listener = listener;
		}
		
		public void click(){
			if(listener != null) {
				this.listener.click();
			}
		}
		
	}
	
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
		
		//ButtonImpl bi = new ButtonImpl();
		button.setListener(new buttonClickListener() {
			@Override
			public void click() {
				System.out.println("버튼 클릭됨");
			}
		});
		
		button.click();
	}
	
	
	
}
