public class Floor extends Location {	
	
	public Floor(Building building, int floorNumber){
		building.id.floorNumber.addElement(new Integer(floorNumber));
		id.floorNumber.addElement(new Integer(floorNumber));
		id.buildingNumber = building.id.buildingNumber;
	}
	
	public void description(){
		System.out.println(id.floorNumber + " piêtro ma " + id.roomNumber.size() + " pokoi.");
	}
}
