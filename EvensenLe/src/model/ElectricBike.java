package model;


public class ElectricBike extends Bikes {
	
	private String batteryCharge; 
	private int kmRange;
	
	ElectricBike(String type, String id, int price, int stockAvailable, String gender, String batteryCharge, int kmRange) 
	
	{
		super(type, id, price, stockAvailable, gender);
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
	
	public String displayElectricBike() {
		return ("Type: " + this.getType() + "ID: " + this.getId() + ", Stock Available: " + this.getStockAvailable() + ", Price: " + this.getPrice() + 
				", Gender: " + this.getGender() + ", Battery Charge: " + this.getBatteryCharge() + ", KM Range: " + this.getKmRange());
			}
	
}
	

