package model;

import java.util.*;

public class BikeDatabase {

//DATABASE OF AVAILABLE PRODUCTS
	
		private static ArrayList<NormalBike> normalBikeList = new ArrayList<>();
		private static ArrayList<ElectricBike> electricBikeList = new ArrayList<>();
		
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
		
		public BikeDatabase(){
			addNormalBike(new NormalBike(0, 199, 2, "Women", 54, "White"));
			addNormalBike(new NormalBike(1, 199, 2, "Women", 56, "Black"));
			addNormalBike(new NormalBike(2, 199, 2, "Male", 56, "Blue"));
			addNormalBike(new NormalBike(3, 199, 2, "Male", 58, "Grey"));
			
			addElectricBike(new ElectricBike(0, 209, 2, "Women", "100%", 54));
			addElectricBike(new ElectricBike(1, 219, 2, "Women", "88%", 56));
			addElectricBike(new ElectricBike(2, 259, 2, "Men", "95%", 56));
			addElectricBike(new ElectricBike(3, 249, 2, "Men", "90%", 58));
		}
			
		public static void printNormalBikeDatabase() {
			for (NormalBike n: normalBikeList) {
			System.out.println("ID: " + n.getId() + ", Stock Available: " +n.getStockAvailable() + ", Price: " + n.getPrice() + ", Gender: " + n.getGender() + ", Framesize: " + n.getFramesize() + ", Color: " + n.getColor());
					}

		
	}
		
		public static void printElectricBikeDatabase() {
			for (ElectricBike e: electricBikeList) {
			System.out.println("ID: " + e.getId() + ", Stock Available: " + e.getStockAvailable() + ", Price: " + e.getPrice() + ", Gender: " + e.getGender() + ", Battery charge: " + e.getBatteryCharge() + ", KM range " + e.getKmRange());}
					}
	               

		
	
	//WE NEED TO DIVIDE THIS INTO A SWITCH STATEMENT
	//CHANGE THE ID OF THE ELECTRIC BIKES FROM 0-4
	public static void printAll(){
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~NORMAL BIKES~~~~~~~~~~~~~~~~~~~~~~");
		printNormalBikeDatabase();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~ELECTRIC BIKES~~~~~~~~~~~~~~~~~~~~~");
		printElectricBikeDatabase();
		}
	
	//AFTER THE CUSTOMER HAS CHOSEN THE BIKE

	
	
	
	public void testMethod(int index)
	{
		Scanner input = new Scanner(System.in);
		
		
		//GETS THE INDEX OF ELECTRIC BIKE
				
		int bike;
		
		boolean bikeChoice = false;
		while (!bikeChoice) 
		{	
			System.out.println("CHOOSE A BIKE");
			bike = input.nextInt();
			
			if (bike <= 3)
				
			{
			bikeChoice = true; 
			}
			
			else 
			{System.out.println("Error: Wrong input!");
			System.out.print("Enter bike number 0, 1, 2 or 3:          ");
			}
		}
		
		
		bike = index;
		
		
		
		ElectricBike b = getElectricBikeList().get(3);
		
		//YOU CAN PRINT OUT WHATEVER YOU LIKE
		System.out.println("The price for bike ID " + b.getId() + " is " + b.getPrice() + "DKK");
	}

}
