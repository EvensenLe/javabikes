package model;

public class Bikes {

	protected String type, id, gender;
	protected int price, stockAvailable;

	//CONSTRUCTOR WITH SPECIFICS
	public Bikes(String type, String id, int price, int stockAvailable, String gender){
		this.type = type;
		this.id = id;
		this.price = price;
		this.stockAvailable = stockAvailable;
		this.gender = gender; 
	}	

	//CONSTRUCTOR
	public Bikes() {
	}

	//GENERATE GETTERS AND SETTERS
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getStockAvailable() {
		return stockAvailable;
	}



	public void setStockAvailable(int stockAvailable) {
		this.stockAvailable = stockAvailable;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void sellProduct() {
		stockAvailable--;
	}



}
