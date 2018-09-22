import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class computeTaxImplementationTest {
	
	computeTaxImplementation obj1,obj2;
	IcomputeTax mockobj1,mockobj2;
	int amount,amount1;

	@Before
	public void setUp() throws Exception {
	obj1 = new computeTaxImplementation();
	obj2 = new computeTaxImplementation();
	mockobj1 = mock(IcomputeTax.class);
	mockobj2 = mock(IcomputeTax.class);
	amount =14000;
	amount1 = 71000;
	
	when(mockobj1.computeTax(amount)).thenReturn((int) (amount*0.1));
	obj1.setObj(mockobj1);
	when(mockobj2.computeTax(amount1)).thenReturn((int) (amount1*0.33));
	obj2.setObj(mockobj2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testComputeTaxMoreandEqual_14000() {
		assertEquals(amount*0.1,obj1.computeTax(amount),0.01);
	}
	@Test
	public final void testComputeTaxMoreandEqual_70000() {
		assertEquals(amount1*0.33,obj2.computeTax(amount1),0.01);
	}

}
