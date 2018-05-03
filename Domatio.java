
public class Domatio extends Exoxikikatikia {
	private int DomatioTypeID;
	
	public Domatio(String b,int d,int e,int domatio) {
		super(b,d,e);
		DomatioTypeID=domatio;
	}
	public int getDomatioTypeID() {
		return DomatioTypeID;
	}
	@Override
	public String getEnoikioType() {
		return "day";
	}
	public String Type() {
		if (getDomatioTypeID()==1) {
			return "-Monoklino";
		}
		else if (getDomatioTypeID()==2) {
			return "-Diklino";
		}
		else if (getDomatioTypeID()==3) {
			return "-Triklino";
		}
		return "";
	}
	@Override
	public void calcEnoikio() {
		double calc=getTimiHmeras()*getNrOfDays();
		System.out.print("cost:"+calc+"$");
	}
	public String toString() {
		return  gettypeName()+" "+getPerioxi_Poli()+" "+gettypeID()+" "+getNrOfDays()+getEnoikioType()+" "+getTimiHmeras()+"$/day "+getDomatioTypeID()+Type()+" ";
	}

	@Override
	public String gettypeName() {
		return "Domatio";
	}
	@Override
	public int gettypeID() {
		return 1;
	}

	
}
