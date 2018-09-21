
public class fortnightSalaryImplementation implements IfortnightSalary {
	IfortnightSalary obj;
	
	public IfortnightSalary getObj() {
		return obj;
	}

	public void setObj(IfortnightSalary obj) {
		this.obj = obj;
	}

	public int fortnightSalary(Employee income) {
		// TODO Auto-generated method stub
		return obj.fortnightSalary(income);
	}

}
