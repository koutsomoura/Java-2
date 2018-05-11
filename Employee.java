package Askiki3;


public abstract class  Employee {

	private String eponymia;
	private int PayType;
	
	public Employee(String e, int p) {
		eponymia=e;
		PayType=p;
	}
	
	public String getEponymia() {
		return eponymia;
	}
	public int getPType() {
		return PayType;
	}
	public void setEponymia(String k) {
		this.eponymia=k;
	}
	public void setPType(int k) {
		this.PayType=k;
	}
	public String toString() {
		return "Eponymia: "+eponymia+" PayType: "+PayType;
	}
	abstract public  String getPayType();
}