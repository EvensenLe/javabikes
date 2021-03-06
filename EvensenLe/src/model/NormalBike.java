package model;

//EXTENDING BIKES CLASS
public class NormalBike extends Bikes {

	private String color;
	private int framesize;

	public NormalBike(String type, String id, int price, int stockAvailable, String gender, int framesize, String color) 

	{   //USING SUPER CLASS
		super(type, id, price, stockAvailable, gender);

		this.framesize = framesize;
		this.color = color; 


	}
	//GENERATE GETTERS AND SETTERS
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public int getFramesize() {
		return framesize;
	}

	public void setFramesize(int framesize) {
		this.framesize = framesize;
	}

	//STRING METHOD TO DISPLAY NORMAL BIKE DETAILS
	public String displayNormalBike() {
		return (System.lineSeparator() + "Type: " + this.getType() + System.lineSeparator() + "ID: " + this.getId() + System.lineSeparator() + "Stock Available: " + this.getStockAvailable() + System.lineSeparator() + "Price: " + this.getPrice() + System.lineSeparator() + 
				"Gender: " + this.getGender() + System.lineSeparator() + "Framesize: " + this.getFramesize() + System.lineSeparator() + "Color: " + this.getColor());
	}

}
