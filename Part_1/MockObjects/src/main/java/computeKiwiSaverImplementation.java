
public class computeKiwiSaverImplementation implements IcomputeKiwiSaver {
	
	IcomputeKiwiSaver obj;

	public int computeKiwiSaver(Employee kiwiOption) {
		return obj.computeKiwiSaver(kiwiOption);
	}

	public IcomputeKiwiSaver getObj() {
		return obj;
	}

	public void setObj(IcomputeKiwiSaver obj) {
		this.obj = obj;
	}
	
	

}
