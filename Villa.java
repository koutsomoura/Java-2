
public class Villa extends Exoxikikatikia {
	private int DomatioTypeID;

	public Villa(String b, int d, int e,int domatio) {
		super(b, d, e);
		DomatioTypeID=domatio;
	}
	public int getDomatioTypeID() {
		return DomatioTypeID;
	}

	@Override
	public String gettypeName() {
		// TODO Auto-generated method stub
		return "Villa";
	}

	@Override
	public int gettypeID() {
		return 3;
	}

	@Override
	public String getEnoikioType() {
		return "month";
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
		if(getNrOfDays()>=30) {
			double v=0.9*(getNrOfDays()*getTimiHmeras());
			System.out.println("cost:"+v+"$");
		}else {
			throw new IllegalArgumentException("Einai adinato ligotero apo 29 hmeres");
		}
	}
	public String toString() {
		return  gettypeName()+" "+getPerioxi_Poli()+" "+gettypeID()+" "+getNrOfDays()+getEnoikioType()+" "+getTimiHmeras()+"$/day "+getDomatioTypeID()+Type()+" ";
	}


}
