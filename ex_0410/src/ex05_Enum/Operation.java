package ex05_Enum;

public enum Operation {
	PLUS{
		@Override
		int apply(int x, int y) {
			return x+y;
		}
	},
	MINUS {
		@Override
		int apply(int x, int y) {
			return x-y;
		}
	},
	MULTI {
		@Override
		int apply(int x, int y) {
			return x*y;
		}
	},
	DIV {
		@Override
		int apply(int x, int y) {
			return x/y;
		}
	};
	
	abstract int apply(int x, int y);
}

//Operation 열거형을 정의하고
//추상메서드 apply(int x, int y)를 갖고 있다.
//PLUS,MINUS,MULTI,DIV 상수를 가지고 있습니다.
//main 메서드에서 모든 연산을 수행하여 출력하세요. 