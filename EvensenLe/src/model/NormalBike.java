package model;

public class NormalBike extends Bikes {
	
	private String color, gender;
	private int framesize;
	
	public NormalBike(int id, int stockAvailable, int price, String gender, int framesize, String color) 
	
	{
		super(id, price, stockAvailable);
this.framesize = framesize;
this.color = color; 
this.gender = gender; 

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getFramesize() {
		return framesize;
	}

	public void setFramesize(int framesize) {
		this.framesize = framesize;
	}

}
