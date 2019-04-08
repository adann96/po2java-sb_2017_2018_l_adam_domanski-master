public class Zadanie8 {

	public static void main(String[] args) {
		
		Building building1 = new Building();
		Floor floor1 = new Floor(building1,1);
		Floor floor2 = new Floor(building1, 2);
		Room room1 = new Room(building1, floor1, 1);
		Room room2 = new Room(building1, floor1, 2);
		Room room3 = new Room(building1, floor2, 1);
		Room room4 = new Room(building1, floor2, 2);
		Room room5 = new Room(building1, floor2, 3);
		building1.description();
		floor1.description();
		floor2.description();
		room1.description();
		
		Building building2 = new Building();
		Floor floor3 = new Floor(building2, 4);
		Floor floor4 = new Floor(building2, 3);
		Floor floor5 = new Floor(building2,2);
		Room room6 = new Room(building2, floor3, 1);
		Room room7 = new Room(building2, floor3, 2);
		Room room8 = new Room(building2, floor4, 1);
	
		building1.id.compareFloors(building2);
		building1.id.compareRooms(building2);
		building2.id.compareRooms(building1);
	}

}

