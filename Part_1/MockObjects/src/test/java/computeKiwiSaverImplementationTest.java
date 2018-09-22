import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class computeKiwiSaverImplementationTest {
	
	computeKiwiSaverImplementation obj,obj1,obj2;
	Employee employee,employee1,employee2;
	IcomputeKiwiSaver mockobj,mockobj1,mockobj2;
	@Before
	public void setUp() throws Exception {
	obj = new computeKiwiSaverImplementation();
	mockobj = mock(IcomputeKiwiSaver.class);
	employee = new Employee(5000,70000,3);
	when(mockobj.computeKiwiSaver(employee)).thenReturn((int) ((employee.salary)*0.3));
	obj.setObj(mockobj);
	///////////////////////////////////////////////
	obj1 = new computeKiwiSaverImplementation();
	mockobj1 = mock(IcomputeKiwiSaver.class);
	employee1 = new Employee(5000,70000,4);
	when(mockobj1.computeKiwiSaver(employee1)).thenReturn((int) ((employee1.salary)*0.4));
	obj1.setObj(mockobj1);
	///////////////////////////////////////////////
	obj2 = new computeKiwiSaverImplementation();
	mockobj2 = mock(IcomputeKiwiSaver.class);
	employee2 = new Employee(5000,70000,8);
	when(mockobj2.computeKiwiSaver(employee2)).thenReturn((int) ((employee2.salary)*0.8));
	obj2.setObj(mockobj2);
	}
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testComputeKiwiSaverIfChooseThree() {
		assertEquals((employee.salary)*0.3, obj.computeKiwiSaver(employee),0.01);
	}
	@Test
	public void testComputeKiwiSaverIfChooseFour() {
		assertEquals((employee1.salary)*0.4, obj1.computeKiwiSaver(employee1),0.01);
	}
	@Test
	public void testComputeKiwiSaverIfChooseEight() {
		assertEquals((employee2.salary)*0.8, obj2.computeKiwiSaver(employee2),0.01);
	}

}
