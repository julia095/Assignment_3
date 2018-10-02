package bookShop;

public class order {
	public int order_id;
	public int book_quantity;
	
	public order(int order_id, int book_quantity) {
		super();
		this.order_id = order_id;
		this.book_quantity = book_quantity;
	}

	public double totalPrice(int book_quantity, int book_price) {
		
		return book_quantity*book_price;
	}

}
