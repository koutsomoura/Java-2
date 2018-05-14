package excerise;

public abstract class Employee {

	private String eponymia;
	private int PayType;

	
	public Employee(String eponymia, int payType)throws PayTypeExceptionMisthotos ,PayTypeExceptionOromisthios {
		super();
		this.eponymia = eponymia;
		PayType = payType;
	}
	
	public int getPType() {
		return PayType;
	}
	public String getEponymia() {
		return eponymia;
	}

	public abstract String getPayType();
	
}
