package model;

public class Bikes {
//CLASS LOOKS OK 
//WE SHOULD HAVE A LOOK AT THE SELL PRODUCT FUNCTION, SINCE IT'S CURRENTLY NOT BEING USED? TAKE OUT?
	
	
	protected int id;
	protected int price;
	protected int stockAvailable;
	
	public Bikes(int id, int price, int stockAvailable){
		this.id = id;
		this.price = price;
		this.stockAvailable = stockAvailable;
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
