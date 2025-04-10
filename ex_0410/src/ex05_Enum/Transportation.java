package ex05_Enum;

//추상메서드를 가진다고 해도 추상클래스가 되는 것은 아니다.
//enum 자체는 추상메서드를 정의할 수가 있고,
//상수들이 그 메서드를 구현을 해야한다.
public enum Transportation {
	BUS(100) {
		@Override
		int totalFare(int distance) {
			return distance*fare;
		}
	},
	TRAIN(150) {
		@Override
		int totalFare(int distance) {
			return distance*fare;
		}
	},
	SHIP(200) {
		@Override
		int totalFare(int distance) {
			return distance*fare;
		}
	},
	AIRPLANE(250) {
		@Override
		int totalFare(int distance) {
			return distance*fare;
		}
	};
	
	int fare; //운임요금
	
	private Transportation(int fare) {
		this.fare = fare;
	}
	
	//추상 메서드를 정의하면
	//직접 구현을 해야한다면 오류가 난다.
	abstract int totalFare(int distance);
	
}
