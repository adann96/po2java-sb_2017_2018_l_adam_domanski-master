public class AutoShop {

    public static void main(String[] args){

        Sedan sedan1 = new Sedan(160,80000, "yellow", 3500);
        Sedan sedan2 = new Sedan(210, 130000, "pink", 4500);

        Truck truck1 = new Truck(140, 300000, "purple", 3800);

        Hatchback hatchback1 = new Hatchback(200,6400,"blue", 1996);


        System.out.println(sedan1 + " | The whole price: " + sedan1.getSalePrice());
        System.out.println(sedan2 + " | The whole price: " + sedan2.getSalePrice());
        System.out.println(truck1 + " | The whole price: " +  truck1.getSalePrice());
        System.out.println(hatchback1 + " | The whole price: " + hatchback1.getSalePrice());
    }
}
