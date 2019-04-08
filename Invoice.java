import java.util.Scanner;
public class Invoice {
	Scanner input = new Scanner(System.in);
	private int ID_Item;
	private int QTYofProducts;
	private String ItemDesc;
	private float ItemPrice;
	
	public Invoice() {
		ID_Item = 1;
		QTYofProducts = 35;
		ItemDesc = "Radiator";
		ItemPrice = (float)124.99;
	}
		
	public int getID_Item() {
		return ID_Item;
	}
	public void setID_Item(int ID_Item) {
		this.ID_Item = ID_Item;
	}
	/*----------------------------------------------------*/
	public int getQTYofProducts() {
		return QTYofProducts;
	}
	public void setQTYofProducts(int QTYofProducts) {
		this.QTYofProducts = QTYofProducts;
	}
	/*----------------------------------------------------*/
	public String ItemDesc() {
		return ItemDesc;
	}
	public void setItemDesc(String ItemDesc) {
		this.ItemDesc = ItemDesc;
	}
	/*----------------------------------------------------*/
	public float getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(float ItemPrice) {
		this.ItemPrice = ItemPrice;
	}
}