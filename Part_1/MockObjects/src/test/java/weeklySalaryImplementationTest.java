import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import  org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class weeklySalaryImplementationTest {
	
	weeklySalaryImplementation obj;
	IweeklySalary mockobj;
	Employee employee;

	@Before
	public void setUp() throws Exception {
		obj = new weeklySalaryImplementation();
		mockobj = mock(IweeklySalary.class);
		employee = new Employee(2400,45000,8);
		when(mockobj.weeklySalary(employee)).thenReturn(employee.income/52);
		obj.setObj(mockobj);	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWeeklySalary() {
		assertEquals((employee.income/52),obj.weeklySalary(employee));
	}
	
	
}
