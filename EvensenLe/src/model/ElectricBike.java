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
		return (System.lineSeparator() + "Type: " + this.getType() + System.lineSeparator() + "ID: " + this.getId() + System.lineSeparator() +"Stock Available: " + this.getStockAvailable() + System.lineSeparator() + "Price: " + this.getPrice() +System.lineSeparator() + 
				"Gender: " + this.getGender() + System.lineSeparator()+ "Battery Charge: " + this.getBatteryCharge() + System.lineSeparator() + "KM Range: " + this.getKmRange());
			}
	
}
	

