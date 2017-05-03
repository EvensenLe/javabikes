package model;

import java.util.*;

public class BikeDatabase {

//DATABASE OF AVAILABLE PRODUCTS
//CLASS LOOKS OK 
	
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
			addNormalBike(new NormalBike(0, 2, 199, "Women", 54, "White"));
			addNormalBike(new NormalBike(1, 2, 199, "Women", 56, "Black"));
			addNormalBike(new NormalBike(2, 2, 199, "Male", 56, "Blue"));
			addNormalBike(new NormalBike(3, 2, 199, "Male", 58, "Grey"));
			
			addElectricBike(new ElectricBike(0, 2, 209, "Women", 54, "Rainbow"));
			addElectricBike(new ElectricBike(1, 2, 219, "Women", 56, "Purple"));
			addElectricBike(new ElectricBike(2, 2, 259, "Male", 56, "Green"));
			addElectricBike(new ElectricBike(3, 2, 249, "Male", 58, "Brown"));
		}
			
		public static void printNormalBikeDatabase() {
			for (NormalBike n: normalBikeList) {
			System.out.println("ID: " + n.getId() + ", Stock Available: " +n.getStockAvailable() + ", Price: " + n.getPrice() + ", Gender: " + n.getGender() + ", Framesize: " + n.getFramesize() + ", Color: " + n.getColor());
					}

		
	}
		
		public static void printElectricBikeDatabase() {
			for (ElectricBike e: electricBikeList) {
			System.out.println("ID: " + e.getId() + ", Stock Available: " + e.getStockAvailable() + ", Price: " + e.getPrice() + ", Gender: " + e.getGender() + ", Framesize: " + e.getFramesize() + ", Color: " + e.getColor());}
					}
			
			public static void printChosen() {
				
			Scanner input = new Scanner(System.in);
			System.out.print("Which bike would you like?");
			int choice = input.nextInt();
			
			
			}
	               

		
	
		//WE NEED TO DIVIDE THIS INTO A SWITCH STATEMENT
			//CHANGE THE ID OF THE ELECTRIC BIKES
	public static void printAll(){
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~NORMAL BIKES~~~~~~~~~~~~~~~~~~~~~~");
		printNormalBikeDatabase();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~ELECTRIC BIKES~~~~~~~~~~~~~~~~~~~~~");
		printElectricBikeDatabase();
		printChosen();
		}
	
	//AFTER THE CUSTOMER HAS CHOSEN THE BIKE

	
	
	
	public void testMethod(int index)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("CHOOSE A BIKE");
		int bike = input.nextInt();
		
		bike = index;
		
		
		//GETS THE INDEX OF ELECTRIC BIKE
		ElectricBike b = getElectricBikeList().get(index);
		

		
		//YOU CAN PRINT OUT WHATEVER YOU LIKE
		System.out.println("The price for bike ID " + b.getId() + " is " + b.getPrice() + "DKK");
		
	}

}
