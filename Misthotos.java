package Askiki3;


public class Misthotos extends Employee implements iMisthotos {

	private double akatharistos;
	private double kratiseis;
	private double bonus_Paidion;
	private boolean bonus;
	public Misthotos( boolean bonus,double a, double k, double b, String f, int i) {
		super(f,i);
		this.bonus=bonus;
		akatharistos=a;
		kratiseis=k;
		bonus_Paidion=b;
	}
	
	public boolean getBonus() {
		return bonus;
	}
	public double getBonusPaidion() {
		return bonus_Paidion;
	}
	public double getAkatharistos() {
		return akatharistos;
	}
	public double getKratiseis() {
		return kratiseis;
	}
	@Override
	public void Katharos_Misthotou() throws BonusException {
		if (!getBonus()) {
			throw new BonusException("Bonus:0");
		}
		double v=akatharistos-kratiseis+bonus_Paidion;
		System.out.println(" misthos:"+v);		
	}
	public void Katharos_Misthotou_XorisBonus() {
		double v=akatharistos-kratiseis;
		System.out.println(" misthos:"+v);		
	}
	@Override
	public String getPayType(){
			if (getPType()==0) {
				return "misthotos";
			}
		return "-1";
	}
	public String toString(){
		return getEponymia()+" "+getPType()+" "+getPayType()+" "+getAkatharistos()+" "+getKratiseis()+" "+getBonusPaidion()+" ";
	}

}