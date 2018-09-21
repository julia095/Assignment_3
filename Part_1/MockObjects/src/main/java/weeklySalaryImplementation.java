
public class weeklySalaryImplementation implements IweeklySalary {
	
	IweeklySalary obj;
	public IweeklySalary getObj() {
		return obj;
	}
	public void setObj(IweeklySalary obj) {
		this.obj = obj;
	}
	
	public int weeklySalary(Employee income) {
		// TODO Auto-generated method stub
		return obj.weeklySalary(income);
	}

}
