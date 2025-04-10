package ex05_Enum;

public class OrderStatusMain {
	public static void main(String[] args) throws Exception {
		OrderStatus status = OrderStatus.ORDERED;
		
		try {
			System.out.println("현재 상태 : " + status);
			status = status.next();
			System.out.println("현재 상태 : " + status);
			status = status.next();
			System.out.println("현재 상태 : " + status);
			status = status.next();
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
	}
}
