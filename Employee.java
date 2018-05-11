package Askiki2;

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
	public String toString() {
		return "Eponymia: "+eponymia+" PayType: "+PayType;
	}
	abstract public  String getPayType();
}