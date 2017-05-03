package model;

public class Bikes {
//CLASS LOOKS OK 
//WE SHOULD HAVE A LOOK AT THE SELL PRODUCT FUNCTION, SINCE IT'S CURRENTLY NOT BEING USED? TAKE OUT?
	
	
	protected int id;
	protected int price;
	protected int stockAvailable;
	protected String gender;
	
	public Bikes(int id, int price, int stockAvailable, String gender){
		this.id = id;
		this.price = price;
		this.stockAvailable = stockAvailable;
		this.gender = gender; 
	}	

	public Bikes() {
		// TODO Auto-generated constructor stub
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


	public int getId() {
		return id;
	}

	public void setId(int id) {
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
