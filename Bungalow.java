
public class Bungalow extends Exoxikikatikia{
	private int DomatioTypeID;

	public Bungalow(String b, int d, int e,int domatio) {
		super( b, d, e);
		DomatioTypeID=domatio;
	}
	public int getDomatioTypeID() {
		return DomatioTypeID;
	}
	public String gettypeName() {
		return "Bungalow";
	}

	@Override
	public String getEnoikioType() {
		return "week";
	}

	@Override
	public void calcEnoikio()throws IllegalArgumentException {

		if (getNrOfDays()>7 && (getNrOfDays()%7)==0) {
			double v=0.9*(getNrOfDays()*getTimiHmeras());
			System.out.println("cost:"+v+"$");
		}else {
			throw new IllegalArgumentException("Einai adinato ligotero apo 7 hmeres");
		}
	}
	public String toString() {
		return  gettypeName()+" "+getPerioxi_Poli()+" "+gettypeID()+" "+getNrOfDays()+getEnoikioType()+" "+getTimiHmeras()+"$/day "+getDomatioTypeID()+Type()+" ";
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
	public int gettypeID() {
		return 2;
	}

}
