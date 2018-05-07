
public class Oromisthios extends Employee implements iOromisthios{

	private double ores_ergasias;
	private double oromisthio;
	public Oromisthios(double ores,double orom,String e, int p) {
		super(e, p);
		ores_ergasias=ores;
		oromisthio=orom;
	}
	public void setOresErgasias(double ores) {
		ores_ergasias=ores;
	}
	public void setOromisthio(double m) {
		oromisthio=m;
	}

	@Override
	public void Katharos_Oromisthiou() {
		double v=ores_ergasias*oromisthio-(ores_ergasias*oromisthio)*0.10;
		System.out.println(" .Katharos oromisthios :"+v);
	}

	@Override
	public String getPayType() {
		return "-oromisthios";
	}

}