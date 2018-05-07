
public abstract class  Employee {

	private String eponymia;
	private int PayType;
	
	public Employee(String e, int p) {
		eponymia=e;
		PayType=p;
	}
	public void setEponymia(String e) {
		eponymia=e;
	}
	public void setPType(int t)throws PayTypeException  {
		if (t<0 || t>2) {
			throw new PayTypeException("Synthikh aneparkis");
	
		}else {
			PayType=t;
		}
	}
	public String getEponymia() {
		return eponymia;
	}
	public int getPType() {
		return PayType;
	}
	public String toString() {
		return "Eponymia: "+eponymia+" PayType: "+PayType;
	}
	abstract public  String getPayType() throws PayTypeExceptionMisthotos;
}