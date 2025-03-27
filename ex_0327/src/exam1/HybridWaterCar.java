package exam1;

public class HybridWaterCar extends HybridCar{
	int waterGauge;
	
	public HybridWaterCar(int gasGuage,int electricGuage,int waterGauge) {
		super(gasGuage,electricGuage);
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("잔여 물의양 : "+waterGauge);
	}
}
