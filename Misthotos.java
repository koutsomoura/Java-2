package excerise;

public class Misthotos extends Employee implements iMisthotos {

	private double akatharistos;
	private double kratiseis;
	private double bonus_paidion;
	private boolean bonus;
	
	public Misthotos(boolean bonus,String eponymia, int payType,double a,double k,double b) throws PayTypeExceptionMisthotos, PayTypeExceptionOromisthios  {
		
		super(eponymia, payType);
		if (payType!=0) {
			throw new PayTypeExceptionMisthotos("For input type-misthotos "+payType+" wrong input (0-Misthoto,1-Oromisthio), please try again:");
		}		
		this.bonus=bonus;
		akatharistos=a;
		kratiseis=k;
		bonus_paidion=b;
		
	
	}
	public boolean getBonus() throws BonusException {
		if (bonus) {
			throw new BonusException("Bonus:0");
		}
		return bonus;
	}
	public double getBonusPaidion() {
		return bonus_paidion;
	}
	public double getAkatharistos() {
		return akatharistos;
	}
	public double getKratiseis() {
		return kratiseis;
	}
	@Override
	public void Katharos_Misthtou() {

		double v=akatharistos-kratiseis;
		try {
			getBonus();
			System.out.println("Misthos:"+(v+getBonusPaidion()));
		}catch(BonusException e1) {
			System.out.println(e1.getMessage()+" Misthos:"+v);
		}
		
	}

	@Override
	public String getPayType() {
		if (getPType()==0) {
			return "misthotos";
		}
	return "-1";
	}

	public String toString(){
		return getEponymia()+" "+getPType()+" "+getPayType()+" "+getAkatharistos()+" "+getKratiseis()+" "+getBonusPaidion()+" ";
	}

	
}
