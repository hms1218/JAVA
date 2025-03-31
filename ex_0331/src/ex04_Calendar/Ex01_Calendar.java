package ex04_Calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Ex01_Calendar {
	public static void main(String[] args) {
		//java.util에 있는 날짜와 시간 정보를 제공해주는 클래스
		//객체를 만들 때 new 키워드를 사용하지 않고 생성된 객체를 받아온다.
		
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //MONTH : 0~11까지 -> +1
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.printf("오늘 날짜는 %d년 %d월 %d일 입니다.\n",year,month,day);
		
		//LocalDateTime
		//날짜 + 시간
		//java.time패키지에 있음
		
		//now()
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//of()
		//특정 날짜와 시간 만들기
		LocalDateTime dt = LocalDateTime.of(2025,3,31,11,4,30);
		System.out.println("지정한 날짜와 시간 : " + dt );
		
		//날짜/시간 값 얻기
		System.out.println("연도 : " + dt.getYear());
		System.out.println("월 : " + dt.getMonthValue());
		System.out.println("일 : " + dt.getDayOfMonth());
		System.out.println("시 : " + dt.getHour());
		System.out.println("분 : " + dt.getMinute());
		System.out.println("초 : " + dt.getSecond());
		
		//날짜/시간 더하고 빼기
		dt = LocalDateTime.now();
		LocalDateTime tomorrow = dt.plusDays(1);
		LocalDateTime twoHoursAgo = dt.minusHours(2);
		System.out.println("내일 : " + tomorrow);
		System.out.println("2시간 전 : " + twoHoursAgo);
		
		//날짜/시간 비교
		LocalDateTime future = dt.plusDays(1);
		System.out.println("지금이 미래보다 이전인가? " + dt.isBefore(future));
		System.out.println("지금이 미래보다 이후인가? " + dt.isAfter(future));
		
		//날짜/시간 포맷
		dt = LocalDateTime.of(2025,3,31,14,30);
		//java.time 패키지에 있는 클래스
		//날짜나 시간을 문자열로 변경해줄 수 있고
		//문자열로 된 시간을 날짜/시간 타입으로 변경해줄 수 있다.
		
		//형식을 객체형태로 가지고 있음
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분");
		//날짜를 형식에 맞게 문자열 형태로 변경
		String formatted = dt.format(formatter);
		System.out.println("포맷된 출력 : " + formatted);
		
		//자주 쓰는 형식 패턴
		//yyyy : 년도(4자리)
		//yy : 년도(2자리)
		//MM : 월
		//dd : 일
		//HH : 시(24시간)
		//hh : 시(12시간)
		//mm : 분
		//ss : 초
		//a : 오전/오후
		//E : 요일 -> Mon, Tue...
		//EEEE : 요일(풀네임) -> Monday, Tuesday...
		
		
		
		
		
		
	}
}
