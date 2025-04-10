package ex05_Enum;

public class WeekdayMain {
	public static void main(String[] args) {
//		Weekday[] day = Weekday.values();
//		
//		for(Weekday days : day) {
//			if(days.name() == "SUNDAY") {
//				System.out.println(days.name() + " 쉬는날입니다.");
//			}else {
//				System.out.println(days.name() + " 출근하는 날입니다.");
//			}
//		}
		
		Weekday today = Weekday.SUNDAY;
		
		if(today == Weekday.SUNDAY) {
			System.out.println("쉬는날입니다.");
		}else {
			System.out.println("출근하는 날입니다.");
		}
		
		
	}
}
