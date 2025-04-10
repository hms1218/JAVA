package ex05_Enum;

public class OperationMain {
	public static void main(String[] args) {
		
		Operation[] op = Operation.values();
		
		int a = 20;
		int b = 5;
		
		for(Operation ops : op) {
			System.out.println(ops.name() + " : " + ops.apply(a, b));
		}
	}
}
