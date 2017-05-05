package model;


public class ElectricBike extends Bikes {
	
	private String batteryCharge; 
	private int kmRange;
	
	ElectricBike(int id, int price, int stockAvailable, String gender, String batteryCharge, int kmRange) 
	
	{
		super(id, price, stockAvailable, gender);
		this.batteryCharge = batteryCharge;
		this.kmRange = kmRange;

	}

	public ElectricBike() {
		// TODO Auto-generated constructor stub
	}

	public String getBatteryCharge() {
		return batteryCharge;
	}

	public void setBatteryCharge(String batteryCharge) {
		this.batteryCharge = batteryCharge;
	}

	public int getKmRange() {
		return kmRange;
	}

	public void setKmRange(int kmRange) {
		this.kmRange = kmRange;
	}
}
	

