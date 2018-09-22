
public class computeTaxImplementation implements IcomputeTax {
	IcomputeTax obj;
	
	public IcomputeTax getObj() {
		return obj;
	}

	public void setObj(IcomputeTax obj) {
		this.obj = obj;
	}

	public int computeTax(int amount) {
		return obj.computeTax(amount);
	}

}
