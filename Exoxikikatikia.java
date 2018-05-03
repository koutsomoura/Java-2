
public abstract class Exoxikikatikia {

	private String typeName;
	private String Perioxi_Poli;
	private int typeID;
	private int NrOfDays;
	private int TimiHmeras;
	
	public abstract String gettypeName();
	
	public String getPerioxi_Poli() {
		return Perioxi_Poli;
	}
	public abstract int gettypeID();
	public int getNrOfDays() {
		return NrOfDays;
	}
	public int getTimiHmeras() {
		return TimiHmeras;
	}
	
	public Exoxikikatikia(String b, int d, int e) {
		Perioxi_Poli=b;
		NrOfDays=d;
		TimiHmeras=e;
	}
	public abstract String getEnoikioType();
	public abstract void calcEnoikio();
	
}
