public class zdanie4a {

	public static void main(String[] args) {
			Invoice products = new Invoice("Refrigerant", 1, 32, 23.99);
			System.out.println("Whole cost: " + products.getInvoiceAmount());
			System.out.println(products.toString());
			System.out.println(products.getItemPrice());
	}

}
