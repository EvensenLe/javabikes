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
			//we need to add whether it's an ebike or nbike
			addNormalBike(new NormalBike(100, 2, 199, "Women", 54, "White"));
			addNormalBike(new NormalBike(101, 2, 199, "Women", 56, "Black"));
			addNormalBike(new NormalBike(102, 2, 199, "Male", 56, "Blue"));
			addNormalBike(new NormalBike(103, 2, 199, "Male", 58, "Grey"));
			
			addElectricBike(new ElectricBike(200, 2, 249, "Women", 54, "Rainbow"));
			addElectricBike(new ElectricBike(201, 2, 249, "Women", 56, "Purple"));
			addElectricBike(new ElectricBike(202, 2, 249, "Male", 56, "Green"));
			addElectricBike(new ElectricBike(203, 2, 249, "Male", 58, "Brown"));
		}
			
		public static void printNormalBikeDatabase() {
			for (NormalBike n: normalBikeList) {
			System.out.println("ID: " + n.getId() + ", Stock Available: " + ", Price: " + n.getPrice() + ", Gender: " + n.getGender() + ", Framesize: " + n.getFramesize() + ", Color: " + n.getColor());
					}
//HOW TO PRINT OUT STOCK AVAILABILITY?
		
	}
		
		public static void printElectricBikeDatabase() {
			for (ElectricBike e: electricBikeList) {
			System.out.println("ID: " + e.getId() + ", Stock Available: " + ", Price: " + e.getPrice() + ", Gender: " + e.getGender() + ", Framesize: " + e.getFramesize() + ", Color: " + e.getColor());
					}

		
	}
		
	public static void printAll(){
		printNormalBikeDatabase();
		printElectricBikeDatabase();
		}

}
