public class Building extends Location {
	private static int ID=1;

	public Building( ) {
		id.buildingNumber = ID++;
	}

	public void description() {
		System.out.println(id.buildingNumber + " budynek ma "
				+ id.floorNumber.size() + " piêtra i " + id.roomNumber.size()
				+ " pokoi.");
	}
}
