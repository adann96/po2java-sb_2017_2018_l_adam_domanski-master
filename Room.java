public class Room extends Location {	

	public Room(Building building, Floor floor, int roomNumber){
		floor.id.roomNumber.addElement(new Integer(roomNumber));
		building.id.roomNumber.addElement(new Integer(roomNumber));
		id.roomNumber.addElement(new Integer(roomNumber));
	}

	public void description(){
		System.out.println(id.roomNumber + " pokó.j");
	}
}
