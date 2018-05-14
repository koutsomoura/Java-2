package excerise;


public class Oromisthios extends Employee implements iOromisthios{

	private double ores_ergasias;
	private double oromisthio;
	public Oromisthios(double ores,double orom,String e, int p) throws PayTypeExceptionMisthotos, PayTypeExceptionOromisthios  {
		super(e, p);
		if (p!=1) {
			throw new PayTypeExceptionMisthotos("For input type-misthotos "+p+" wrong input (0-Misthoto,1-Oromisthio), please try again:");
		}
		ores_ergasias=ores;
		oromisthio=orom;
	}
	public double getOres_ergasias() {
		return ores_ergasias;
	}
	public double getOromisthio() {
		return oromisthio;
	}
	@Override
	public void Katharos_Oromisthiou() {
		double v=ores_ergasias*oromisthio-(ores_ergasias*oromisthio)*0.10;
		System.out.println(" oromisthios :"+v);
	}

	@Override
	public String getPayType() {
		if(getPType()==1) {
		return "-oromisthios";
		}
		return "-1";
	}
	public String toString() {
		return getEponymia()+" "+getPType()+" "+getPayType()+" "+getOres_ergasias()+" "+getOromisthio();
	}
}
