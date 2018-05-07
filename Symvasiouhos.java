
public class Symvasiouhos extends Employee implements iSymvasiouhos{

	private double akatharistos;
	private double kratiseis;
	private int Diarkeia_symvasis;
	public Symvasiouhos(double a,double k, int d,String e, int p) {
		super(e, p);
		akatharistos=a;
		kratiseis=k;
		Diarkeia_symvasis=d;
	}
	public void setAkatharistos(double akatharistos) {
		this.akatharistos=akatharistos;
	}
	public void setKratiseis(double kratiseis) {
		this.kratiseis=kratiseis;
	}
	public void setDiakreia_symvasis(int s) {
		Diarkeia_symvasis=s;
	}
	@Override
	public void Katharos_Symvasiouhou() {

		double v=akatharistos-kratiseis-(akatharistos-kratiseis)*Diarkeia_symvasis/100;
		System.out.println(" .O katharos misthos symvasiouxou: "+v);
	}
	
	@Override
	public String getPayType() {
			return "-symvasiouhos";
	}

}