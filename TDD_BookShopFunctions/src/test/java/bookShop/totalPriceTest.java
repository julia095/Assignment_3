package bookShop;

//Requirements: create a simple totalPrice calculator for the Book Shop
//

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class totalPriceTest {
	
	public book book1;
	public order order1;
	public int expected;

	@Before
	public void setUp() throws Exception {
						
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTotalPrice() {
		book book1 = new book(1,"Title_of_the_book",45);
		order order1 = new order(1,5);
		int expected = 5*45;		
		assertEquals(expected, order1.totalPrice(order1.book_quantity,book1.book_price),0.1);
		//fail("Not yet implemented");
	}

}
