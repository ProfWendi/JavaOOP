/*
 * This class models an inventory item with a quantity and price.
*/
public class Item {

	private String itemId;  // the item's id
	private int qty;        // the item's quantity
	private double price;   // the item's price
	
	/*
	Constructs a default item with no item id, a quantity and
	price of 0.
	*/
	public Item() {
	}
	
	/*
	Constructs an item with a specific item id value.
	*/
	public Item(String id) {
		setItemId(id);
	}
	
	/*
	Constructs an item with a specific id, quantity, and price.
	*/
	public Item(String id, int qty, double price) {
		setItemId(id);
		setQty(qty);
		setPrice(price);
	}
	
	public String getItemId() {
		return itemId;
	}
	
	public void setItemId(String id) {
		if (id == null || id.isEmpty()) {
			throw new IllegalArgumentException("Error: item id can't be "
					+ "null or empty.");
		} else {
			itemId = id;
		}
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		if (qty > 0) {
			this.qty = qty;
		} else {
			throw new IllegalArgumentException("Error: quantity must be "
					+ "greater than 0.");
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		} else {
			throw new IllegalArgumentException("Error: price must be "
					+ "0 or greater.");
		}
	}
	
	// get the total value of this item
	public double calculateTotal() {
		return qty * price;
	}
	
	
	// display this item
	public void displayItem() {
		System.out.printf("%s: %d @ $%.2f\n", itemId, qty, price);
	}
	
	/* TODO: add the toString() method to return a String 
	* representation of an Item as:
    * itemId: q @ $p.pp
    * - itemId = the item id
	* - q = the quantity
	* - p.pp = price, formatted to 2 decimal places
	*/
	
	
	
}