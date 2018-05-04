
public abstract class Exoxikikatikia {

	private String typeName;
	private String Perioxi_Poli;
	private int typeID;
	private int NrOfDays;
	private int TimiHmeras;
	
	public Exoxikikatikia(String b, int d, int e) {
		Perioxi_Poli=b;
		NrOfDays=d;
		TimiHmeras=e;
	}
	public void setPoli(String p) {
		Perioxi_Poli=p;
	}
	public  void setType(int t) {
		typeID=t;
	}
	public void setTimiHmeras(int price) {
		TimiHmeras=price;
	}
	public abstract String gettypeName();
	
	public String getPerioxi_Poli() {
		return Perioxi_Poli;
	}
	public abstract int gettypeID();
	
	public void setNrOfDays(int a) {
		NrOfDays=a;
	}
	
	
	public int getNrOfDays() {
		return NrOfDays;
	}
	public int getTimiHmeras() {
		return TimiHmeras;
	}
	
	
	public abstract String getEnoikioType();
	public abstract void calcEnoikio();
	
}
