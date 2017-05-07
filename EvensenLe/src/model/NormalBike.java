package model;

public class NormalBike extends Bikes {
//CLASS LOOKS OK 
	
	private String color;
	private int framesize;
	
	public NormalBike(String type, String id, int price, int stockAvailable, String gender, int framesize, String color) 
	
	{
		super(type, id, price, stockAvailable, gender);
this.framesize = framesize;
this.color = color; 


	}

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
	
	public String displayNormalBike() {
		return ("Type: " + this.getType() + "ID: " + this.getId() + ", Stock Available: " + this.getStockAvailable() + ", Price: " + this.getPrice() + 
				", Gender: " + this.getGender() + ", Framesize: " + this.getFramesize() + ", Color: " + this.getColor());
			}
	
}
