package model;

import java.util.*;

public class BikeDatabase {

	//DATABASE OF AVAILABLE PRODUCTS
	//CREATE TWO ARRAYLISTS, ONE FOR NORMAL AND ONE FOR ELECTRIC
	private static ArrayList<NormalBike> normalBikeList = new ArrayList<>();
	private static ArrayList<ElectricBike> electricBikeList = new ArrayList<>();
	private static String bikeReceipt; 

	//GENERATE GETTERS AND SETTERS
	public ArrayList<NormalBike> getNormalBikeList() {
		return normalBikeList;
	}
	public void setNormalBikeList(ArrayList<NormalBike> normalBikeList) {
		BikeDatabase.normalBikeList = normalBikeList;


	}
	public ArrayList<ElectricBike> getElectricBikeList() {
		return electricBikeList;
	}
	public void setElectricBikeList(ArrayList<ElectricBike> electricBikeList) {
		BikeDatabase.electricBikeList = electricBikeList;

	}

	public void addElectricBike(ElectricBike ebike){
		BikeDatabase.electricBikeList.add(ebike);

	}

	public void addNormalBike(NormalBike nbike){
		BikeDatabase.normalBikeList.add(nbike);

	}

	public static String getBikeReceipt() {
		return bikeReceipt;
	}

	public static void setBikeReceipt(String bikeReceipt) {
		BikeDatabase.bikeReceipt = bikeReceipt;
	}
	//BIKE DATABASE
	//ADD TO ARRAYLIST
	public BikeDatabase(){
		addNormalBike(new NormalBike("Normal Bike", "0", 199, 2, "Women", 54, "White"));
		addNormalBike(new NormalBike("Normal Bike", "1", 199, 2, "Women", 56, "Black"));
		addNormalBike(new NormalBike("Normal Bike", "2", 199, 2, "Male", 56, "Blue"));
		addNormalBike(new NormalBike("Normal Bike", "3", 199, 2, "Male", 58, "Grey"));

		addElectricBike(new ElectricBike("Electric Bike", "4", 209, 2, "Women", "100%", 54));
		addElectricBike(new ElectricBike("Electric Bike", "5", 219, 2, "Women", "88%", 56));
		addElectricBike(new ElectricBike("Electric Bike", "6", 259, 2, "Men", "95%", 56));
		addElectricBike(new ElectricBike("Electric Bike", "7", 249, 2, "Men", "90%", 58));


	}
	//METHOD TO PRINT OUT NORMAL BIKE DATABASE
	public static void printNormalBikeDatabase() {
		for (NormalBike n: normalBikeList) {
			System.out.println("ID: " + n.getId() + ", Stock Available: " +n.getStockAvailable() + ", Price: " + n.getPrice() + ", Gender: " + n.getGender() + ", Framesize: " + n.getFramesize() + ", Color: " + n.getColor());
		}
	}
	//METHOD TO PRINT OUT ELECTRIC BIKE DATABASE
	public static void printElectricBikeDatabase() {
		for (ElectricBike e: electricBikeList) {
			System.out.println("ID: " + e.getId() + ", Stock Available: " + e.getStockAvailable() + ", Price: " + e.getPrice() + ", Gender: " + e.getGender() + ", Battery charge: " + e.getBatteryCharge() + ", KM range " + e.getKmRange());}
	}

	//METHOD TO PRINT OUT CHOSEN NORMAL BIKE
	//USING FOR LOOP AND CHECK IF THE ID EQUALS THE REAL BIKE ID
	public static void normalBikeChosen() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Type in the bike ID here:             ");
		String checkId = input.next();

		for (NormalBike n: normalBikeList) 
		{	
			if (n.getId().equals(checkId))
			{
				System.out.println("Your bike chosen is: " + n.displayNormalBike());
				bikeReceipt = n.displayNormalBike();
			}
		}
	}

	//METHOD TO PRINT OUT CHOSEN ELECTRIC BIKE
	//USING FOR LOOP AND CHECK IF THE ID EQUALS THE REAL BIKE ID
	public static void electricBikeChosen() {
		Scanner input = new Scanner(System.in);
		System.out.println("Type in the bike ID here: \n");
		String checkId = input.next();

		for (ElectricBike e: electricBikeList) {

			if (e.getId().equals(checkId))
				System.out.println("Your bike chosen is: " + e.displayElectricBike());
			bikeReceipt = e.displayElectricBike();
		}
	}


}
