
public class Misthotos extends Employee implements iMisthotos {

	private double akatharistos;
	private double kratiseis;
	private double bonus_Paidion;
	private boolean bonus;
	
	public Misthotos( double a, double k, double b, String f, int i) {
		super(f,i);
		akatharistos=a;
		kratiseis=k;
		bonus_Paidion=b;
	}
	public void setAkatharistos(double a) {
		akatharistos=a;
	}public void setKratiseis(double k) {
		kratiseis=k;
	}public void setBonusPaidion(double bonus_in) {
		bonus_Paidion=bonus_in;
	}
	public double getBonusPaidion() {
		return bonus_Paidion;
	}

	public void choose() {
		if (getBonusPaidion()<=0) {
			bonus=false;
		}else {
			bonus=true;
		}
	}
	@Override
	public void Katharos_Misthotou()throws  BonusException{
		choose();
		if (!bonus) {
			throw new BonusException(" To Bonus paidion einai 0, ara o katharos misthos einai:"+(akatharistos-kratiseis));
		}
		double v=akatharistos-kratiseis+bonus_Paidion;
		System.out.println(" .O katharos misthos einai :"+v);
		
	}

	@Override
	public String getPayType()throws PayTypeExceptionMisthotos {
		if (getPType()==0) {
		return "-misthotos";
		}else {
			throw new PayTypeExceptionMisthotos("Eiste stin katigoria Misthotos,me kwdiko 0, parakalw 3anaelen3te ta stoixeia sas");
		}
	}
	
}