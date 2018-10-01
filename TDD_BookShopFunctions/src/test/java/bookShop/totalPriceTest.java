package bookShop;

//Requirements: create a simple totalPrice calculator for the Book Shop
//

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class totalPriceTest {

	private Book book1;
	private Book book2;
	private Book book3;
	private order order1;
	
	
	
	@Before
	public void setUp() throws Exception {
		Book book1 = new Book(1, "Name1", 20.5);
		Book book2 = new Book(2, "Name2", 40.5);
		Book book3 = new Book(3, "Name3", 20.4);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTotalPrice() {
		double expected = book1.Price*order1.getCount(book1)+book2.Price*order1.getCount(book2);
		double actual = order1.TotalPrice(book1,book2,book3);
		assertEquals(expected, actual, 0.01);
		//fail("Not yet implemented");
	}

}
