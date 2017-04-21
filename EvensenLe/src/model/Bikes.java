package model;

public class Bikes {
	
	protected int id;
	protected int price;
	protected int stockAvailable;
	
	public Bikes(int id, int price, int stockAvailable){
		this.id = id;
		this.price = price;
		stockAvailable++; //so everytime a product object is created this is incremented.
	
	}
	


	public Bikes(){
		stockAvailable++; //so everytime a product object is created this is incremented.
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
