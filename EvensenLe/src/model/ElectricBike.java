package model;

import data.ReceiptDataFile;

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
	
	public String displayElectricBike() {
		return ("ID: " + this.getId() + ", Stock Available: " + this.getStockAvailable() + ", Price: " + this.getPrice() + ", Battery charge: " + this.getBatteryCharge() + ", KM range: " + this.getKmRange());
				}
	
	@Override
	public String toString() {
		return (this.getId() + ", Stock Available: " + this.getStockAvailable() + ", Price: " + this.getPrice() + ", Battery charge: " + this.getBatteryCharge() + ", KM range: " + this.getKmRange());
	}
/*
	/** method to write to file */
	//public void writeToFile(){
		//String receipt = this.getId() + ", Stock Available: " + getStockAvailable() + ", Price: " + this.getPrice() + ", Battery charge: " + this.getBatteryCharge() + ", KM range: " + this.getKmRange();
	//	ReceiptDataFile.writeArrayEBikeDetails("receiptfile.txt", receipt);
	}
	

