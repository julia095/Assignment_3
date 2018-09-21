import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class fortnightSalaryImplementationTest {
	
	fortnightSalaryImplementation obj;
	IfortnightSalary mockobj;
	Employee employee;

	@Before
	public void setUp() throws Exception {
		obj = new fortnightSalaryImplementation();
		mockobj = mock(IfortnightSalary.class);
		employee = new Employee(2400,45000,4);
		when(mockobj.fortnightSalary(employee)).thenReturn((employee.income*12)/52);
		obj.setObj(mockobj);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFortnightSalary() {
		assertThat((((employee.income)*12)/52),equalTo(obj.fortnightSalary(employee)));
		//assertThat((((employee.income)*12)/52),equalTo(10384));
	}

}
