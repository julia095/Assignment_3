import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import  org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class computeKiwiSaverImplementationTest {
	
	computeKiwiSaverImplementation obj;
	Employee employee;
	IcomputeKiwiSaver mockobj;
	@Before
	public void setUp() throws Exception {
	obj = new computeKiwiSaverImplementation();
	mockobj = mock(IcomputeKiwiSaver.class);
	employee = new Employee(5000,70000,3);
	when(mockobj.computeKiwiSaver(employee)).thenReturn((employee.salary)*50);
	obj.setObj(mockobj);
	}
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testComputeKiwiSaverIfChooseThree() {
		int expectedResult = 250000;
		assertEquals(expectedResult, obj.computeKiwiSaver(employee));
	}

}
