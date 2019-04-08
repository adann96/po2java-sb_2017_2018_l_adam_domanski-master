import java.util.Vector;

public class Identyficator implements Comparable {
	int buildingNumber;
	Vector<Integer> floorNumber = new Vector<Integer>();
	Vector<Integer> roomNumber = new Vector<Integer>();

	public void compareFloors(Building budynek){
			if(floorNumber.size() > budynek.id.floorNumber.size())
				System.out.println("Budynek nr: " + buildingNumber + " ma wiecej pieter od budynku nr: " + budynek.id.buildingNumber);
			else if (floorNumber.size() < budynek.id.floorNumber.size())
				System.out.println("Budynek nr: " + buildingNumber + " ma mniej pieter od budynku nr: " + budynek.id.buildingNumber);

		else{
			System.out.println("Budynek nr: " + buildingNumber + " ma tyle samo pieter co budynek nr: " + budynek.id.buildingNumber);
		}
	}
	
	public void compareRooms(Building budynek){
		if(roomNumber.size() != budynek.id.roomNumber.size()){
			if(roomNumber.size() > budynek.id.roomNumber.size())
				System.out.println("Budynek nr: " + buildingNumber + " ma wiecej pokoi od budynku nr: " + budynek.id.buildingNumber);
			else
				System.out.println("Budynek nr: " + buildingNumber + " ma mniej pokoi od budynku nr: " + budynek.id.buildingNumber);
		}
		else{
			System.out.println("Budynek nr: " + buildingNumber + " ma tyle samo pokoi co budynek nr: " + budynek.id.buildingNumber);
		}
	}
}
