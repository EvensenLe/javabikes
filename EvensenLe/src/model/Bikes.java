package model;

public class Bikes {
//CLASS LOOKS OK 
//WE SHOULD HAVE A LOOK AT THE SELL PRODUCT FUNCTION, SINCE IT'S CURRENTLY NOT BEING USED? TAKE OUT?
	
	
	protected String id;
	protected int price;
	protected int stockAvailable;
	protected String gender;
	
	public Bikes(String id, int price, int stockAvailable, String gender){
		this.id = id;
		this.price = price;
		this.stockAvailable = stockAvailable;
		this.gender = gender; 
	}	

	public Bikes() {
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
